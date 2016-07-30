package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Control;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.tritonus.share.sampled.TAudioFormat;
import org.tritonus.share.sampled.file.TAudioFileFormat;

public class Player implements Runnable{
    public static final int UNKNOWN = -1;
    public static final int OPENING = 0;
    public static final int OPENED = 1;
    public static final int PLAYING = 2;
    public static final int STOPPED = 3;
    public static final int PAUSED = 4;
    public static final int RESUMED = 5;
    public static final int SEEKING = 6;
    public static final int SEEKED = 7;
    public static final int EOM = 8;
    public static final int PAN = 9;
    public static final int GAIN = 10;
	public static int EXTERNAL_BUFFER_SIZE = 4000 * 4;
	protected int encodedLength = -1;
    protected AudioInputStream m_encodedaudioInputStream;
    protected AudioInputStream m_audioInputStream;
    protected AudioFileFormat m_audioFileFormat;
    protected SourceDataLine m_line;
    protected String m_mixerName = null;
    protected FloatControl m_gainControl;
    protected FloatControl m_panControl;
    protected Object m_dataSource;
    private int m_status = -1;
    Mixer mixer;
    private File song;
    public Player(String song){
    	this.song = new File(song);
    }
    
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public static void main(String[] args) throws Exception {
		Player player = new Player(args[0]);
		player.getMixer();
		player.play();
	}

	private void play() throws Exception {
//		song = new File("G:/music/ready.ogg");
		m_dataSource = song;
		initAudioInputStream();
		openLine();
		
	}
	
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Mixer getMixer() {
    	if(mixer ==null){
            ArrayList mixers = new ArrayList();
            Mixer.Info[] mInfos = AudioSystem.getMixerInfo();
            if (mInfos != null) {
            	
                for (int i = 0; i < mInfos.length; i++) {
                    Line.Info lineInfo = new Line.Info(SourceDataLine.class);
                    Mixer mixer = AudioSystem.getMixer(mInfos[i]);
                    if (mixer.isLineSupported(lineInfo)) {
                        mixers.add(mInfos[i].getName());
                    }
                }
            }
            Mixer temmixer = null;
            if (mInfos != null) {

                	temmixer = AudioSystem.getMixer(mInfos[0]);
                    m_mixerName = mInfos[0].getName();


            }
             mixer = temmixer;
            
    	}

        return mixer;
    }
    
