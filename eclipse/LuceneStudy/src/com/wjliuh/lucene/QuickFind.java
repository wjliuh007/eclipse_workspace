package com.wjliuh.lucene;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MultiTermQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.MultiTermQuery.RewriteMethod;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class QuickFind {
	
	/**
	 * 创建索引
	 * @throws Exception 
	 */
	@SuppressWarnings("deprecation")
	public void createIndex() throws Exception{
		//1，创建Directory
//		Directory directory = new RAMDirectory();//建立在内存中
		Directory directory = FSDirectory.open(new File("G:/licene/first/test"));
		//2，创建IndexWriter
		IndexWriterConfig iwc = new IndexWriterConfig(Version.LUCENE_4_9, new StandardAnalyzer(Version.LUCENE_4_9));
		IndexWriter writer = null;
		try{
			writer = new IndexWriter(directory,iwc);
			//3创建Document对象
			Document doc = null;
			
			File f= new File("G:/luncene");
			for(File file:f.listFiles()){
				doc = new Document();
				doc.add(new Field("content",new FileReader(file)));
				doc.add(new Field("filename",file.getName(),Field.Store.YES,Field.Index.NOT_ANALYZED));
				doc.add(new Field("path",file.getAbsolutePath(),Field.Store.YES,Field.Index.NOT_ANALYZED));
				writer.addDocument(doc);
			}
			
			
			
			
		}catch(Exception ex){
			
		}finally{
			writer.close();
		}
		

	}
	
	public void searcher() throws Exception{
		//1，创建Directory
		Directory directory = FSDirectory.open(new File("G:/licene/first/test"));

		//2，创建IndexReader
		IndexReader reader = IndexReader.open(directory);
		//3,根据IndexReader创建IndexSearcher
		IndexSearcher searcher = new IndexSearcher(reader);
		//创建搜索的Query
		QueryParser parser = new QueryParser(Version.LUCENE_35, "contents",new StandardAnalyzer(Version.LUCENE_35));
		parser.setAllowLeadingWildcard(true);
		RewriteMethod rewriteMethod = MultiTermQuery.SCORING_BOOLEAN_QUERY_REWRITE;
		parser.setMultiTermRewriteMethod(rewriteMethod);
//		parser.setDefaultOperator(QueryParser.AND_OPERATOR);
		
		Query query = parser.parse("预留子项"); 
		
		
		// 5根据searcher
		TopDocs tds = searcher.search(query, 10);
		
		ScoreDoc[] sds = tds.scoreDocs;
		
		for(ScoreDoc sd:sds){
			Document d = searcher.doc(sd.doc);
			float score = sd.score;
			System.out.println(score);
			System.out.println(d.get("title")+"["+d.get("path")+"]");
		}
		reader.close();
		
	}

}
