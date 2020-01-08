package com.wang.lp.lcoachback.interceptor;


import com.wang.lp.lcoachback.mbg.model.Student;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        String contextPath = session.getServletContext().getContextPath();
        String[] requireAuthPages = new String[]{
                "index",
        };
        String uri = request.getRequestURI();
        uri = StringUtils.remove(uri, contextPath+"/");
        String page = uri;
        if(begingWith(page, requireAuthPages)){
            Student student = (Student) session.getAttribute("user");
            if(student==null) {
                response.sendRedirect("login");
                return false;
            }
        }
        return true;
    }


    private boolean begingWith(String page, String[] requiredAuthPages) {
        boolean result = false;
        for (String requiredAuthPage : requiredAuthPages) {
            if(StringUtils.startsWith(page, requiredAuthPage)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
