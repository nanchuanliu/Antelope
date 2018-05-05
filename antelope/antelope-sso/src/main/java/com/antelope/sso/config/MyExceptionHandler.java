package com.antelope.sso.config;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-05-03
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Nullable
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, @Nullable Object handler, Exception ex) {
        ModelAndView mv=new ModelAndView();
        FastJsonJsonView view=new FastJsonJsonView();
        Map<String,Object> attributes=new HashMap<String,Object>();
        if(ex instanceof UnauthenticatedException)
        {
            attributes.put("code","100001");
            attributes.put("msg","token错误");
        }else if (ex instanceof UnauthorizedException)
        {
            attributes.put("code","100002");
            attributes.put("msg","用户无权限");
        }else
        {
            attributes.put("code","100003");
            attributes.put("msg",ex.getMessage());
        }

        view.setAttributesMap(attributes);
        mv.setView(view);
        return mv;
    }
}
