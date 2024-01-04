package com.autocat.maplestory.openapi.nexon.dto.inner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnionBlock {
    private String blockType;
    private String blockClass;
    private String blockLevel;
    private BlockControlPoint blockControlPoint;
    private List<BlockPosition> blockPosition;
}
