package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author chensiyu04
 * @createdate 2011/8/20
 */
public class AutoComponent extends JPanel implements ActionListener {

    private static final int LIST_CELL_WIDTH = 70;
    private LinkedList dataBox;
    private JScrollPane sp;
    private int index = 0;
    private int currentResolution = 50;
    private long cycleStart;
    private Timer timer = null;
    private final int MOVE_TIME = 2000;
    private int moveMinX;
    private int moveMaxX;
    private int moveX;
    private ActionListener moveActionListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            moveMinX = index * LIST_CELL_WIDTH;
            moveMaxX = moveMinX + LIST_CELL_WIDTH;
            startTimer(currentResolution);
        }
    };

    public AutoComponent() {
        init();
    }

    private void init() {
        setLayout(new BorderLayout(0, 0));
        JButton leftButton = new JButton("<<");
        leftButton.addActionListener(moveActionListener);
        leftButton.setPreferredSize(new Dimension(70, 70));
        add(leftButton, BorderLayout.WEST);

        JButton rightButton = new JButton(">>");
        rightButton.setPreferredSize(new Dimension(70, 70));
        add(rightButton, BorderLayout.EAST);
        initDataBox();

        JList list = new JList();
        list.setFixedCellHeight(65);
        list.setFixedCellWidth(LIST_CELL_WIDTH);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(1);

        sp = new JScrollPane(list, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        add(sp, BorderLayout.CENTER);
    }

    private void initDataBox() {
        dataBox = new LinkedList();
        for (int i = 0; i < 10; i++) {
        	Node element = new Node("Node_" + i);
            dataBox.addLast(element);
        }
    }

    public void animate(float fraction) {
        float animationFactor = (float) Math.sin(fraction * (float) Math.PI / 2);
        animationFactor = Math.min(animationFactor, 1.0f);
        animationFactor = Math.max(animationFactor, 0.0f);
        moveX = moveMinX + (int) (.5f + animationFactor * (float) (moveMaxX - moveMinX));
        if (moveX >= moveMaxX) {
            moveX = moveMaxX;
            timer.stop();
            cycleStart = 0;
            index++;
        }
        sp.getHorizontalScrollBar().setValue(moveX);
    }

    private void startTimer(int resolution) {
        if (timer == null) {
            timer = new Timer(resolution, this);
        }
        if (!timer.isRunning()) {
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        long currentTime = System.nanoTime() / 1000000;
        long totalTime = currentTime - cycleStart;

        if (totalTime > MOVE_TIME) {
            cycleStart = currentTime;
        }
        float fraction = (float) totalTime / MOVE_TIME;
        fraction = Math.min(1.0f, fraction);
        fraction = 1 - Math.abs(1 - (2 * fraction));
        animate(fraction);
    }

    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 70);
        frame.getContentPane().add(new AutoComponent());
        frame.setUndecorated(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(((int)dim.getWidth()-frame.getWidth())/2, ((int)dim.getHeight()-frame.getHeight())/2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                frame.setVisible(true);
            }
        });
    }
}

class Node{
	private Node header;
	private Node tail;
	private Object data;
	
	public Node(){
		
	}
	public Node(String title){
		this.data = title;
		header = new Node();
		tail = new Node();
		tail.setHeader(tail);
	}
	public Node getHeader() {
		return header;
	}
	public void setHeader(Node header) {
		this.header = header;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}