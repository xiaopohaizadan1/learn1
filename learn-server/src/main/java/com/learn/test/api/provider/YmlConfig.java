package com.learn.test.api.provider;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * 读取application.yml里面的数据 前缀是role的
 *
 * @author geweijian
 * @data 2017-08-25
 */
@Data
@ConfigurationProperties(prefix = "role")
public class YmlConfig {
    private List<Integer> nfq;

    private List<Integer> customer;

    private List<Map<String,String>> user;
}
