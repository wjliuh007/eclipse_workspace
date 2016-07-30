/*
 * ImageInfoRenderer.java
 *
 * Copyright 2007 Sun Microsystems, Inc. ALL RIGHTS RESERVED Use of 
 * this software is authorized pursuant to the terms of the license 
 * found at http://developers.sun.com/berkeley_license.html.
 */

package com.sun.demo.swingworker;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;

/**
 *
 * @author John O'Conner
 */
public class ImageInfoRenderer extends DefaultListCellRenderer {
    
    
    public Component getListCellRendererComponent(JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {
        
        ImageInfo info = (ImageInfo) value;
        String text = info.getTitle();
        Icon thumbnail = info.getThumbnail();
        this.setIcon(thumbnail);
        this.setText(text);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        System.out.println("原来在这里");
        return this;
    }
   
}
