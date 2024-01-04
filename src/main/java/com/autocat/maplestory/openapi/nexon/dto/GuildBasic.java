package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.GuildSkill;
import com.autocat.maplestory.openapi.nexon.dto.inner.GuildNoblesseSkill;
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
public class GuildBasic {

    private OffsetDateTime date;

    private String worldName;
    private String guildName;
    private Long guildLevel;
    private Long guildFame;
    private Long guildPoint;
    private String guildMasterName;
    private Long guildMemberCount;
    private List<String> guildMember;
    private List<GuildSkill> guildSkill;
    private List<GuildNoblesseSkill> guildNoblesseSkill;
    private String guildMark;
    /**
     * 커스텀 길드 마크 (base64 인코딩 형식)
     */
    private String guildMarkCustom;

}
