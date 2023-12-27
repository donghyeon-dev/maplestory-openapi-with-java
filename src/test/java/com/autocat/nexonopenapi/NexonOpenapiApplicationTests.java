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
        assertEquals(expectedInput, originalTranslate(input));

        input = "additional_potential_option_1";
        expectedInput = "additionalPotentialOption1";
        assertEquals(expectedInput, originalTranslate(input));


        input = "ocid";
        expectedInput = "ocid";
        assertEquals(expectedInput, originalTranslate(input));



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

}
