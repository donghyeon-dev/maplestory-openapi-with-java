package com.autocat.nexonopenapi;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
class NexonOpenapiApplicationTests {

    @Test
    void date_테스트() {

        LocalDate now = LocalDate.now();
        String formattedNow = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        log.info("formattedNow ={}",formattedNow);

    }

    @Test
    void 숫자가_포함된_스네이크_케이스_테스트(){
        String input = "additional_potential_option_1";
        String expectedInput = "additionalPotentialOption1";
        assertEquals(expectedInput, translate(input));

        input = "character_name";
        expectedInput = "characterName";
        assertEquals(expectedInput, translate(input));

        input = "ocid";
        expectedInput = "ocid";
        assertEquals(expectedInput, translate(input));

        // Original Snakecase Strategy Test

        input = "character_name";
        expectedInput = "characterName";
        assertEquals(expectedInput, convertNameForSetter(input));

        input = "hyper_stat_preset_1";
        expectedInput = "hyperStatPreset1";
        assertEquals(expectedInput, convertNameForSetter(input));


        input = "hyper_stat_preset_1_remain_point";
        expectedInput = "hyperStatPreset1RemainPoint";
        assertEquals(expectedInput, convertNameForSetter(input));



    }

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

    public String originalTranslate(String input) {
        if (input == null) return input; // garbage in, garbage out
        int length = input.length();
        StringBuilder result = new StringBuilder(length * 2);
        int resultLength = 0;
        boolean wasPrevTranslated = false;
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (i > 0 || c != '_') // skip first starting underscore
            {
                if (Character.isUpperCase(c)) {
                    if (!wasPrevTranslated && resultLength > 0 && result.charAt(resultLength - 1) != '_') {
                        result.append('_');
                        resultLength++;
                    }
                    c = Character.toLowerCase(c);
                    wasPrevTranslated = true;
                } else {
                    wasPrevTranslated = false;
                }
                result.append(c);
                resultLength++;
            }
        }
        return resultLength > 0 ? result.toString() : input;
    }

    // 숫자 뒤를 대문자로 변환이 가능하게 해주는 메소드
    public String customTranslater(String propertyName) {
        // First, split the original name by underscore
        String[] parts = propertyName.split("_");
        StringBuilder camelCasePropertyName = new StringBuilder();

        // Then iterate through each part
        for (int i = 0; i < parts.length; i++) {
            // If the part is a numeric value, directly append it to the string.
            if (parts[i].matches("\\d+")) {
                camelCasePropertyName.append(parts[i]);
            } else if (i == 0) {
                // Lower case for first word in property name
                camelCasePropertyName.append(parts[i].toLowerCase());
            } else {
                // Apply Java's camelCase convention for the remaining words
                camelCasePropertyName.append(parts[i].substring(0, 1).toUpperCase());
                camelCasePropertyName.append(parts[i].substring(1).toLowerCase());
            }
        }

        return camelCasePropertyName.toString();
    }

    private String convertNameForSetter(String input) {
        StringBuilder result = new StringBuilder();
        boolean upperCaseNextChar = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '_') {
                upperCaseNextChar = true;
            } else if (Character.isDigit(ch)) {
                result.append(ch);
                // if next char is a letter, we know we need to upper case it
                upperCaseNextChar = (i < input.length() - 1) && Character.isLetter(input.charAt(i + 1));
            } else {
                if (upperCaseNextChar && Character.isLetter(ch)) {
                    result.append(Character.toUpperCase(ch));
                    upperCaseNextChar = false;  // Reset the flag after using it
                } else {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

}
