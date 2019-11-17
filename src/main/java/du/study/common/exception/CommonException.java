package du.study.common.exception;

import du.study.common.error.ErrorCodable;
import du.study.common.error.ErrorType;

public class CommonException extends RuntimeException {

    protected ErrorCodable errorType;
    protected String causeMsg;

    public CommonException() {
        this.errorType = ErrorType.UNKNOWN_ERROR;
    }

    public CommonException(ErrorCodable errorType) {
        this.errorType = errorType;
    }

    public CommonException(ErrorCodable errorType, String causeMsg) {
        this.errorType = errorType;
        this.causeMsg = causeMsg;
    }

    public ErrorCodable getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorCodable errorType) {
        this.errorType = errorType;
    }

    public String getCauseMsg() {
        return causeMsg;
    }

    public void setCauseMsg(String causeMsg) {
        this.causeMsg = causeMsg;
    }
}
