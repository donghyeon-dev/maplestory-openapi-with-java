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
import java.util.Comparator;
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

        List<CharacterBasic> characterBasicList = new ArrayList<>();
        for(int i =1; i <= 7; i++){
            CharacterBasic characterBasic = characterClient.getCharacterBasic(basicRequestDto.getOcid(),
                    LocalDate.now().minusDays(i).format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
            characterBasicList.add(characterBasic);
        };

        characterBasicList = characterBasicList.stream()
                .sorted(Comparator.comparing(CharacterBasic::getCharacterLevel).reversed()
                        .thenComparing(CharacterBasic::getCharacterExp).reversed())
                .toList();

        List<Long> characterExpList = new ArrayList<>();
        List<Double> characterExpRateList = new ArrayList<>();
        for(int i = 0; i  < characterBasicList.size()-1; i++){
            characterExpList.add(characterBasicList.get(i).getCharacterExp() - characterBasicList.get(i+1).getCharacterExp());
            characterExpRateList.add(characterBasicList.get(i).getCharacterExpRate() - characterBasicList.get(i+1).getCharacterExpRate());

        }

        Double averageGrownPerDay = characterExpList.stream().mapToLong(Long::longValue).average().orElseGet(() -> Double.NaN);
        Double averageGrownRatePerDay = characterExpRateList.stream().mapToDouble(Double::doubleValue).average().orElseGet(() -> Double.NaN);

        return ChracterExperienceChanges.builder()
                .characterClass(characterBasicList.get(0).getCharacterClass())
                .characterName(characterBasicList.get(0).getCharacterName())
                .worldName(characterBasicList.get(0).getWorldName())
                .currentCharacterExp(characterBasicList.stream().mapToLong(CharacterBasic::getCharacterExp).max().orElseGet(() -> 0))
                .currentCharacterLevel(characterBasicList.stream().mapToLong(CharacterBasic::getCharacterLevel).max().orElseGet(() -> 0))
                .currentChracterExpRate(characterBasicList.stream().mapToDouble(CharacterBasic::getCharacterExp).max().orElseGet(() -> Double.NaN))
                .oldestCharacterExp(characterBasicList.stream().mapToLong(CharacterBasic::getCharacterExp).min().orElseGet(() -> 0))
                .oldestCharacterLevel(characterBasicList.stream().mapToLong(CharacterBasic::getCharacterLevel).min().orElseGet(() -> 0))
                .oldestCharacterExpRate(characterBasicList.stream().mapToDouble(CharacterBasic::getCharacterExp).min().orElseGet(() -> Double.NaN))
                .averageGrownPerDay(averageGrownPerDay.longValue())
                .averageGrownRatePerDay(averageGrownRatePerDay)
                .build();
    }
}
