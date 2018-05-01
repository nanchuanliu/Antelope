package com.antelope.model;


import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-04-25
 */
public class PersonInfo implements Serializable{
    //人员姓名
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    private String personName;
}
