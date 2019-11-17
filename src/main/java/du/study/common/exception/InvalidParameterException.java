package du.study.common.exception;

import du.study.common.error.ErrorCodable;
import du.study.common.error.ErrorType;

public class InvalidParameterException extends CommonException {

    public InvalidParameterException(ErrorCodable errorCode, String causeMsg) {
        super(errorCode, causeMsg);
    }
    public InvalidParameterException(){
        super(ErrorType.INVALID_VALUE);
    }
    public InvalidParameterException(String msg){
        super(ErrorType.INVALID_VALUE,msg);
    }

}
