package com.wjliuh.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class ReadByByte {

    /**
     * @param args
     */
    public static void main(String[] args) {

	System.out.println(Math.pow(16, 2));
    }

    @Test
    public void read() {
	try {
	    File file = new File("G:\\classfile\\contact.class");
	    getContent(file);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public byte[] getContent(File file) throws IOException {
	FileInputStream fi = new FileInputStream(file);
	
	//读取魔数
	String magic = readMagic(fi);
	System.out.println(String.format("Magic:%s", magic));
	//读取主次版本号
	String version = readVersion(fi);
	System.out.println(String.format("Version:%s", version));
	//读取正文
	String content = readContent(fi);
	System.out.println(String.format("Content:%s", content));
	
	return null;
    }

    private String readContent(FileInputStream fi) throws IOException {
	byte[] buffer = new byte[2];
	fi.read(buffer);
	int conCount = hexToDecimal(byteToHexStr(buffer));
	
	
	
	
	
	
	
	
	
	return byteToHexStr(buffer);
    }

    private String readVersion(FileInputStream fi) throws IOException  {
	byte[] buffer = new byte[4];
	fi.read(buffer);
	
	int length = buffer.length;
	StringBuilder result = new StringBuilder();
	for (int i = 0; i < length; i++) {
	    result.append(buffer[i] & 0xFF);
	}
	
	return result.toString();
    }

    private String readMagic(FileInputStream fi) throws IOException  {
	byte[] buffer = new byte[4];
	fi.read(buffer);
	return byteToHexStr(buffer);
    }

    /**
     * 字节串转16进制字符串
     * @param buffer
     * @return
     */
    public String byteToHexStr(byte[] buffer) {
	int length = buffer.length;
	StringBuilder result = new StringBuilder();
	for (int i = 0; i < length; i++) {
	    result.append(Integer.toHexString(buffer[i] & 0xFF));
	}

	return result.toString();
    }
    
    
    public int hexToDecimal(String hexStr) {
	int length = hexStr.length();
	int sum = 0;
	for(int i=0;i<length;i++) {
	    sum += Integer.parseInt(hexStr.substring(i, i+1)) * Math.pow(16, length-i-1);
	}
	return sum;
    }

}
