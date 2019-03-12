package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private String albumId;

    private String title;

    private String coverPath;

    private Integer count;

    private Integer score;

    private String author;

    private String teller;

    private Date pulishDate;

    private String brief;

    private static final long serialVersionUID = 1L;

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId == null ? null : albumId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath == null ? null : coverPath.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTeller() {
        return teller;
    }

    public void setTeller(String teller) {
        this.teller = teller == null ? null : teller.trim();
    }

    public Date getPulishDate() {
        return pulishDate;
    }

    public void setPulishDate(Date pulishDate) {
        this.pulishDate = pulishDate;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Album other = (Album) that;
        return (this.getAlbumId() == null ? other.getAlbumId() == null : this.getAlbumId().equals(other.getAlbumId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCoverPath() == null ? other.getCoverPath() == null : this.getCoverPath().equals(other.getCoverPath()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getTeller() == null ? other.getTeller() == null : this.getTeller().equals(other.getTeller()))
            && (this.getPulishDate() == null ? other.getPulishDate() == null : this.getPulishDate().equals(other.getPulishDate()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlbumId() == null) ? 0 : getAlbumId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCoverPath() == null) ? 0 : getCoverPath().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getTeller() == null) ? 0 : getTeller().hashCode());
        result = prime * result + ((getPulishDate() == null) ? 0 : getPulishDate().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", albumId=").append(albumId);
        sb.append(", title=").append(title);
        sb.append(", coverPath=").append(coverPath);
        sb.append(", count=").append(count);
        sb.append(", score=").append(score);
        sb.append(", author=").append(author);
        sb.append(", teller=").append(teller);
        sb.append(", pulishDate=").append(pulishDate);
        sb.append(", brief=").append(brief);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}