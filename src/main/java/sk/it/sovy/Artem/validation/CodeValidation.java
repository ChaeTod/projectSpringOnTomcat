package sk.it.sovy.Artem.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeValidation implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCode) {
        coursePrefix = theCode.value();
    }

    // perform validation rules on Customer object
    // results of validation placed in the BindingResult - begind the scenes
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (s != null) {
            result = s.startsWith(coursePrefix);
        } else {
            return true;
        }

        return result;
    }
}