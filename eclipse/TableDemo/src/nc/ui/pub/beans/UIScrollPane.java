package nc.ui.pub.beans;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTree;

/**
 */
public class UIScrollPane extends javax.swing.JScrollPane {
    public UIScrollPane() {
        super();
        setBorder(null);
    }

    public UIScrollPane(int p0, int p1) {
        super(p0, p1);
        setBorder(null);
    }

    public UIScrollPane(java.awt.Component p0) {
        super(p0);
        setPaneBorder(p0);
    }

	private void setPaneBorder(java.awt.Component p0)
	{
		if (p0 instanceof JTree || p0 instanceof JList) 
		{
            setBorder(BorderFactory.createLineBorder(Color.black));
        }
		else if(p0 instanceof JTextArea)
		{
			((JTextArea)p0).setBorder(null);
			setBorder(BorderFactory.createLineBorder(Color.black));
		}
        else
        {
        	setBorder(null);
        }
	}

    public UIScrollPane(java.awt.Component p0, int p1, int p2) {
        super(p0, p1, p2);
        setPaneBorder(p0);
    }

    public boolean isFocusable() {
        return false;
    }

    /*
     * @see javax.swing.JScrollPane#setViewportView(java.awt.Component)
     */
    public void setViewportView(Component view) {
        if (view instanceof JTree || view instanceof JList) {
            setBorder(BorderFactory.createLineBorder(Color.white));
        }
        else if(view instanceof JTextArea)
		{
			((JTextArea)view).setBorder(null);
			setBorder(BorderFactory.createLineBorder(Color.white));
		}
        super.setViewportView(view);
    }

//    protected void processMouseWheelEvent(MouseWheelEvent e) {
//        MouseWheelEvent newMWE = new MouseWheelEvent((Container)e.getSource(), 
//                e.getID(), e.getWhen(), e.getModifiers(), e.getX(), 
//                e.getY(),
//                e.getClickCount(), e.isPopupTrigger(),MouseWheelEvent.WHEEL_BLOCK_SCROLL,// e.getScrollType(), 
//                e.getScrollAmount(),
//                e.getWheelRotation());
//        super.processMouseWheelEvent(newMWE);
//    }

}