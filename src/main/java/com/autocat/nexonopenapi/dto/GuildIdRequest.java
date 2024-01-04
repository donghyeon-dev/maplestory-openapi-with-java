package com.autocat.nexonopenapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GuildIdRequest {
    /** 길드 명 */
    private String guildName;

    /** 월드 명 */
    private String worldName;
}
