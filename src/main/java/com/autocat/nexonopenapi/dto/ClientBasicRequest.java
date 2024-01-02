package com.autocat.nexonopenapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import java.time.LocalDate;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@AllArgsConstructor
@NoArgsConstructor

@Builder
@Data
public class ClientBasicRequest {

    /** 캐릭터 식별자 */
    private String ocid;

    /** 조회기준일(KST, 일 단위 데이토러 시, 분은 일괄 0으로 표기) */
    LocalDate date;
}
