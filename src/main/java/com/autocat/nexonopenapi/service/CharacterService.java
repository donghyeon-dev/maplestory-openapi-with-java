package com.autocat.nexonopenapi.service;

import com.autocat.nexonopenapi.dto.*;
import com.autocat.nexonopenapi.feign.CharacterClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CharacterService {

    private final CharacterClient characterClient;


    public CharacterBasic getCharacterBasicInfo(CharacterOcidRequest request) {
        ClientBasicRequest basicRequestDto = characterClient.getCharacterOcid(request.getCharacterName());

        CharacterBasic characterBasicDto = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterPopularity characterPopularityDto = characterClient.getCharacterPopularity(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterStat characterStatDto = characterClient.getCharacterStat(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterHyperStat characterHyperStat = characterClient.getCharacterHyperStat(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterPropensity characterPropensity = characterClient.getCharacterPropensity(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterAbility characterAbility = characterClient.getCharacterAbility(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterItemEquipment characterItemEquipment = characterClient.getCharacterItemEquipment(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterCashItemEquipment characterCashItemEquipment = characterClient.getCharacterCashItemEquipment(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterSymbolEquipment characterSymbolEquipment = characterClient.getCharacterSymbolEquipment(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterSetEffect characterSetEffect = characterClient.getCharacterSetEffect(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterBeautyEquipment characterBeautyEquipment = characterClient.getCharacterBeautyEquipment(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterAndroidEquipment characterAndroidEquipment = characterClient.getCharacterAndroidEquipment(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterPetEquipment characterPetEquipment = characterClient.getCharacterPetEquipment(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterSkill characterSkill = characterClient.getCharacterSkill(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString(),
                "6");

        CharacterLinkSkill characterLinkSkill = characterClient.getCharacterLinkSkill(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        return characterBasicDto;
    }
}
