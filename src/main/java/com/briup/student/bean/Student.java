package com.briup.student.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class Student implements Serializable {

    @ApiModelProperty(name = "stuID",value = "学号")
    private int stuID;
    @ApiModelProperty(name = "name",value = "姓名")
    private String name;
    @ApiModelProperty(name = "score",value = "成绩")
    private int score;

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
