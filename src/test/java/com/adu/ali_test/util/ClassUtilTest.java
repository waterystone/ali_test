package com.adu.ali_test.util;

import org.junit.Test;

import com.adu.ali_test.BaseTest;

/**
 * @author yunjie.du
 * @date 2017/5/16 10:31
 */
public class ClassUtilTest extends BaseTest {

    @Test
    public void getJarFilePath() throws Exception {
        String res = ClassUtil.getJarFilePath("org.slf4j.Logger");
        logRes(res);
    }
}
