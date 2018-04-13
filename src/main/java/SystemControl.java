package src.main.java;

import java.util.ArrayList;

/**
 * @作者：胡鹏鹏
 * @创建时间：2018/4/13 20:17
 */
public class SystemControl {
    public static void main(String []args){

        ArrayList<UrlPojo> urlPojoArrayList = new ArrayList<UrlPojo>();

        urlPojoArrayList.add(new UrlPojo("https://www.taobao.com/", TaskLevel.HIGH));
        urlPojoArrayList.add(new UrlPojo("https://www.taobao.com/", TaskLevel.HIGH));

        int count=0;

        for( UrlPojo urlPojo:urlPojoArrayList){
            CrawlerManger crawlerManger = new CrawlerManger(false);
            CrawlResultPojo crawlResultPojo = crawlerManger.crawl(urlPojo);
            System.out.println(crawlResultPojo.getPageContent());
            count++;
            System.out.println("已经抓取了："+count+"个页面");
        }
    }
}
