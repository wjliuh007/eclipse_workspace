package com.wjliuh.parse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.htmlparser.jericho.Attribute;
import net.htmlparser.jericho.Attributes;
import net.htmlparser.jericho.Element;

public class InputTagFactory {

	private static InputTagFactory instance;

	public static InputTagFactory getInstance() {
		if (instance == null) {
			instance = new InputTagFactory();
		}
		return instance;
	}

	private InputTagFactory() {

	}
	
	public List<InputTag> make(List<Element> inputElements){
		if(inputElements == null || inputElements.size() ==0){
			return null;
		}
		List<InputTag> result = new ArrayList<InputTag>();
		InputTag tag = null;
		Iterator<Element> inputs = inputElements.iterator();
		Element input = null;
		while(inputs.hasNext()){
			input = (Element)inputs.next();
			tag = new InputTag();
			 Attributes as = input.getStartTag().getAttributes();
			 Iterator<Attribute> attr =as.iterator();
			 while(attr.hasNext()){
				 Attribute a = attr.next();
				 if("type".equals(a.getName())){
					 tag.setType(a.getValue());
				 }
				 if("name".equals(a.getName())){
					 tag.setName(a.getValue());
				 }
				 if("value".equals(a.getName())){
					 tag.setValue(a.getValue());
				 }
				 if("checked".equals(a.getName())){
					 tag.setValue("on");
				 }
			 }
			 result.add(tag); 
			 
			 
		}
		
		
		
		
		return result;
		
	}
}
