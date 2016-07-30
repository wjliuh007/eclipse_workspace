package com.wjliuh.audio;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagField;

public class ParserAudio {
	static Logger log = Logger.getLogger(ParserAudio.class.getName());
	public static void main(String[] args) throws Exception{
		
		File file = new File("G:\\music\\最想听\\曲婉婷承认.mp3");
		System.out.println(getMp3TrackLength(file));
		FileInputStream is = new FileInputStream(file);
		System.out.println(extact(is));
	}
	
	public static int getMp3TrackLength(File mp3File) {
		try {
			MP3File f = (MP3File)AudioFileIO.read(mp3File);
			Iterator<TagField> tag = f.getID3v2TagAsv24().getFields();
			String a = new String(tag.next().getRawContent(),"ISO8859-1");
			log.log(Level.INFO, a);
			MP3AudioHeader audioHeader = (MP3AudioHeader)f.getAudioHeader();
			return audioHeader.getTrackLength();	
		} catch(Exception e) {
			return -1;
		}
	}
	
	@SuppressWarnings("static-access")
	public static String extact(InputStream is) throws Exception{
		net.sourceforge.docfetcher.model.parse.MP3Parser p = new net.sourceforge.docfetcher.model.parse.MP3Parser();
		return p.extract(is, true);
	}

}
