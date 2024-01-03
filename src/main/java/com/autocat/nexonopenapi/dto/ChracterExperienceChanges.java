package com.autocat.nexonopenapi.dto;

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
public class ChracterExperienceChanges {

    private Long currentCharacterLevel;

    private Long currentCharacterExp;

    private String currentChracterExpRate;

    private Long oldestCharacterLevel;

    private Long oldestCharacterExp;

    private String oldestCharacterExpRate;

    private Double averageGrownPerDay;

    private Double averageGrownRatePerDay;
}