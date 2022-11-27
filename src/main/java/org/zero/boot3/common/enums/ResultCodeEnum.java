package org.zero.boot3.common.enums;

public enum ResultCodeEnum implements CodeEnum{
    SUCCESS("200", "ok"),
    FAIL("500", "error");

    private final String code;
    private final String massage;

    @Override
    public String code() {
        return this.code;
    }

    @Override
    public String massage() {
        return this.massage;
    }

    ResultCodeEnum(String code, String massage) {
        this.code = code;
        this.massage = massage;
    }
}
