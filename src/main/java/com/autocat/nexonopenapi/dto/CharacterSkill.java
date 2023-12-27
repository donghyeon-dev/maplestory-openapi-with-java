package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.Skill;
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
public class CharacterSkill {
    private OffsetDateTime date;
    private String characterClass;
    private String characterSkillGrade;

    @JsonProperty("character_skill")
    private List<Skill> characterSkill;
}
