package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.AbilityInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;


import java.time.OffsetDateTime;
import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class CharacterAbility {

    /** 조회 기준일 */
    OffsetDateTime date;  

    /** 어빌리티 등급 */
    String abilityGrade;

    /** 어빌리티 정보 */
    List<AbilityInfo> abilityInfo;

    /** 보유 명성치 */
    Long remainFame;
}
