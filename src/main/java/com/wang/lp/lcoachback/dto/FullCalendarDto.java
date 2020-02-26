package com.wang.lp.lcoachback.dto;

public class FullCalendarDto {
    Integer id;
    Integer tid;
    Integer sid;
    String title;
    String start ;
    String  end;
    String color;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTid() {
        return tid;
    }

    public Integer getSid() {
        return sid;
    }

    public String getTitle() {
        return title;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getColor() {
        return color;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
