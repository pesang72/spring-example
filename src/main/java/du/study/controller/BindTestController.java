package du.study.controller;

import du.study.domain.ClassInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping("/bind")
public class BindTestController {

    @GetMapping("/success-test")
    @ResponseBody
    public String errorBindTest(@Validated ClassInfo domain , BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            //간단 테스트니까 System.out.println으로..
            System.out.println(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        return "success";
    }


    @GetMapping("/error-test")
    @ResponseBody
    public String errorTest(@Validated ClassInfo domain){
        return "success";
    }
}
