package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.HexaStatCore;
import com.autocat.maplestory.openapi.nexon.dto.inner.PresetHexaStatCore;
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
public class CharacterHexaMatrixStat {

    private OffsetDateTime date;
    private String characterClass;

    private List<HexaStatCore> characterHexaStatCore;

    private List<PresetHexaStatCore> presetHexaStatCore;
}
