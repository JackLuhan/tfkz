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

package com.yunsuo.tfkz.common.util.exception;

/**
 * @author houyi
 * @date 2017-12-29 17:05:10
 * 403 授权拒绝
 */
public class TfkzDeniedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TfkzDeniedException() {
    }

    public TfkzDeniedException(String message) {
        super(message);
    }

    public TfkzDeniedException(Throwable cause) {
        super(cause);
    }

    public TfkzDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public TfkzDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
