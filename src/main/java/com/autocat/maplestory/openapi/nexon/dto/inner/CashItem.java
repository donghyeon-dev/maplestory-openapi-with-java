package com.autocat.maplestory.openapi.nexon.dto.inner;

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
public class CashItem {

    private String cashItemEquipmentPart;
    private String cashItemEquipmentSlot;
    private String cashItemName;
    private String cashItemIcon;
    private String cashItemDescription;
    private OffsetDateTime dateExpire;
    private OffsetDateTime dateOptionExpire;
    private String cashItemLabel;
    private String basePresetItemDisableFlag;

    private List<CashItemOption> cashItemOption;

    private List<CashItemColoringPrism> cashItemColoringPrism;
}
