package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.HexaStatCore;
import com.autocat.nexonopenapi.dto.inner.PresetHexaStatCore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
