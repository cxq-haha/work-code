package cn.ac.xiaolima.workcode.sandbox.error;

/**
 * 沙箱服务错误
 */
public class SError {
    private final Integer errorCode;
    private final String errorMsg;

    private static final String SEPARATOR = ":";

    SError(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /**
     * 10001:获取token失败
     * @return String
     */
    protected String codeAndMsg() {
        return errorCode +
                SEPARATOR +
                errorMsg;
    }
}
