package com.soccer.connect;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

/*
 * 球队
 * @author Jancky Wong
 * @since 1.0.0
 */
public class TeamInfoThread extends ConnectThread{

	public TeamInfoThread(String url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void analyse(HtmlPage page) {
		// TODO Auto-generated method stub
		
		//可否连着查？
		//HtmlHeading1 h1 = (HtmlHeading1) page.getByXPath("//div[@class='player_stat']//h1[@class='name']").get(0);
		
		//HtmlSpan span = (HtmlSpan) page.getByXPath("//div[@class='player_stat']//span[@class='en_name']").get(0);
		
		//HtmlUnorderedList ul = (HtmlUnorderedList) page.getByXPath("//div[@class='player_stat']//ul[@class='detail_info']").get(0);
		
		// 使用jsoup解析页面
		Document doc = Jsoup.parse(page.asXml());
		Element teamInfo = doc.select("div.player_stat").first();	
		
		Element baseInfo = teamInfo.selectFirst("div.base_info");
		Element teamNameCnElement = baseInfo.selectFirst("div > h1.name");
		String teamNameCn = teamNameCnElement.text();
		Element teamNameEnElement = baseInfo.selectFirst("div > span.en_name");
		String teamNameEn = teamNameEnElement.text();
		
		System.out.println("teamNameCn:"+teamNameCn);
		System.out.println("teamNameEn:"+teamNameEn);
		
		Element detailInfo = teamInfo.selectFirst("ul.detail_info");
		Elements detailInfoElements = detailInfo.select("li");
		
		String[] detailInfos = null;
		if(detailInfoElements.size()>0)
		{
			detailInfos = new String[detailInfoElements.size()];
			for(int i=0;i<detailInfoElements.size();i++) {
				detailInfos[i]=detailInfoElements.get(i).select("span").get(2).text();
			}
		}
		else 
		{
			detailInfos = new String[7];
		}
		
		for (String ss : detailInfos) {
			System.out.println("ss:"+ss);
		}
		
	}

}
