package com.wjliuh.test;

import com.wjliuh.lucene.QuickFind;

public class Test {
	
	@org.junit.Test
	public void testIndex() throws Exception{
		QuickFind qf = new QuickFind();
		qf.createIndex();
	}
	
	@org.junit.Test
	public void testSearch() throws Exception{
		QuickFind qf = new QuickFind();
		qf.searcher();
	}
}
