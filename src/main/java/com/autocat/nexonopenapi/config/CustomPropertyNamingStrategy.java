package com.autocat.nexonopenapi.config;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import org.springframework.context.annotation.Configuration;

public class CustomPropertyNamingStrategy extends PropertyNamingStrategies.SnakeCaseStrategy {

    @Override
    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return convertNameForSetter(defaultName);
    }

    @Override
    public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
        return convert(defaultName);
    }

    @Override
    public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return convert(defaultName);
    }

    // Custom method to handle names
    private String convert(String input) {
        StringBuilder output = new StringBuilder();
        boolean upperCaseNextLetter = false;

        // For each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the current character is an underscore
            if (currentChar == '_') {
                // Upper case the next valid letter
                upperCaseNextLetter = true;
            } else {
                // If the current character is a digit
                if (Character.isDigit(currentChar)) {
                    // Add the digit to the output
                    output.append(currentChar);
                    // Do not upperCase the next letter
                    upperCaseNextLetter = false;
                } else {
                    // If upper case is required, change the current char to upper case
                    if (upperCaseNextLetter) {
                        output.append(Character.toUpperCase(currentChar));
                        upperCaseNextLetter = false;
                    } else {
                        output.append(currentChar);
                    }
                }
            }
        }

        return output.toString();
    }

    private String convertNameForSetter(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                stringBuilder.append('_');
                stringBuilder.append(Character.toLowerCase(currentChar));
            } else if (Character.isDigit(currentChar)) {
                if (i > 0 && Character.isLetter(input.charAt(i - 1))) {
                    stringBuilder.append('_');
                }
                stringBuilder.append(currentChar);
                if (i < input.length() - 1 && Character.isLetter(input.charAt(i + 1))) {
                    stringBuilder.append('_');
                }
            } else {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }
}
