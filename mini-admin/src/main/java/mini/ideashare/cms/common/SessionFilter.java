package mini.ideashare.cms.common;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author lixiang
 * @CreateTime 2018/5/29
 **/
public class SessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("in filter");
        HttpServletRequest httpRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse)servletResponse;
        Cookie cookie = new Cookie("id","11111");
        cookie.setDomain("ideashare.tech");
        cookie.setPath("/");
        cookie.setMaxAge(30);
        httpResponse.addCookie(cookie);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
