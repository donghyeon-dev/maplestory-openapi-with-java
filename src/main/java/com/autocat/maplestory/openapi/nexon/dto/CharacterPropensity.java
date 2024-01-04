package com.autocat.maplestory.openapi.nexon.dto;

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
public class CharacterPropensity {

    /** 조회 기준일 */
    OffsetDateTime date;

    /** 카리스마 레벨 */
    Long charismaLevel;


    /** 감성 레벨 */
    Long sensibilityLevel;


    /** 통찰력 레벨 */
    Long insightLevel;

    /** 의지 레벨 */
    Long willingnessLevel;

    /** 손재주 레벨 */
    Long handicraftLevel;

    /** 매력 레벨 */
    Long charmLevel;



}
