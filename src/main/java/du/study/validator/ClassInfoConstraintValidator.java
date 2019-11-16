package du.study.validator;

import du.study.validator.annotation.ClassInfoCheck;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ClassInfoConstraintValidator implements ConstraintValidator<ClassInfoCheck,String> {
    @Override
    public void initialize(ClassInfoCheck constraintAnnotation) {}
    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        if(name.equals("test")){
            return false;
        }
        return true;
    }
}
