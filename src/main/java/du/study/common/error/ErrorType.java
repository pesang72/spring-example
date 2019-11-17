package du.study.common.error;

import org.springframework.http.HttpStatus;

public enum ErrorType implements ErrorCodable{
    SUCCESS(0, "SUCCESS", 500),
    INVALID_VALUE(1000, "INVALID_VALUE",403),
    UNKNOWN_ERROR(9999,"UNKNOWN_ERROR",500)
    ;

    private Integer errorCode;
    private String errorMsg;
    private Integer status;

    ErrorType(Integer errorCode, String errorMsg, Integer httpStatusCode) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.status = httpStatusCode;
    }
    @Override
    public Integer getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public Integer getStatus() {
        return status;
    }
}
