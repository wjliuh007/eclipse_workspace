package com.wjliuh.searchbox;

import java.io.File;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MultiTermQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.MultiTermQuery.RewriteMethod;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;

public class SearchTest {

	public static void main(String[] args) throws Exception{
		Directory direct = FSDirectory.open(new File("G:/licene/first"));
		
//		PhraseDetectingQueryParser queryParser = new PhraseDetectingQueryParser(
//				IndexRegistry.LUCENE_VERSION, Fields.CONTENT.key(), IndexRegistry.getAnalyzer());
//			queryParser.setAllowLeadingWildcard(true);
//			RewriteMethod rewriteMethod = MultiTermQuery.SCORING_BOOLEAN_QUERY_REWRITE;
//			queryParser.setMultiTermRewriteMethod(rewriteMethod);
//			if (!SettingsConf.Bool.UseOrOperator.get())
//				queryParser.setDefaultOperator(QueryParser.AND_OPERATOR);
	}
	
	@Test
	public void searcher() throws Exception{
		//1，创建Directory
		Directory directory = FSDirectory.open(new File("G:/licene/first/test"));

		//2，创建IndexReader
		IndexReader reader = IndexReader.open(directory);
		//3,根据IndexReader创建IndexSearcher
		IndexSearcher searcher = new IndexSearcher(reader);
		//创建搜索的Query
		QueryParser parser = new QueryParser(Version.LUCENE_30, "contents",new StandardAnalyzer(Version.LUCENE_30));
		parser.setAllowLeadingWildcard(true);
		RewriteMethod rewriteMethod = MultiTermQuery.SCORING_BOOLEAN_QUERY_REWRITE;
		parser.setMultiTermRewriteMethod(rewriteMethod);
//		parser.setDefaultOperator(QueryParser.AND_OPERATOR);
		
		Query query = parser.parse("预留"); 
		
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
