package AshutoshRajput.Makersharks.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class NatureOfBusinessValidator implements ConstraintValidator<ValidateNatureOfBusiness,String> {
    @Override
    public boolean isValid(String nature_of_business, ConstraintValidatorContext context) {
        List<String> nature_of_businesses= Arrays.asList("small_scale","medium_scale", "large_scale");
        return nature_of_businesses.contains(nature_of_business);
//        return nature_of_businesses.stream()
//                .anyMatch(validNature -> validNature.equalsIgnoreCase(nature_of_business));

    }
}