    protected void reset() {
        m_status = -1;
        if (m_audioInputStream != null) {
            synchronized (m_audioInputStream) {
            	try {
            		if(m_audioInputStream != null){
            			m_audioInputStream.close();
            		}
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        }
        m_audioInputStream = null;
        m_audioFileFormat = null;
        m_encodedaudioInputStream = null;
        encodedLength = -1;
        if (m_line != null) {
            m_line.stop();
            m_line.close();
            m_line = null;
        }
        m_gainControl = null;
        m_panControl = null;
    }
    
    /**
     * Inits AudioInputStream and AudioFileFormat from the data source.
     * @throws BasicPlayerException
     */
    protected void initAudioInputStream() throws Exception {
        try {
            reset();
            initAudioInputStream((File) m_dataSource);
            createLine();
            // Notify listeners with AudioFileFormat properties.
            Map properties = null;
            if (m_audioFileFormat instanceof TAudioFileFormat) {
                // Tritonus SPI compliant audio file format.
                properties = ((TAudioFileFormat) m_audioFileFormat).properties();
                // Clone the Map because it is not mutable.
                properties = deepCopy(properties);
            } else {
                properties = new HashMap();
            }
            // Add JavaSound properties.
            if (m_audioFileFormat.getByteLength() > 0) {
                properties.put("audio.length.bytes", new Integer(m_audioFileFormat.getByteLength()));
            }
            if (m_audioFileFormat.getFrameLength() > 0) {
                properties.put("audio.length.frames", new Integer(m_audioFileFormat.getFrameLength()));
            }
            if (m_audioFileFormat.getType() != null) {
                properties.put("audio.type", (m_audioFileFormat.getType().toString()));
            }
            // Audio format.
            AudioFormat audioFormat = m_audioFileFormat.getFormat();
            if (audioFormat.getFrameRate() > 0) {
                properties.put("audio.framerate.fps", new Float(audioFormat.getFrameRate()));
            }
            if (audioFormat.getFrameSize() > 0) {
                properties.put("audio.framesize.bytes", new Integer(audioFormat.getFrameSize()));
            }
            if (audioFormat.getSampleRate() > 0) {
                properties.put("audio.samplerate.hz", new Float(audioFormat.getSampleRate()));
            }
            if (audioFormat.getSampleSizeInBits() > 0) {
                properties.put("audio.samplesize.bits", new Integer(audioFormat.getSampleSizeInBits()));
            }
            if (audioFormat.getChannels() > 0) {
                properties.put("audio.channels", new Integer(audioFormat.getChannels()));
            }
            if (audioFormat instanceof TAudioFormat) {
                // Tritonus SPI compliant audio format.
                Map addproperties = ((TAudioFormat) audioFormat).properties();
                properties.putAll(addproperties);
            }
            // Add SourceDataLine
            properties.put("basicplayer.sourcedataline", m_line);

        } catch (Exception e) {
            
        }
    }
    private int m_lineCurrentBufferSize = -1;
    private int lineBufferSize = -1;
    protected Thread m_thread = null;
    protected void openLine() throws LineUnavailableException {
        if (m_line != null) {
            AudioFormat audioFormat = m_audioInputStream.getFormat();
            int buffersize = lineBufferSize;
            if (buffersize <= 0) {
                buffersize = m_line.getBufferSize();
            }
            m_lineCurrentBufferSize = buffersize;
            m_line.open(audioFormat, buffersize);
            /*-- Display supported controls --*/
            Control[] c = m_line.getControls();
            /*-- Is Gain Control supported ? --*/
            if (m_line.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                m_gainControl = (FloatControl) m_line.getControl(FloatControl.Type.MASTER_GAIN);
            }
            /*-- Is Pan control supported ? --*/
            if (m_line.isControlSupported(FloatControl.Type.PAN)) {
                m_panControl = (FloatControl) m_line.getControl(FloatControl.Type.PAN);
            }

            if (m_line != null) {
                m_line.start();
                m_status = 2;
                synchronized (m_audioInputStream) {
                    m_audioInputStream.notifyAll();
                }
                
            }
            m_thread = new Thread(this, "BasicPlayer");
            m_thread.start();
        }
    }
    protected Map deepCopy(Map src) {
        HashMap map = new HashMap();
        if (src != null) {
            Iterator it = src.keySet().iterator();
            while (it.hasNext()) {
                Object key = it.next();
                Object value = src.get(key);
                map.put(key, value);
            }
        }
        return map;
    }
    
    /**
     * Inits Audio ressources from file.
     */
    protected void initAudioInputStream(File file) throws UnsupportedAudioFileException, IOException {
        m_audioInputStream = AudioSystem.getAudioInputStream(file);
        m_audioFileFormat = AudioSystem.getAudioFileFormat(file);
    }
    
    protected void createLine() throws LineUnavailableException {
        if (m_line == null) {
            AudioFormat sourceFormat = m_audioInputStream.getFormat();
            int nSampleSizeInBits = sourceFormat.getSampleSizeInBits();
            if (nSampleSizeInBits <= 0) {
                nSampleSizeInBits = 16;
            }
            if ((sourceFormat.getEncoding() == AudioFormat.Encoding.ULAW) || (sourceFormat.getEncoding() == AudioFormat.Encoding.ALAW)) {
                nSampleSizeInBits = 16;
            }
            if (nSampleSizeInBits != 8) {
                nSampleSizeInBits = 16;
            }
            AudioFormat targetFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, sourceFormat.getSampleRate(), nSampleSizeInBits, sourceFormat.getChannels(), sourceFormat.getChannels() * (nSampleSizeInBits / 8), sourceFormat.getSampleRate(), false);
            // Keep a reference on encoded stream to progress notification.
            m_encodedaudioInputStream = m_audioInputStream;
            try {
                // Get total length in bytes of the encoded stream.
                encodedLength = m_encodedaudioInputStream.available();
            } catch (IOException e) {
            }
            // Create decoded stream.
            m_audioInputStream = AudioSystem.getAudioInputStream(targetFormat, m_audioInputStream);
            AudioFormat audioFormat = m_audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat, -1);
            
            if (mixer != null) {
                m_line = (SourceDataLine) mixer.getLine(info);
            } else {
                m_line = (SourceDataLine) AudioSystem.getLine(info);
                m_mixerName = null;
            }

        }
    }
    private long threadSleep = -1;
	@Override
	public void run() {

        int nBytesRead = 1;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
        int readIndex = 0;//所有读进缓冲区的数量
        int writeIndex = 0;//所有写出数量
        // Lock stream while playing.
        synchronized (m_audioInputStream) {
            boolean buffering = false;
            // Main play/pause loop.
            while ((nBytesRead != -1) && (m_status != STOPPED) && (m_status != SEEKING) && (m_status != UNKNOWN)) {
                if (m_status == PLAYING) {
                    // Play.
                    try {
                        nBytesRead = m_audioInputStream.read(abData, 0, abData.length);
                        if (nBytesRead >= 0) {
                            byte[] pcm = new byte[nBytesRead];
                            System.arraycopy(abData, 0, pcm, 0, nBytesRead);
                            if (m_line.available() >= m_line.getBufferSize()) {
//                                buffering = true;
                            }
//                            if(m_line.available()==0){
//                                buffering=false;
//                            }
                            if (buffering == false) {
                                int nBytesWritten = m_line.write(abData, 0, nBytesRead);
                                // Compute position in bytes in encoded stream.
                                int nEncodedBytes = getEncodedStreamPosition();
     

                            }
                        }
                    } catch (Exception e) {
                        m_status = STOPPED;
                    }
                    // Nice CPU usage.
                    if (threadSleep > 0) {
                        try {
                            Thread.sleep(threadSleep);
                        } catch (InterruptedException e) {
                        }
                    }
                } else {
                    synchronized (m_audioInputStream) {
                        try {
                            m_audioInputStream.wait();
                        } catch (InterruptedException ex) {
                        }
                    }
                // Pause
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        log.log(Level.SEVERE, "Thread cannot sleep(500)", e);
//                    }
                }
            }
            // Free audio resources.
            if (m_line != null) {
                m_line.drain();
                m_line.stop();
                m_line.close();
                m_line = null;
            }
            // Close stream.
            try {
                if (m_audioInputStream != null) {
                    m_audioInputStream.close();
                }
            } catch (IOException e) {
            }
        }
        m_status = STOPPED;
    
		
	}
	
    protected int getEncodedStreamPosition() {
        int nEncodedBytes = -1;
        if (m_dataSource instanceof File) {
            try {
                if (m_encodedaudioInputStream != null) {
                    nEncodedBytes = encodedLength - m_encodedaudioInputStream.available();
                }
            } catch (IOException e) {
            //log.debug("Cannot get m_encodedaudioInputStream.available()",e);
            }
        }
        return nEncodedBytes;
    }

}
