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
public class CharacterPopularity {

    /** 조회기준일 */
    private OffsetDateTime date;

    /** 캐릭터 인기도 */
    private Long popularity;
}
