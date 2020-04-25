package com.ykxx.framework.util;

/**
 * 转型操作工具类
 * @Author lyj
 * @since 1.0.0
 */
public final class CastUtil {

    /**
     * 转为String型
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String型（提供默认值）
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     */
    public static double castDouble(Object object) {
        return CastUtil.castDouble(object, 0);
    }

    /**
     * 转为double型（提供默认值）
     */
    public static double castDouble(Object object, double defaultValue) {
        double doubleValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }

            }
        }
        return doubleValue;
    }

    /**
     * 转为long型
     */
    public static long castLong(Object object) {
        return CastUtil.castLong(object, 0);
    }

    /**
     * 转为long型（提供默认值）
     */
    public static long castLong(Object object, long defaultValue) {
        long longValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int型
     */
    public static int castInt(Object object) {
        return CastUtil.castInt(object, 0);
    }

    /**
     * 转为int型（提供默认值）
     */
    public static int castInt(Object object, int defaultValue) {
        int intValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean型
     */
    public static boolean castBoolean(Object object) {
        return CastUtil.castBoolean(object, false);
    }

    /**
     * 转为boolean型（提供默认值）
     */
    public static boolean castBoolean(Object object, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    booleanValue = Boolean.parseBoolean(strValue);
                } catch (NumberFormatException e) {
                    booleanValue = defaultValue;
                }
            }
        }
        return booleanValue;
    }


}
