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
public class SetEffect {
    private String setName;

    private Long totalSetCount;

    
    private List<SetEffectInfo> setEffectInfo;

}
