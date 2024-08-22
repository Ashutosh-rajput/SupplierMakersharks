package AshutoshRajput.Makersharks.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class ManufacturingProcessesValidation implements ConstraintValidator<ValidateManufacturingProcesses,String> {
    @Override
    public boolean isValid(String manufacturing_process, ConstraintValidatorContext context) {
        List<String> manufacturing_processes = Arrays.asList("moulding", "3d_printing", "casting", "coating");
        return manufacturing_processes.stream()
                .anyMatch(process -> process.equalsIgnoreCase(manufacturing_process));

    }
}
