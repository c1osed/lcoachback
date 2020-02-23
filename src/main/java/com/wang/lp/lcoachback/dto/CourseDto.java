package com.wang.lp.lcoachback.dto;

public class CourseDto {
    int id;
    String course_title;
    String color;
    String starttime;
    String endtime;
    String gradle;

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
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

    public String getCourse_title() {
        return course_title;
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
