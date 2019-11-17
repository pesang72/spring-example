package du.study.controller;

import du.study.common.exception.CommonException;
import du.study.common.exception.InvalidParameterException;
import du.study.domain.ClassInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/error")
public class ExceptionTestController {

    @GetMapping("/common-error")
    @ResponseBody
    public String commonErrorTest(){
        throw new CommonException();
    }

    @GetMapping("/invalid-error")
    @ResponseBody
    public String InvalidErrorTest(){
        throw new InvalidParameterException();
    }

}
