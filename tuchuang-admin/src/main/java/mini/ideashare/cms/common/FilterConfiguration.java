package mini.ideashare.cms.common;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lixiang
 * @CreateTime 2018/5/29
 **/
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean loginFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new SessionFilter());
        bean.setName("IS_LoginFilter");
        bean.addUrlPatterns("/*");
        //白名单，即不需要登录登录即可以访问的页面， 配置规则如下
        //bean.addInitParameter("whitelist", "{not_need_login_pages}");
        bean.setOrder(0);
        return bean;
    }

}
