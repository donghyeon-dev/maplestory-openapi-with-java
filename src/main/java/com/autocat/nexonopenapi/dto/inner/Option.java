package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Option {

    private String str;

    private String dex;

    @JsonProperty("int")
    private String ints;

    private String luk;

    private String maxHp;

    private String maxMp;

    private String attackPower;

    private String magicPower;

    private String armor;

    private String speed;

    private String jump;

    private String bossDamage;

    private String ignoreMonsterArmor;

    private String allStat;

    private String damage;

    private Long equipmentLevelDecrease;

    private String maxHpRate;

    private String maxMpRate;

    private Long baseEquipmentLevel;
}
