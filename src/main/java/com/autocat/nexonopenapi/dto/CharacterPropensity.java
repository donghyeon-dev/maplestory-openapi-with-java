package com.autocat.nexonopenapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.OffsetDateTime;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class CharacterPropensity {

    @Comment("조회 기준일")
    OffsetDateTime date;

    @Comment("카리스마 레벨")
    Long charismaLevel;


    @Comment("감성 레벨")
    Long sensibilityLevel;


    @Comment("통찰력 레벨")
    Long insightLevel;

    @Comment("의지 레벨")
    Long willingnessLevel;

    @Comment("손재주 레벨")
    Long handicraftLevel;

    @Comment("매력 레벨")
    Long charmLevel;



}
