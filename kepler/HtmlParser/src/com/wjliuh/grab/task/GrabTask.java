package com.wjliuh.grab.task;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.select.NodeTraversor;

import com.wjliuh.grab.GrabManager;
import com.wjliuh.grab.GrabVistor;

public class GrabTask implements Runnable {
	private static final String userAgent = "Mozilla/5.0 (jsoup)";
	private static final int timeout = 5 * 1000;
	private String keyWord = null;
	static Logger log;
	private GrabManager manager;
	private String taskName;
	public GrabTask(GrabManager manager,String keyWord,String taskName){
		this.manager = manager;
    	this.keyWord = keyWord;
    	this.taskName= taskName;
	}
	
	@Override
	public void run() {
		log = Logger.getLogger(taskName);

		GrabVistor visitor = new GrabVistor(manager, keyWord);
		NodeTraversor traversor = new NodeTraversor(visitor);
		String url = null;

			while (manager.getLinks().size()>0) {
				try{
					url = manager.getLink();
					if(null !=url && !manager.getHaveGrabed().containsKey(url)){
//						log.log(Level.INFO, url);
						traversor.traverse(Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get());
						manager.addHaveGrabed(url);
						log.log(Level.INFO, String.format(" %s<=>%s", Thread.currentThread().getName(),url));
					}
					
				}catch(Exception io){
					continue;
				}
			}


	}

}
