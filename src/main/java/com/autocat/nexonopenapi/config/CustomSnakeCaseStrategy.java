//package com.autocat.nexonopenapi.config;
//
//import com.fasterxml.jackson.databind.PropertyNamingStrategies;
//import com.fasterxml.jackson.databind.PropertyNamingStrategy;
//import com.fasterxml.jackson.databind.cfg.MapperConfig;
//import com.fasterxml.jackson.databind.introspect.AnnotatedField;
//import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//@Slf4j
//public class CustomSnakeCaseStrategy extends PropertyNamingStrategy {
//
//    @Override
//    public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
//        log.info("CustomSnakeCaseStrategy.nameForField : {}", defaultName);
//        return convert(defaultName);
//    }
//
//    @Override
//    public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
//        return convert(defaultName);
//    }
//
//    @Override
//    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
//        return convert(defaultName);
//    }
//
//    private String convert(String defaultName) {
//        log.info("CustomSnakeCaseStrategy.convert : {}", defaultName);
//        String[] parts = defaultName.split("_");
//        StringBuilder camelCasePropertyName = new StringBuilder();
//
//        // Then iterate through each part
//        for (int i = 0; i < parts.length; i++) {
//            // If the part is a numeric value, directly append it to the string.
//            if (parts[i].matches("\\d+")) {
//                camelCasePropertyName.append(parts[i]);
//            } else if (i == 0) {
//                // Lower case for first word in property name
//                camelCasePropertyName.append(parts[i].toLowerCase());
//            } else {
//                // Apply Java's camelCase convention for the remaining words
//                camelCasePropertyName.append(parts[i].substring(0, 1).toUpperCase());
//                camelCasePropertyName.append(parts[i].substring(1).toLowerCase());
//            }
//        }
//
//        return camelCasePropertyName.toString();
//    }
//
//
//}