/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.common.task;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxc Apr 13, 2013 11:20:59 PM
 */
public class TaskUtil {

    public static List<Task> createTaskList() {
        return new ArrayList<Task>();
    }

    public static void runTasks(List<Task> taskList) {
        for (Task task : taskList) {
            task.finish();
        }
    }
}
