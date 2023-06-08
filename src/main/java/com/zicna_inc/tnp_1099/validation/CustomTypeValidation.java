package com.zicna_inc.tnp_1099.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.zicna_inc.tnp_1099.validation.constraint.CustomTypeValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomTypeValidator.class)
public @interface CustomTypeValidation {

    public String[] acceptedTypes();

    String message() default "default error message ";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
