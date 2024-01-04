package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.CashItem;
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
public class CharacterCashItemEquipment {

    private OffsetDateTime date;
    private String characterGender;
    private String characterClass;
    private Long presetNo;

    private List<CashItem> cashItemEquipmentPreset1;

    private List<CashItem> cashItemEquipmentPreset2;

    private List<CashItem> cashItemEquipmentPreset3;

    private List<CashItem> additionalCashItemEquipmentPreset1;

    private List<CashItem> additionalCashItemEquipmentPreset2;

    private List<CashItem> additionalCashItemEquipmentPreset3;
}
