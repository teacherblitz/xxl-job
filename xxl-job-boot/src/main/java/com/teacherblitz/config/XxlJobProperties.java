package com.teacherblitz.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
* xxj-job配置文件属性
*
* @author zhuyuan
* @since 2023/5/28 11:15
*/
@Data
@Component
@ConfigurationProperties(prefix = "xxl.job")
public class XxlJobProperties {

    private Admin admin;
    private String accessToken;
    private Executor executor;

    @Data
    public static class Executor {
        private String appname;
        private String address;
        private String ip;
        private Integer port;
        private String logpath;
        private Integer logretentiondays;
    }


    @Data
    public static class Admin {
        private String addresses;
    }
}
