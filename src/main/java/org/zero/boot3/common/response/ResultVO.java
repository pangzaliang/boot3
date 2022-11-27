package org.zero.boot3.common.response;

import org.zero.boot3.common.enums.CodeEnum;

public class ResultVO<T> {

    private String code;
    private String massage;
    private T data;

    public static <T>ResultVO<T> build (String code, String massage, T data) {
        return ok(code, massage, data);
    }

    public static <T> ResultVO<T> ok(String code, String massage, T data) {
        return build(code, massage, data);
    }

    public static <T> ResultVO<T> ok (CodeEnum codeEnum, T data) {
        return build(codeEnum.code(), codeEnum.massage(), data);
    }
    public ResultVO() {
    }

    public ResultVO(String code, String massage, T data) {
        this.code = code;
        this.massage = massage;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code='" + code + '\'' +
                ", massage='" + massage + '\'' +
                ", data=" + data +
                '}';
    }
}
