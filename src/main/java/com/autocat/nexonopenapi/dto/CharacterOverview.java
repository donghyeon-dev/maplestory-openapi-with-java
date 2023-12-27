package com.autocat.nexonopenapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterOverview {

    private CharacterBasic characterBasic;
    private CharacterPopularity characterPopularity;
    private CharacterStat characterStat;
    private CharacterHyperStat characterHyperStat;
    private CharacterPropensity characterPropensity;
    private CharacterAbility characterAbility;
    private CharacterItemEquipment characterItemEquipment;
    private CharacterCashItemEquipment characterCashItemEquipment;
    private CharacterSymbolEquipment characterSymbolEquipment;
    private CharacterSetEffect characterSetEffect;
    private CharacterBeautyEquipment characterBeautyEquipment;
    private CharacterAndroidEquipment characterAndroidEquipment;
    private CharacterPetEquipment characterPetEquipment;
    private CharacterSkill characterSkill;
    private CharacterLinkSkill characterLinkSkill;
    private CharacterVMatrix characterVMatrix;
    private CharacterHexaMatrix characterHexaMatrix;
    private CharacterHexaMatrixStat characterHexaMatrixStat;
    private CharacterDojang characterDojang;


}
