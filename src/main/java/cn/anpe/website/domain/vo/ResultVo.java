package cn.anpe.website.domain.vo;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-02 11:27
 * @Description:
 */
public class ResultVo {
    public final static Integer MISSING = 404;
    public final static Integer SUCCESS = 200;
    private Integer code;
    private String data;
    private String auth;
    private String url;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "code=" + code +
                ", auth='" + auth + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
