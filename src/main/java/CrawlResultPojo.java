package src.main.java;

/**
 * @作者：胡鹏鹏
 * @创建时间：2018/4/13 20:20
 */
public class CrawlResultPojo {
    private boolean isSuccess; //是否已经成功
    private String pageContent;//网页内容
    private int HttpStatuCode;//HTTP 状态码

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    public int getHttpStatuCode() {
        return HttpStatuCode;
    }

    public void setHttpStatuCode(int httpStatuCode) {
        HttpStatuCode = httpStatuCode;
    }
}
