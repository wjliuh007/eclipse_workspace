import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParseService extends DefaultHandler{
	private List<Book> books = null;
	private Book book = null;
	private StringBuilder sb = new StringBuilder();
	
	public List<Book> getBooks(InputStream xmlStream) throws Exception{
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		parser.parse(xmlStream, this);
		return books;
	}
	
	@Override
	public void startDocument() throws SAXException {
		books = new ArrayList<Book>();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if("book".equals(qName)){
			book = new Book();
			book.setId(Integer.parseInt(attributes.getValue(0)));
		}
		sb.setLength(0);
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if("book".equals(qName)){
			books.add(book);
			book = null;
		}else if("name".equals(qName)){
			book.setName(sb.toString());
		}else if("price".equals(qName)){
			book.setPrice(getNumValue(sb.toString()));
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