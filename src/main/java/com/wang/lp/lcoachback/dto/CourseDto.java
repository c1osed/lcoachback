package com.wang.lp.lcoachback.dto;

public class CourseDto {
    int id;
    String coursetitle;
    String color;
    String starttime;
    String endtime;
    String gradle;

    public void setId(int id) {
        this.id = id;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public String getCoursetitle() {
        return coursetitle;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public void setGradle(String gradle) {
        this.gradle = gradle;
    }

    public int getId() {
        return id;
    }



    public String getColor() {
        return color;
    }

    public String getStarttime() {
        return starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public String getGradle() {
        return gradle;
    }
}
