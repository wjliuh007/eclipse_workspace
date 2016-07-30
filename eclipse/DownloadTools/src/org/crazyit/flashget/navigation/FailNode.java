package org.crazyit.flashget.navigation;

import javax.swing.ImageIcon;

import org.crazyit.flashget.util.ImageUtil;

public class FailNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.FAIL_NODE_IMAGE;
	}

	public String getText() {
		return "œ¬‘ÿ ß∞‹";
	}

}
