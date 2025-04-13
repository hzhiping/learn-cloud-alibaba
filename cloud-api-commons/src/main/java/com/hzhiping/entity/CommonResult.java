package com.hzhiping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hzhiping
 * @date 2023/01/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }

    /**
     * 操作成功
     *
     * @param msg  消息
     * @param data 泛型对象
     * @return 返回响应对象
     */
    public static <T> CommonResult<T> success(String msg, T data) {
        CommonResult<T> result = new CommonResult<>();
        result.code = 200;
        result.msg = msg;
        result.data = data;
        return result;
    }

    /**
     * 操作失败，异常传递
     *
     * @param code 异常代码
     * @param msg  异常消息
     * @return 返回响应对象
     */
    public static <T> CommonResult<T> failed(Integer code, String msg) {
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.msg = msg;
        result.data = null;
        return result;
    }
}