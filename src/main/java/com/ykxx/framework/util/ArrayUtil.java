package com.ykxx.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具类
 *
 * @Author lyj
 * @since 1.0.0
 */
public class ArrayUtil {

    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty (Object[] objects) {
        return ArrayUtils.isEmpty(objects);
    }

    /**
     * 判断数组是否不空
     */
    public static boolean isNotEmpty(Object[] objects) {
        return !ArrayUtils.isEmpty(objects);
    }
}
