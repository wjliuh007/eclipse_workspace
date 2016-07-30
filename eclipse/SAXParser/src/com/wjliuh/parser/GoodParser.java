package com.wjliuh.parser;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.wjliuh.entity.Good;

public class GoodParser extends DefaultHandler{
	private List<Good> goods = null;
	private Good good = null;
	private StringBuilder sb = new StringBuilder();

	public List<Good> getGoods(InputStream xmlStream) throws Exception{
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		parser.parse(xmlStream, this);
		return goods;
	}

	
	@Override
	public void startDocument() throws SAXException {
		goods = new ArrayList<Good>();
	}
	
	@Override
	public void startElement(String uri, String localName, String node, Attributes attributes) throws SAXException {
		if("good".equals(node)){
			good = new Good();
			good.setCode(attributes.getValue(0));
		}
		sb.setLength(0);
	}

	@Override
	public void endElement(String uri, String localName, String node)
			throws SAXException {
		if("good".equals(node)){
			goods.add(good);
			good = null;
		}else if("name".equals(node)){
			good.setName(sb.toString());
		}else if("weight".equals(node)){
			good.setWeight(getNumValue(sb.toString()));
		}else if("price".equals(node)){
			good.setPrice(getNumValue(sb.toString()));
		}else if("brand".equals(node)){
			good.setBrand(sb.toString());
		}else if("orign".equals(node)){
			good.setOrign(sb.toString());
		}
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
