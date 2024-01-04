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
public class Union {

    OffsetDateTime date;

    /** 유니온 레벨 */
    Long unionLevel;

    /** 유니온 등급 */
    String unionGrade;
}
