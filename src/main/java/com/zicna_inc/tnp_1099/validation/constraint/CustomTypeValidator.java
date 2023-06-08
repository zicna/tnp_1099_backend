package com.zicna_inc.tnp_1099.validation.constraint;

import com.zicna_inc.tnp_1099.validation.CustomTypeValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;

public class CustomTypeValidator implements ConstraintValidator<CustomTypeValidation, String> {

    private List<String> acceptedValues;

    @Override
    public void initialize(CustomTypeValidation constraintAnnotation) {

        acceptedValues = new ArrayList<>();
        for (String val : constraintAnnotation.acceptedTypes()) {
            acceptedValues.add(val);
        }
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return acceptedValues.contains(value);
    }
}
