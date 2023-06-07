package com.zicna_inc.tnp_1099.validation.constraint;

import com.zicna_inc.tnp_1099.validation.CarTypeValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;
// import java.util.stream.Stream;

public class CarTypeValidator implements ConstraintValidator<CarTypeValidation, String> {

    private List<String> acceptedValues;

    @Override
    public void initialize(CarTypeValidation constraintAnnotation) {

        acceptedValues = new ArrayList<>();
        for(String val : constraintAnnotation.acceptedTypes()){
            acceptedValues.add(val);
        }
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return acceptedValues.contains(value);
    }
}
