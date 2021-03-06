package src.main.java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @作者：胡鹏鹏
 * @创建时间：2018/4/13 20:18
 */
public class UrlPojo {
    private String url;                          //网页URL
    private TaskLevel tasklevel=TaskLevel.MIDDLE;//URL的优先级等级

    public UrlPojo(String url) {
        this.url = url;
    }

    public UrlPojo(String url, TaskLevel tasklevel) {
        this(url);
        this.tasklevel = tasklevel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TaskLevel getTasklevel() {
        return tasklevel;
    }

    public void setTasklevel(TaskLevel tasklevel) {
        this.tasklevel = tasklevel;
    }

    public String getHost(){            //获得主机名
        URL Url=null;
        try {
            Url= new URL(this.url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return Url.getHost();
    }

    public HttpURLConnection getConnection(){
        URL Url=null;

        try {
            Url= new URL(this.url);
            URLConnection conn = Url.openConnection();
            if (conn instanceof HttpURLConnection) {

                return
                        (HttpURLConnection) conn;
            } else {
                throw new Exception("打开衔接失败");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
