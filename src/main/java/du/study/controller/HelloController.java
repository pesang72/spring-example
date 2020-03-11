package du.study.controller;

import du.study.domain.ClassInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello SpringMVC ";
    }

    @RequestMapping("/jackson")
    @ResponseBody
    public ClassInfo helloObject() {
        // 뭔가를 받아와서 도메인을 만들었다 가정하고..
        ClassInfo classinfo = new ClassInfo("du",10);
        return classinfo;
    }


    @GetMapping("/helloview")
    public String helloView() {
        return "viewTest/hello";
    }
}
