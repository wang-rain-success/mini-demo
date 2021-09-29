package com.cn.wdy.demo.configure;


import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)
public class SpringRedisSessionConfig {

//    @Value("${wdy.redis.host}")
//    private String redishost;
//
//    @Value("${wdy.redis.port}")
//    private int redisport;
//
//    @Bean("redisStandaloneConnectionFactory")
//    public RedisConnectionFactory redisStandaloneMasterConnectionFactory() {
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(redishost, redisport);
//        RedisConnectionFactory lettuceConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration);
//        return lettuceConnectionFactory;
//    }


}
