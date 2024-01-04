package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.Equipment;
import com.autocat.maplestory.openapi.nexon.dto.inner.Title;
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
public class CharacterItemEquipment {

    /** 조회 기준일 */
    OffsetDateTime date;

    /** 캐릭터 성별 */
    String characterGender;

    /** 캐릭터 직업 */
    String characterClass;

    private List<Equipment> itemEquipment;

    private Title title;

    private List<Equipment> dragonEquipment;

    private List<Equipment> mechanicEquipment;
}
