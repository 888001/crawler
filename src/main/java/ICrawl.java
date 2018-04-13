package src.main.java;

import java.io.IOException;

/**
 * @作者：胡鹏鹏
 * @创建时间：2018/4/13 20:19
 */
public interface ICrawl {
    public CrawlResultPojo crawl(UrlPojo urlpojo) throws IOException;
}
