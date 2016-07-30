package com.wjliuh.contact;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.Serializable;

import org.w3c.dom.views.AbstractView;
import org.w3c.dom.views.DocumentView;

public class Contact extends BufferedReader implements Serializable,
	AbstractView {
    public Contact(Reader in) {
	super(in);

    }

    private String UID;
    private String name;
    private String phone1;
    private String phone2;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPhone1() {
	return phone1;
    }

    public void setPhone1(String phone1) {
	this.phone1 = phone1;
    }

    public String getPhone2() {
	return phone2;
    }

    public void setPhone2(String phone2) {
	this.phone2 = phone2;
    }

    @Override
    public DocumentView getDocument() {
	// TODO Auto-generated method stub
	return null;
    }

    public String getUID() {
	return UID;
    }

    public void setUID(String uID) {
	UID = uID;
    }

}