/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.summer.web.exception;

/**
 * @author zxc Apr 12, 2013 4:12:57 PM
 */
public class ForwardError extends RuntimeException {

    private static final long serialVersionUID = 7176486170292598570L;

    public ForwardError(String msg) {
        super(msg);
    }
}
