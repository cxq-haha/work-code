package cn.ac.xiaolima.workcode.sandbox.error;

/**
 * 云沙箱错误
 */
public class SandboxError extends SError {

    SandboxError(SandboxErrorEnum sandboxError) {
        super(sandboxError.getCode(), sandboxError.getMessage());
    }
}
