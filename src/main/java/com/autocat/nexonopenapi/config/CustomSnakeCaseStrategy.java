package com.autocat.nexonopenapi.config;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomSnakeCaseStrategy extends PropertyNamingStrategies.SnakeCaseStrategy {
    private static final Pattern NUMBERED_FIELD_PATTERN = Pattern.compile("(\\w+?)_(\\d+)");

    @Override
    public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
        return convert(defaultName);
    }

    @Override
    public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return convert(defaultName);
    }

    @Override
    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return convert(defaultName);
    }

    private String convert(String input) {
        Matcher matcher = NUMBERED_FIELD_PATTERN.matcher(input);
        if (matcher.find()) {
            return toCamelCase(matcher.group(1)) + matcher.group(2);
        } else {
            return input; // 한 번 더 변환을 위해 기본 전략을 사용합니다.
        }
    }

    private String toCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String[] words = s.split("_");
        StringBuilder sb = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        return sb.toString();
    }
}