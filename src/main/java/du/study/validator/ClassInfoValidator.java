package du.study.validator;

import du.study.domain.ClassInfo;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ClassInfoValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return ClassInfo.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ClassInfo classinfo = (ClassInfo) o;

        if(classinfo.getClassId() < 0){
            errors.reject("id");
            errors.rejectValue("classId","Invalid id","classId must be greater than 0 ");
        }
    }
}
