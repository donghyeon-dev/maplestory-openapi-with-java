package com.autocat.nexonopenapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;


@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterBasicEntity {

    @Id
    @Comment("캐릭터 식별자")
    private String ocid;

    @Column
    @Comment("조회기준일(KST, 일 단위 데이토러 시, 분은 일괄 0으로 표기)")
    LocalDateTime date;

    @Column
    @Comment("캐릭터 명")
    String characterName;

    @Column
    @Comment("월드 명")
    String worldName;

    @Column
    @Comment("캐릭터 성별")
    String characterGender;

    @Column
    @Comment("캐릭터 직업")
    String characterClass;

    @Column
    @Comment("캐릭터 전직차수")
    String characterClassLevel;

    @Column
    @Comment("캐릭터 레벨")
    Long characterLevel;

    @Column
    @Comment("현재 레벨에서 보유한 경험치")
    Long characterExp;

    @Column
    @Comment("현재 레벨에서 보유한 경험치 퍼센트")
    String characterExpRate;

    @Column
    @Comment("캐릭터 소속 길드 명")
    String characterGuildName;

    @Column
    @Comment("캐릭터 외형 이미지")
    String characterImage;
}
