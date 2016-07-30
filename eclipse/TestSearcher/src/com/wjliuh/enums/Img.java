package com.wjliuh.enums;

import java.awt.Image;

import com.wjliuh.itf.FilenameProvider;
import com.wjliuh.utls.ImageLoadUitls;

public enum Img implements FilenameProvider {
	
	TS_32 ("ts_32.png"),
	TS_48 ("ts_48.png"),
	TS_64 ("ts_64.png"),
	TS_72 ("ts_72.png"),
	TS_96 ("ts_96.png"),
	TS_128 ("ts_128.png"),
	/////////
	CONFIG("con.gif"),
	ADD ("add.gif"),
	CHECK("check.gif"),
	HELP ("help.gif"),
	INFO ("info.gif"),
	PREFERENCES ("preferences.gif"),
	LETTERS ("letters.gif"),
	INDEXING ("indexing.gif"),
	MINIMIZE ("minimize.gif"),
	MAXIMIZE ("maximize.gif"),
	HIDE ("hide.gif"),
	RESTORE ("restore.png"),
	INDEXING_DIALOG ("indexing_dialog.gif"),
	WARNING ("warning.gif"),
	WARNING_BIG ("warning_big.gif"),
	ARROW_LEFT ("arrow_left.gif"),
	ARROW_RIGHT ("arrow_right.gif"),
	ARROW_UP ("arrow_up.gif"),
	ARROW_DOWN ("arrow_down.gif"),
	STAR ("star.gif"),
	STOP ("stop.gif"),
	REFRESH ("refresh.gif"),
	WINDOW ("program.gif"),
	FOLDER ("folder.gif"),
	FILE ("file.gif"),
	EMAIL ("email.gif"),
	PACKAGE ("package.gif"),
	CLIPBOARD ("clipboard.gif"),
	REMOVE ("remove.gif"),
	LIST ("list.gif"), 
	TREE ("tree.gif"),
	BROWSER ("browser.gif"),
	BUILDING_BLOCKS ("building_blocks.gif"),
	HIGHLIGHT ("highlight.gif"),
	;
	
	private final String filename;
	
	private Img(String filename) {
		this.filename = filename;
	}
	
	/**
	 * Returns the <tt>Image</tt> object corresponding to this enumeration
	 * constant. It is disposed of automatically after program termination. If
	 * the image cannot be loaded, null is returned.
	 */
	
	public Image get() {
		return ImageLoadUitls.getImage(filename);
	}

	
	public String getFilename() {
		return filename;
	}

}
