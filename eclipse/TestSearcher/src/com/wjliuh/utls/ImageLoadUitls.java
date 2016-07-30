package com.wjliuh.utls;

import java.awt.Image;
import java.io.File;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class ImageLoadUitls {

	private static HashMap<String,Image> imageMap = new HashMap<String,Image>();
	
	public static Image getImage(String filename) {
		if (imageMap == null) 
			return null;
		Image image = imageMap.get(filename);
		if (image == null) {
			try {
				image = ImageIO.read(new File(ImageLoadUitls.getImageDir(), filename).toURI().toURL());

				imageMap.put(filename, image);
			} catch (Exception e) {
				return null;
			}
		}
		return image;
	}
	
	public static String getImageDir() {
		return "images";
	}
}
