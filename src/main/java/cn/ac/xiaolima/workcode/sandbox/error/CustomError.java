package cn.ac.xiaolima.workcode.sandbox.error;

/**
 * 自定义错误
 */
public class CustomError extends SError{
    CustomError(Integer errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
