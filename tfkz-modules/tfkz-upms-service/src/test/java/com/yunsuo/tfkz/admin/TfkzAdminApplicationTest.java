/*
 *    Copyright (c) 2018-2025, tfkz All rights reserved.
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
 * Author: tfkz (wangiegie@gmail.com)
 */

package com.yunsuo.tfkz.admin;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.springframework.core.env.StandardEnvironment;

/**
 * 配置文件加解密工具类
 *
 * @author houyi
 */
public class TfkzAdminApplicationTest {
    private static final String JASYPT_ENCRYPTOR_PASSWORD = "jasypt.encryptor.password";

    /**
     * jasypt.encryptor.password 对应 配置中心 application-dev.yml 中的密码
     */
    @Test
    public void testEnvironmentProperties() {
        System.setProperty(JASYPT_ENCRYPTOR_PASSWORD, "tfkz");
        StringEncryptor stringEncryptor = new DefaultLazyEncryptor(new StandardEnvironment());

        //加密方法
        System.out.println(stringEncryptor.encrypt("123456"));
        //解密方法
        System.out.println(stringEncryptor.decrypt("saRv7ZnXsNAfsl3AL9OpCQ=="));
    }
}
