package du.study.controller;


import du.study.constant.ErrorType;
import du.study.domain.ClassInfo;
import du.study.validator.ClassInfoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/valid")
public class ValidateTestController {
    /*
    @InitBinder
    public void initValidator(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(new ClassInfoValidator());
    }
    */
    @GetMapping("/binder")
    @ResponseBody
    public ClassInfo binderTest(@Validated ClassInfo classInfo , BindingResult bindingResult) {
        // 보통 Service 라면 classInfo 값을 받아 뭔가를 조회하겠지만..
        if(bindingResult.hasErrors()){
            return new ClassInfo(ErrorType.INVALID_VALUE);
        }
        return classInfo;
    }
}
