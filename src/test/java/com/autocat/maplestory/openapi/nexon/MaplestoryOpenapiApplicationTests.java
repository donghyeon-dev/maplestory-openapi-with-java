package com.autocat.maplestory.openapi.nexon;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
class MaplestoryOpenapiApplicationTests {

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
        assertEquals(expectedInput, convert(input));

        input = "character_name";
        expectedInput = "characterName";
        assertEquals(expectedInput, convert(input));

        input = "ocid";
        expectedInput = "ocid";
        assertEquals(expectedInput, convert(input));

        // Original Snakecase Strategy Test

        input = "character_name";
        expectedInput = "characterName";
        assertEquals(expectedInput, convert(input));

        input = "hyper_stat_preset_1";
        expectedInput = "hyperStatPreset1";
        assertEquals(expectedInput, convert(input));


        input = "hyper_stat_preset_1_remain_point";
        expectedInput = "hyperStatPreset1RemainPoint";
        assertEquals(expectedInput, convert(input));

        input = "v_core_type";
        expectedInput = "vCoreType";
        assertEquals(expectedInput, convert(input));



    }

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

    @Test
    void camelCase_to_snake_case_test(){
        String input = "vCoreName";
        String expectedInput = "v_core_name";
        assertEquals(expectedInput, convertNameForSetter(input));

         input = "characterVCoreEquipment";
         expectedInput = "character_v_core_equipment";
        assertEquals(expectedInput, convertNameForSetter(input));

        input = "hyperStatPreset1";
         expectedInput = "hyper_stat_preset_1";
        assertEquals(expectedInput, convertNameForSetter(input));

        input = "hyperStatPreset1RemainPoint";
         expectedInput = "hyper_stat_preset_1_remain_point";
        assertEquals(expectedInput, convertNameForSetter(input));

        input = "vCoreSkill1";
         expectedInput = "v_core_skill_1";
        assertEquals(expectedInput, convertNameForSetter(input));

        input = "characterVCoreEquipment";
         expectedInput = "character_v_core_equipment";
        assertEquals(expectedInput, convertNameForSetter(input));



    }

    private String convertNameForSetter(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        // We need to know if the previous character was upper case.
        boolean lastCharWasUpper = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If current character is an upper case letter
            if (Character.isUpperCase(currentChar)) {

                // If it's not the first character AND preceded by a lower case character OR a digit OR another upper case character
                if (i > 0 && ((Character.isLowerCase(input.charAt(i - 1)) || Character.isDigit(input.charAt(i - 1))))) {
                    stringBuilder.append('_');
                }

                // If it's not the first char AND it's preceded by an upper case letter AND the next char (if it exists) is lower case
                if (i > 0 && lastCharWasUpper && (i < input.length() - 1 && Character.isLowerCase(input.charAt(i + 1)))) {
                    stringBuilder.append('_');
                }

                stringBuilder.append(Character.toLowerCase(currentChar));
                lastCharWasUpper = true;
            }
            // If current character is a lower case letter
            else if (Character.isLowerCase(currentChar)) {
                // Append underscore before digit if it's preceeded by a number
                if (i > 0 && Character.isDigit(input.charAt(i - 1))) {
                    stringBuilder.append('_');
                }

                stringBuilder.append(currentChar);
                lastCharWasUpper = false;
            }
            // If current character is a digit
            else if (Character.isDigit(currentChar)) {
                if (i > 0 && (Character.isLetter(input.charAt(i - 1)))) {
                    stringBuilder.append('_');
                }

                stringBuilder.append(currentChar);
                lastCharWasUpper = false;
            }
        }

        return stringBuilder.toString();
    }

}
