/*
 *    Copyright (c) 2018-2025, houyi All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the tfkz4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: houyi (wangiegie@gmail.com)
 */

package com.yunsuo.tfkz.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author houyi
 *         获取用户信息也是通过这个应用实现
 *         这里既是认证服务器，也是资源服务器
 *         EnableResourceServer
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.yunsuo.tfkz.auth", "com.yunsuo.tfkz.common.bean"})
public class TfkzAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TfkzAuthServerApplication.class, args);
    }

}