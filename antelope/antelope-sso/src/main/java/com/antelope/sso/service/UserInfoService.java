package com.antelope.sso.service;

import com.antelope.sso.domain.UserInfo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-05-04
 */
public interface UserInfoService {
    UserInfo findByUsername(String username);
}
