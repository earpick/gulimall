package com.study.gulimall.ware.configuration;

import com.study.common.utils.PurchaseConstant;
import com.study.common.utils.SnowFlakeShortUrl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean配置类
 */
@Configuration
public class BeanConfig {

    /**
     * 配置雪花算法构造参数
     * @return
     */
    @Bean
    public SnowFlakeShortUrl config() {
        return  new SnowFlakeShortUrl(PurchaseConstant.StringDataCenterId,PurchaseConstant.machineId);
    }
}
