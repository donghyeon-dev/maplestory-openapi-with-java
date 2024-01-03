package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class UnionRaider {

    private OffsetDateTime date;
    private List<String> unionRaiderStat;
    private List<String> unionOccupiedStat;
    private List<UnionInnerStat> unionInnerStat;
    private List<UnionBlock> unionBlock;
}
