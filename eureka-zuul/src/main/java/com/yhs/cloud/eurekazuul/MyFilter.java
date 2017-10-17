package com.yhs.cloud.eurekazuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Charles
 * @Title: MyFilter
 * @Package com.yhs.cloud.eurekazuul
 * @Description: TODO
 * @date 2017/10/17 14:37
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }else if("22".equals(accessToken)){
            log.warn("没有访问权限!");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(403);
            try {
                //ctx.getResponse().setCharacterEncoding("UTF-8");
                ctx.getResponse().getWriter().write("You do not have permission to access requests");
            }catch (Exception e){}
            return null;
        }else {
            log.info("ok");
            return null;
        }

    }
}
