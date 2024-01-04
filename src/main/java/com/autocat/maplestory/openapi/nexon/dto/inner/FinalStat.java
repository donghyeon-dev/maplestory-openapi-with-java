package com.autocat.maplestory.openapi.nexon.dto.inner;


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
public class FinalStat {

    /** 스텟 명 */
    private String statName;

    /** 스텟 값 */
    private String statValue;


}
