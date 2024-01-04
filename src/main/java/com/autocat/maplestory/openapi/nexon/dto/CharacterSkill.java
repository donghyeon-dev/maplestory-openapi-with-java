package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.Skill;
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
public class CharacterSkill {
    private OffsetDateTime date;
    private String characterClass;
    private String characterSkillGrade;

    
    private List<Skill> characterSkill;
}
