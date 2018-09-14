package com.soccer.connect;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/*
 * 联赛
 * @author Jancky Wong
 * @since 1.0.0
 */
public class LeagueInfoThread extends ConnectThread {

	private static final Logger log = LoggerFactory.getLogger(LeagueInfoThread.class);
	
	public LeagueInfoThread(String url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void analyse(HtmlPage page) {
		// TODO Auto-generated method stub

		//HtmlDivision div = page.getHtmlElementById("stat_list");
		
		// 使用jsoup解析页面
		Document doc = Jsoup.parse(page.asXml());

		Element divElement = doc.getElementById("stat_list");
		Elements aElements = divElement.select("a");
		
		for (Element element : aElements) {
			log.info(element.text());
		}

	}

}
