package org.zero.boot3.common.response;

/**
 * 通用返回值 已弃用
 * @param <T>
 */

@Deprecated
public class ApiResult<T> {

    private String code;
    private String massage;
    private T data;

    public static <T> ApiResult<T> ok (T data) {
        ApiResult<T> resultVO = new ApiResult<>();
        resultVO.setCode("200");
        resultVO.setMassage("ok");
        resultVO.setData(data);
        return resultVO;
    }

    public ApiResult() {
    }

    public ApiResult(String code, String massage, T data) {
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
        return "ApiResult{" +
                "code='" + code + '\'' +
                ", massage='" + massage + '\'' +
                ", data=" + data +
                '}';
    }
}
