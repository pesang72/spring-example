package du.study.controller;


import du.study.common.exception.CommonException;
import du.study.domain.BaseDomain;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonController {
    @ExceptionHandler(CommonException.class)
    public ResponseEntity<BaseDomain> commonErrorException(CommonException ex){
        BaseDomain baseDomain = new BaseDomain(ex.getErrorType().getErrorCode(),ex.getErrorType().getErrorMsg());
        return ResponseEntity.badRequest().body(baseDomain);
    }
}
