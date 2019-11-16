package du.study.validator.annotation;


import du.study.validator.ClassInfoConstraintValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;



@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@Constraint(validatedBy = {ClassInfoConstraintValidator.class})
public @interface ClassInfoCheck {
    String message() default "Invalid Parameter";
    Class[] groups() default {};
    Class[] payload() default {};
}
