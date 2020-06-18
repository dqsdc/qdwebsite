package cn.anpe.website.domain;

/**
 * @Auther: dqsdc
 * @Date: 2020-05-07 22:35
 * @Description:
 */
public class ProductAttributeKV {

    public ProductAttributeKV(String key, String val) {
        this.key = key;
        this.val = val;
    }

    String key;
    String val;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
