package com.autocat.maplestory.openapi.nexon.dto;

import lombok.*;


import java.time.OffsetDateTime;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterBasic {

    /** 캐릭터 식별자 */
    private String ocid;

    /** 조회기준일(KST, 일 단위 데이토러 시, 분은 일괄 0으로 표기) */
    OffsetDateTime date;

    /** 캐릭터 명 */
    String characterName;

    /** 월드 명 */
    String worldName;

    /** 캐릭터 성별 */
    String characterGender;

    /** 캐릭터 직업 */
    String characterClass;

    /** 캐릭터 전직차수 */
    String characterClassLevel;

    /** 캐릭터 레벨 */
    Long characterLevel;

    /** 현재 레벨에서 보유한 경험치 */
    Long characterExp;

    /** 현재 레벨에서 보유한 경험치 퍼센트 */
    Double characterExpRate;

    /** 캐릭터 소속 길드 명 */
    String characterGuildName;

    /** 캐릭터 외형 이미지 */
    String characterImage;
}
