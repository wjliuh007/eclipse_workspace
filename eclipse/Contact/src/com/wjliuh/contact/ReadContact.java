package com.wjliuh.contact;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadContact {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	new ReadContact().read();
    }

    private void read() {
	try {
	    InputStream is = MyContact.class
		    .getResourceAsStream("56714781.vcf");
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    String line = "";
	    String value = "";
	    int num = 0;
	    while ((line = br.readLine()) != null) {

		if (line.equals("BEGIN:VCARD")) {
		    num = 0;
		}
		System.out.println(line);
		num++;
	    }
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
