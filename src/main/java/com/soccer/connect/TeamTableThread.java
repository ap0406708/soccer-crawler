package com.soccer.connect;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

/*
 * 球队列表
 * @author Jancky Wong
 * @since 1.0.0
 */
public class TeamTableThread extends ConnectThread{

	public TeamTableThread(String url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void analyse(HtmlPage page) {
		// TODO Auto-generated method stub
		
		//HtmlTable table =  (HtmlTable) page.getByXPath("//table[@class='list_1']").get(0);
		
		// 使用jsoup解析页面
		Document doc = Jsoup.parse(page.asXml());
		Element table = doc.select("table.list_1").first();
		
		Elements trs = table.select("tr");
		
		for(int i=0;i<trs.size();i++)
		{
			Elements tds = trs.select("td");
			{
				for(int j=0;j<tds.size();j++)
				{
					String txt = tds.get(j).text();
	                System.out.println(txt+" ");
	                
				}
			}
		}
		
	}

}
