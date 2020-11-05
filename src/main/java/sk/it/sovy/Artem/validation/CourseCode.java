package sk.it.sovy.Artem.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CodeValidation.class)  // helper class that contains business rules/validation logic
@Target({ElementType.METHOD, ElementType.FIELD}) // can apply my annotation to a field
@Retention(RetentionPolicy.RUNTIME) // retain this annotation in java class file. Process it at runtime
public @interface CourseCode {

    // default value
    public String value() default "LUV";

    // default error message
    public String message() default "must start with LUV";

    // default groups - can group related constraints
    public Class<?>[] groups() default {};

    // default payloads - provide custom details about validation failure (error code)
    public Class<? extends Payload>[] payload() default {};

}