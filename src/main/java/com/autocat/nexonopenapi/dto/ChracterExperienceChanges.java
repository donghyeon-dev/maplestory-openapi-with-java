package com.autocat.nexonopenapi.dto;

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
@Builder
public class ChracterExperienceChanges {

    /** 캐릭터명 */
    private String characterName;

    /** 캐릭터 직업 */
    private String characterClass;

    /** 월드명 */
    private String worldName;

    /** 현재 캐릭터 레벨 */
    private Long currentCharacterLevel;

    /** 현재 캐릭터 경험치 */
    private Long currentCharacterExp;

    /** 현재 캐릭터 경험치 퍼센트 */
    private Double currentChracterExpRate;

    /** 7일전 캐릭터 레벨 */
    private Long oldestCharacterLevel;

    /** 7일전 캐릭터 경험치 */
    private Long oldestCharacterExp;

    /** 7일전 캐릭터 경험치 퍼센트 */
    private Double oldestCharacterExpRate;

    /** 일일평균경험치획득량 */
    private Long averageGrownPerDay;

    /** 일일평균경험치획득률 */
    private Double averageGrownRatePerDay;
}
