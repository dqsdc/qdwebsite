package cn.anpe.website.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "meta_article")
public class MetaArticle {
    @Id
    private String metaArticleId;

    private String mid;

    private String aid;

    public MetaArticle(){}
    public MetaArticle(String mid, String aid) {
        this.mid = mid;
        this.aid = aid;
    }

    public String getMetaArticleId() {
        return metaArticleId;
    }

    public void setMetaArticleId(String metaArticleId) {
        this.metaArticleId = metaArticleId == null ? null : metaArticleId.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    @Override
    public String toString() {
        return "MetaArticle{" +
                "metaArticleId='" + metaArticleId + '\'' +
                ", mid='" + mid + '\'' +
                ", aid='" + aid + '\'' +
                '}';
    }
}