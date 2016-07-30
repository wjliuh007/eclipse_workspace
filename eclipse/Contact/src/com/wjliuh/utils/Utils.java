package com.wjliuh.utils;

import com.wjliuh.contact.Contact;

public class Utils {

    public String getFirstName(String fullname) {
	if(null != fullname && fullname.trim().length() != 0 ) {
	    return fullname.trim().substring(0, 1);
	}
	return "";
    }
    
    /**
     * BEGIN:VCARD
     * VERSION:3.0
     * N:常;悦晖;;;
     * FN:常悦晖
     * UID:753414059
     * TEL;TYPE=OTHER,PREF:17951043262057782
     * END:VCARD
     * @param contact
     * @return
     */
    public String generateContact(Contact contact) {
	StringBuilder sb = new StringBuilder();
	sb.append("BEGIN:VCARD").append("\n");
	sb.append("VERSION:3.0").append("\n");
	sb.append("N:").append(getFirstName(contact.getName())).append("\n");
	sb.append("FN:").append(contact.getName()).append("\n");
	sb.append("UID:").append(contact.getUID()).append("\n");
	sb.append("TEL;TYPE=OTHER,PREF:").append(contact.getPhone1()).append("\n");
	sb.append("END:VCARD").append("\n\n");
	return sb.toString();
    }
}
