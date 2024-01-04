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
public class CharacterDojang {

    private OffsetDateTime date;
    private String characterClass;
    private String worldName;

    private Long dojangBestFloor;

    private OffsetDateTime dateDojangRecord;

    private Long dojangBestTime;

}
