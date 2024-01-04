package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.Face;
import com.autocat.maplestory.openapi.nexon.dto.inner.Hair;
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
public class CharacterAndroidEquipment {

    private OffsetDateTime date;
    private String androidName;
    private String androidNickname;
    private String androidIcon;
    private String androidDescription;
    private Hair androidHair;
    private Face androidFace;
    private String androidSkinName;

    private List<CashItem> androidCashItemEquipment;

    private String androidEarSensorClipFlag;
}
