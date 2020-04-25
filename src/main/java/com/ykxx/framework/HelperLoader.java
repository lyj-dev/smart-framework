package com.ykxx.framework;

import com.ykxx.framework.helper.BeanHelper;
import com.ykxx.framework.helper.ClassHelper;
import com.ykxx.framework.helper.ControllerHelper;
import com.ykxx.framework.helper.IocHelper;
import com.ykxx.framework.util.ClassUtil;

/**
 * 加载响应的Helper类
 *
 * @Author lyj
 * @since 1.0.0
 */
public class HelperLoader {

    public static void init () {
        Class<?>[] classList = {ClassHelper.class, BeanHelper.class, IocHelper.class, ControllerHelper.class};
        for (Class<?> clazz : classList) {
            ClassUtil.loadClass(clazz.getName());
        }
    }
}
