package com.wjliuh.contact;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyContact {

    public static void main(String[] agrs) {
	try {
	    InputStream is = MyContact.class.getResourceAsStream("56714781.vcf");
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    String line = "";
	    String value = "";
	    while ((line = br.readLine()) != null) {

		if (line.startsWith("FN:")) {
		    System.out.print(line.replace("FN:", "") + " :");
		}
		if (line.startsWith("TEL;TYPE=")) {
		    value = line.substring(line.indexOf(":")+1);
		    System.out.println(value);
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}


