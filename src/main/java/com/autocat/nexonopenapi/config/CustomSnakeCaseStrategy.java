package com.autocat.nexonopenapi.config;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import org.springframework.context.annotation.Configuration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomSnakeCaseStrategy extends PropertyNamingStrategies.SnakeCaseStrategy {

    public CustomSnakeCaseStrategy() {
        super();
    }

    /**
     * com.autocat.nexonopenapi.NexonOpenapiApplicationTests#translate(java.lang.String)
     * Parse snake-case with number to camel-case
     *
     * @param input
     * @return
     */
    @Override
    public String translate(String input) {
        if (input == null) return null;

        StringBuilder builder = new StringBuilder();
        boolean toUpper = false;
        for (char c : input.toCharArray()) {
            if (c == '_') {
                toUpper = true;
            } else if (toUpper) {
                builder.append(Character.toUpperCase(c));
                toUpper = false;
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}