package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.UnionRaider;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class UnionOverview {

    Union union;

    UnionRaider unionRaider;
}
