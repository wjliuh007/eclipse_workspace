package test;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Test extends JFrame {
    static List<OOMObject> lit = new ArrayList<OOMObject>();

    public static void main(String[] args) throws Exception {
	Test t = new Test();
	Image icon = null;
	icon = ImageIO.read(t.getClass().getResource("waiting.gif"));
	File f = new File(t.getClass().getResource("waiting.gif").toURI());
	GifComponent gc = new GifComponent(f, 20);
	t.add(gc);
	t.setSize(300, 200);
	t.setVisible(true);

	while (true) {
	    lit.add(new OOMObject());
	}

    }

}

class OOMObject {
    public OOMObject() {

    }
}
