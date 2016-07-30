package com.wjliuh.parser;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.jsoup.parser.Parser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.wjliuh.entity.AQIEntity;


public class HtmlParser extends DefaultHandler {
	private AQIEntity entity = null;
	private StringBuilder sb = new StringBuilder();

	public AQIEntity getAQIEntity(InputStream xmlStream) throws Exception{
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		parser.parse(xmlStream, this);
		return entity;
	}

	
	@Override
	public void startDocument() throws SAXException {
		entity = new AQIEntity();
	}
	
	@Override
	public void startElement(String uri, String localName, String node, Attributes attributes) throws SAXException {
		if("div".equals(node)){
			sb.setLength(0);
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String node)
			throws SAXException {
		sb.setLength(0);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		sb.append(ch, start, length);
	}
	
	private float getNumValue(String defValue){
		float value = 0L;
		if(defValue !=null){
			value = new Float(defValue);
		}
		return value;
	}
}
