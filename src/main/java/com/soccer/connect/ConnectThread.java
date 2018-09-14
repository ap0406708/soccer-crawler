package com.soccer.connect;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public abstract class ConnectThread extends Thread {

	private String url;

	public ConnectThread(String url) {
		super();
		this.url = url;
	}

	public abstract void analyse(HtmlPage page);

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		HtmlPage page = connect();
		analyse(page);

	}

	public HtmlPage connect() {

		// WebClient webClient = new WebClient(BrowserVersion.FIREFOX_52);

		// 1创建WebClient
		WebClient webClient = new WebClient(BrowserVersion.CHROME);
		// 2 启动JS
		webClient.getOptions().setJavaScriptEnabled(true);
		// 3 禁用Css，可避免自动二次請求CSS进行渲染
		webClient.getOptions().setCssEnabled(false);
		// 4 启动客戶端重定向
		webClient.getOptions().setRedirectEnabled(true);
		// 5 js运行错誤時，是否拋出异常
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		// 6 设置超时
		webClient.getOptions().setTimeout(50000);

		HtmlPage page = null;
		try {
			page = webClient.getPage(url);

			// 等待JS驱动dom完成获得还原后的网页
			webClient.waitForBackgroundJavaScript(10000);
			// 网页內容
			/* System.out.println(htmlPage.asXml()); */

			//Document doc = Jsoup.parse(page.asXml());

			// 使用jsoup解析页面

			// 关闭windows，释放资源
			webClient.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			webClient.close();
		}

		return page;
	}

}
