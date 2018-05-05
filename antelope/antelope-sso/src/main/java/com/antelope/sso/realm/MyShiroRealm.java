package com.antelope.sso.realm;

import com.antelope.sso.domain.*;
import com.antelope.sso.repository.UserInfoRepository;
import com.antelope.sso.service.UserInfoService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-05-02
 */
public class MyShiroRealm extends AuthorizingRealm {
    @Resource
    private UserInfoService userInfoService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取用户
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        UserInfo userInfo=(UserInfo)principals.getPrimaryPrincipal();
        for (SysRole role :
                userInfo.getRoleList()) {
            info.addRole(role.getRole());
            for(SysPermission p:role.getPermissions())
            {
                info.addStringPermission(p.getPermission());
            }
        }
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username=(String)token.getPrincipal();
        UserInfo userInfo=userInfoService.findByUsername(username);
        if(userInfo==null)
        {
            return null;
        }
        if(userInfo.getState()==2) { //账户冻结
            throw new LockedAccountException();
        }

        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
                userInfo,
                userInfo.getPassword(),
                ByteSource.Util.bytes(userInfo.getCredentialsSalt()),
                getName());
        return authenticationInfo;
    }
}
