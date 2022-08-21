package com.migufun.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author NJR10byh
 * @date 2022/8/20 20:03:47
 * @description
 */

public class ServletcontainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[] {Spring_Config.class};
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[] {SpringMVC_Config.class};
    }
    
    @Override
    protected String[] getServletMappings()
    {
        return new String[] {"/"};
    }
}

// 4、初始化Servlet容器，加载SpringMVC环境，设置SpringMVC技术处理请求
//public class ServletcontainersInitConfig extends AbstractDispatcherServletInitializer
//{
//    // 加载SpringMVC容器配置
//    @Override
//    protected WebApplicationContext createServletApplicationContext()
//    {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMVC_Config.class);
//        return ctx;
//    }
//
//    // 设置哪些请求归属SpringMVC处理
//    @Override
//    protected String[] getServletMappings()
//    {
//        // "/"表示所有请求都归SpringMVC处理
//        return new String[] {"/"};
//    }
//
//    // 加载Spring容器配置
//    @Override
//    protected WebApplicationContext createRootApplicationContext()
//    {
//        return null;
//    }
//}
