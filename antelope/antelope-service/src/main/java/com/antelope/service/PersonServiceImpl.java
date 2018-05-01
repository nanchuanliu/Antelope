package com.antelope.service;

import com.antelope.model.PersonInfo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-04-26
 */
public class PersonServiceImpl implements PersonInfoService{
    @Override
    public PersonInfo getPersonInfo(String name) {
        PersonInfo personInfo=new PersonInfo();
        personInfo.setPersonName("abc");
        return personInfo;
    }
}
