package com.wang.lp.lcoachback.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Teacher implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String subject;

    private String header;

    private String tefl;

    private String identity;

    private String profile;

    private String sex;

    private Date birthday;

    private Boolean isAccreditation;

    private BigDecimal price;

    private String experience;

    private String teachingAge;

    private Integer harvest;

    private String teachersLeisure;

    private String appointmentTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTefl() {
        return tefl;
    }

    public void setTefl(String tefl) {
        this.tefl = tefl;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getIsAccreditation() {
        return isAccreditation;
    }

    public void setIsAccreditation(Boolean isAccreditation) {
        this.isAccreditation = isAccreditation;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getTeachingAge() {
        return teachingAge;
    }

    public void setTeachingAge(String teachingAge) {
        this.teachingAge = teachingAge;
    }

    public Integer getHarvest() {
        return harvest;
    }

    public void setHarvest(Integer harvest) {
        this.harvest = harvest;
    }

    public String getTeachersLeisure() {
        return teachersLeisure;
    }

    public void setTeachersLeisure(String teachersLeisure) {
        this.teachersLeisure = teachersLeisure;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", subject=").append(subject);
        sb.append(", header=").append(header);
        sb.append(", tefl=").append(tefl);
        sb.append(", identity=").append(identity);
        sb.append(", profile=").append(profile);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", isAccreditation=").append(isAccreditation);
        sb.append(", price=").append(price);
        sb.append(", experience=").append(experience);
        sb.append(", teachingAge=").append(teachingAge);
        sb.append(", harvest=").append(harvest);
        sb.append(", teachersLeisure=").append(teachersLeisure);
        sb.append(", appointmentTime=").append(appointmentTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}