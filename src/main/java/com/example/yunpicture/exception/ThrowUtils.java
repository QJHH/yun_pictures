package com.example.yunpicture.exception;

/**
 * 异常处理工具类
 */
public class ThrowUtils {

    /**
     * 条件成立时，抛出异常
     *
     * @param condition        条件
     * @param runtimeException 异常
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立时，抛出异常
     *
     * @param condition 条件
     * @param errorCode 错误信息
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * 条件成立时，抛出异常
     *
     * @param condition 条件
     * @param errorCode 错误信息
     * @param msg       具体描述
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String msg) {
        throwIf(condition, new BusinessException(errorCode, msg));
    }
}
