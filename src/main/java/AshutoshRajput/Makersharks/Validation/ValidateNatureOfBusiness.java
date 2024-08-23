package AshutoshRajput.Makersharks.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = NatureOfBusinessValidator.class)
public @interface ValidateNatureOfBusiness {
    public String message() default "Invalid nature of business:Possible values: small_scale, medium_scale, large_scale";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
