package com.autocat.nexonopenapi.service;

import com.autocat.nexonopenapi.dto.*;
import com.autocat.nexonopenapi.feign.CharacterClient;
import feign.Feign;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


@Slf4j
@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterClient characterClient;


    public CharacterOverview getCharacterBasicInfo(CharacterOcidRequest request) {
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

        CharacterVMatrix characterVMatrix = characterClient.getCharacterVMatrix(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterHexaMatrix characterHexaMatrix = characterClient.getCharacterHexaMatrix(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterHexaMatrixStat characterHexaMatrixStat = characterClient.getCharacterHexaMatrixStat(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterDojang characterDojang = characterClient.getCharacterDojang(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        CharacterOverview characterOverview = CharacterOverview.builder()
                .characterBasic(characterBasicDto)
                .characterPopularity(characterPopularityDto)
                .characterStat(characterStatDto)
                .characterHyperStat(characterHyperStat)
                .characterPropensity(characterPropensity)
                .characterAbility(characterAbility)
                .characterItemEquipment(characterItemEquipment)
                .characterCashItemEquipment(characterCashItemEquipment)
                .characterSymbolEquipment(characterSymbolEquipment)
                .characterSetEffect(characterSetEffect)
                .characterBeautyEquipment(characterBeautyEquipment)
                .characterAndroidEquipment(characterAndroidEquipment)
                .characterPetEquipment(characterPetEquipment)
                .characterSkill(characterSkill)
                .characterLinkSkill(characterLinkSkill)
                .characterVMatrix(characterVMatrix)
                .characterHexaMatrix(characterHexaMatrix)
                .characterHexaMatrixStat(characterHexaMatrixStat)
                .characterDojang(characterDojang)
                .build();

        return characterOverview;
    }

    public CharacterHyperStat getCharacterHyperStat(CharacterOcidRequest request) {
        ClientBasicRequest basicRequestDto = characterClient.getCharacterOcid(request.getCharacterName());
        CharacterHyperStat characterHyperStat = characterClient.getCharacterHyperStat(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        return characterHyperStat;

    }

    public CharacterVMatrix getCharacterVMatrix(CharacterOcidRequest request) {
        ClientBasicRequest basicRequestDto = characterClient.getCharacterOcid(request.getCharacterName());
        CharacterVMatrix characterVMatrix = characterClient.getCharacterVMatrix(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        return characterVMatrix;

    }

    public CharacterBasic getCharacterBasic(CharacterOcidRequest request) {
        ClientBasicRequest basicRequestDto = characterClient.getCharacterOcid(request.getCharacterName());
        CharacterBasic characterBasicDto = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        return characterBasicDto;
    }


    public ChracterExperienceChanges getCharacterExperienceChanges(CharacterOcidRequest request) {
        ClientBasicRequest basicRequestDto = characterClient.getCharacterOcid(request.getCharacterName());
        CharacterBasic characterBasicDay1 = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
        CharacterBasic characterBasicDay2 = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(2).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
        CharacterBasic characterBasicDay3 = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(3).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
        CharacterBasic characterBasicDay4 = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(4).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
        CharacterBasic characterBasicDay5 = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(5).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
        CharacterBasic characterBasicDay6 = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(6).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
        CharacterBasic characterBasicDay7 = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                LocalDate.now().minusDays(7).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());

        List<CharacterBasic> characterBasicList = new ArrayList<>();

        for(int i =1; i <= 7; i++){
            CharacterBasic characterBasic = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                    LocalDate.now().minusDays(i).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
            characterBasicList.add(characterBasic);
        };

        OptionalDouble averageGrownPerDay = characterBasicList.stream()
                .mapToInt(c -> c.getCharacterExp().intValue()).average();
        OptionalDouble averageGrownRatePerDay = characterBasicList.stream()
                .mapToDouble(c -> Double.parseDouble(c.getCharacterExpRate())).average();



        ChracterExperienceChanges.builder()
                .currentCharacterExp(characterBasicDay7.getCharacterExp())
                .currentCharacterLevel(characterBasicDay7.getCharacterLevel())
                .currentChracterExpRate(characterBasicDay7.getCharacterExpRate())
                .oldestCharacterExp(characterBasicDay1.getCharacterExp())
                .oldestCharacterLevel(characterBasicDay1.getCharacterLevel())
                .oldestCharacterExpRate(characterBasicDay1.getCharacterExpRate())
//                .averageGrownPerDay() // Todo : 평균일간성장값을 알기 위해 일간성장값이 필요(배열 순서를 거꾸로 for문, i.getExp - (i-1).getExp)
//                .averageGrownRatePerDay() // Todo : 평균일간성장율을 알기 위해 일간성장율이 필요
                .build();




        return ChracterExperienceChanges.builder().build();
    }
}
