/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.assertion.exception;

import junit.framework.AssertionFailedError;

/**
 * @author zxc Apr 13, 2013 11:14:17 PM
 */
public class AssertException extends AssertionFailedError {

    private static final long serialVersionUID = -1443921331083603325L;

    public AssertException() {
        super();
    }

    public AssertException(String message) {
        super(message);
    }
}
