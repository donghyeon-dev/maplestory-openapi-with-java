package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Title {
    private String titleName;
    private String titleIcon;
    private String titleDescription;
    private OffsetDateTime dateExpire;
    private OffsetDateTime dateOptionExpire;
}
