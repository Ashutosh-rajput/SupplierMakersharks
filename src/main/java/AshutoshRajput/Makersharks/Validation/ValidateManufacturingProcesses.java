package AshutoshRajput.Makersharks.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ManufacturingProcessesValidation.class)
public @interface ValidateManufacturingProcesses {
    public String message() default "Invalid manufacturing process:Possible values for POC: moulding, 3d_printing, casting, coating";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
