package com.adu.ali_test.util;

import java.net.URLDecoder;

/**
 * 类相关工具
 * 
 * @author yunjie.du
 * @date 2015年12月10日 下午4:57:49
 */
public class ClassUtil {

    /**
     * 获取类所在jar包路径
     * 
     * @param classPath
     * @return
     * @throws Exception
     */
    public static String getJarFilePath(String classPath) throws Exception {
        Class<?> clazz = Class.forName(classPath);
        String res = clazz.getProtectionDomain().getCodeSource().getLocation().getFile();
        res = URLDecoder.decode(res, "UTF-8");
        return res;
    }
}
