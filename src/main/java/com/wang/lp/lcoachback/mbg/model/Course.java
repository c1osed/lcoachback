package com.wang.lp.lcoachback.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    private Integer id;

    private Integer sid;

    private Integer tid;

    private String courseTitle;

    private String courseEvaluation;

    private String courseGrading;

    private String courseNotes;

    private Date data;

    private String festivals;

    private String courseType;

    private Boolean isConnected;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseEvaluation() {
        return courseEvaluation;
    }

    public void setCourseEvaluation(String courseEvaluation) {
        this.courseEvaluation = courseEvaluation;
    }

    public String getCourseGrading() {
        return courseGrading;
    }

    public void setCourseGrading(String courseGrading) {
        this.courseGrading = courseGrading;
    }

    public String getCourseNotes() {
        return courseNotes;
    }

    public void setCourseNotes(String courseNotes) {
        this.courseNotes = courseNotes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFestivals() {
        return festivals;
    }

    public void setFestivals(String festivals) {
        this.festivals = festivals;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Boolean getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sid=").append(sid);
        sb.append(", tid=").append(tid);
        sb.append(", courseTitle=").append(courseTitle);
        sb.append(", courseEvaluation=").append(courseEvaluation);
        sb.append(", courseGrading=").append(courseGrading);
        sb.append(", courseNotes=").append(courseNotes);
        sb.append(", data=").append(data);
        sb.append(", festivals=").append(festivals);
        sb.append(", courseType=").append(courseType);
        sb.append(", isConnected=").append(isConnected);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}