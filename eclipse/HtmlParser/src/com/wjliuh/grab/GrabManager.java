package com.wjliuh.grab;

import java.util.HashMap;

public class GrabManager {

	private HashMap<String,String> links = new HashMap<String,String>();

	private static GrabManager grab = null;
	private GrabManager(){
		
	}
	
	public static GrabManager getInstance(){
		if(null == grab){
			grab = new GrabManager();
		}
		return grab;
	}
	
	public synchronized String getLink() {
		if(links.keySet()==null)
			return null;
		String[] keys = links.keySet().toArray(new String[0]);
		String result = new String(links.get(keys[0]).getBytes());
		links.remove(keys[0]);
		return result;
	}

	public synchronized void addLink(String link) {
		links.put(link, link);
	}

	public HashMap<String, String> getLinks() {
		return links;
	}

	public void setLinks(HashMap<String, String> links) {
		this.links = links;
	}

	
}
