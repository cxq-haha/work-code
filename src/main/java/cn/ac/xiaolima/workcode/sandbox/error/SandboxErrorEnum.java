package cn.ac.xiaolima.workcode.sandbox.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SandboxErrorEnum {
    ERROR1(10001, "错误一"),
    ERROR2(10002, "错误二"),
    ;

    private final Integer code;
    private final String message;
}
