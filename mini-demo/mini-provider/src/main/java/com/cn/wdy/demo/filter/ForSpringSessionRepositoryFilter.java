package com.cn.wdy.demo.filter;

import com.cn.wdy.demo.configure.SpringRedisSessionConfig;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;
import org.springframework.stereotype.Component;

@Component
public class ForSpringSessionRepositoryFilter extends AbstractHttpSessionApplicationInitializer {

    public ForSpringSessionRepositoryFilter() {
        super(SpringRedisSessionConfig.class);
    }

}
