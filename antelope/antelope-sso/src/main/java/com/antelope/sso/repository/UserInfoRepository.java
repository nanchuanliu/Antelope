package com.antelope.sso.repository;

import com.antelope.sso.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-05-04
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByUsername(String username);
}
