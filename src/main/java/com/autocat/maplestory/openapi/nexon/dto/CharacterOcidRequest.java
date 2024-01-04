package com.autocat.maplestory.openapi.nexon.dto;

import lombok.*;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@AllArgsConstructor
@NoArgsConstructor

@Builder
@Data
public class CharacterOcidRequest {

    /** 캐릭터명 **/
    private String characterName;
}
