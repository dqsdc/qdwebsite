package cn.anpe.website.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "product_show")
public class ProductShow {
    @Id
    private String aid;

    private String title;

    private Long createTime;

    private Long modifiedTime;

    private String authorId;

    private String authorName;

    private Integer status;

    private String thumbImg;

    private Integer hits;

    private Integer commentNum;

    private String error;

    private Integer orderBy;

    private String subtitle;

    private String pcid;

    private String pcShow;

    private String content;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg == null ? null : thumbImg.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getPcid() {
        return pcid;
    }

    public void setPcid(String pcid) {
        this.pcid = pcid == null ? null : pcid.trim();
    }

    public String getPcShow() {
        return pcShow;
    }

    public void setPcShow(String pcShow) {
        this.pcShow = pcShow == null ? null : pcShow.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "ProductShow{" +
                "aid='" + aid + '\'' +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                ", authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", status=" + status +
                ", thumbImg='" + thumbImg + '\'' +
                ", hits=" + hits +
                ", commentNum=" + commentNum +
                ", error='" + error + '\'' +
                ", orderBy=" + orderBy +
                ", subtitle='" + subtitle + '\'' +
                ", pcid='" + pcid + '\'' +
                ", pcShow='" + pcShow + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}