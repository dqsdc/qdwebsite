package cn.anpe.website.domain.vo;

import cn.anpe.website.domain.Attribute;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-17 10:58
 * @Description:
 */
public class AttributeVo {
    Attribute attribute;
    List<String> values;

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
