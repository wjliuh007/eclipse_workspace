package com.wjliuh.parse;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

import com.wjliuh.utils.NetUtils;

public class HtmlParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HtmlParser hp = new HtmlParser();
		hp.getSource();
		List<Element> forms = hp.getSource().getAllElements(HTMLElementName.FORM);
		Element form = forms.get(0);
		List<Element> list=form.getContent().getAllElements(HTMLElementName.INPUT);

		List<InputTag> inputs = InputTagFactory.getInstance().make(list);
		System.out.println(inputs.size());

	}

	private Source source;
	private String[] tags = new String[] { "act", "agreement", "email",
			"extcode", "forbin", "imgvcode", "psw", "r", "showcode", "swfimgsk" };
	private List<String> taglist = null;
	
	private String url = "https://mail.sina.com.cn/register/regmail.php";

	public HtmlParser() {
		setTaglist(Arrays.asList(tags));
	}

	public Source getSource() {
		if (source == null) {
			HttpURLConnection myurlcon = NetUtils.getConnection(url);
			try {
				source = new Source(myurlcon.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return source;
	}

	public List<String> getTaglist() {
		return taglist;
	}

	public void setTaglist(List<String> taglist) {
		this.taglist = taglist;
	}

}
