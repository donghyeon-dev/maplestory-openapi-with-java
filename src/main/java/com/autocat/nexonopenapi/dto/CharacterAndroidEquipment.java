package com.autocat.nexonopenapi.dto;

import com.autocat.nexonopenapi.dto.inner.CashItem;
import com.autocat.nexonopenapi.dto.inner.Equipment;
import com.autocat.nexonopenapi.dto.inner.Face;
import com.autocat.nexonopenapi.dto.inner.Hair;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("android_hair")
    private Hair androidHair;
    @JsonProperty("android_face")
    private Face androidFace;
    private String androidSkinName;

    @JsonProperty("android_cash_item_equipment")
    private List<CashItem> androidCashItemEquipment;

    private String androidEarSensorClipFlag;
}
