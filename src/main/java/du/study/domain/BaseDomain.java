package du.study.domain;

import du.study.common.error.ErrorType;

public class BaseDomain {
    private Integer errorCode;
    private String errorMsg;

    BaseDomain(Integer errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg =  errorMsg;
    }

    BaseDomain(ErrorType errorType){
        this.errorMsg = errorType.getErrorMsg();
        this.errorCode = errorType.getErrorCode();
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
