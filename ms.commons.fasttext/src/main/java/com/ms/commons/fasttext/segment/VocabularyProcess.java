/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.fasttext.segment;

import java.util.List;

/**
 * @author zxc Apr 12, 2013 3:46:14 PM
 */
public interface VocabularyProcess {

    public List<InternalElement> postProcess(List<char[]> lines);

}
