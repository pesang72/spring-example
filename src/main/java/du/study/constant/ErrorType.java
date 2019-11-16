package du.study.constant;

public enum ErrorType {
    SUCCESS(0, "SUCCESS"),
    INVALID_VALUE(1000, "INVALID_VALUE")
    ;

    private Integer errorCode;
    private String errorMsg;

    ErrorType(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
