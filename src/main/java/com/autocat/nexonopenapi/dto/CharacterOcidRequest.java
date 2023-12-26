package com.autocat.nexonopenapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@Data
public class CharacterOcidRequest {

    /** 캐릭터명 **/
    private String characterName;
}
