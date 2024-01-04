package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.Face;
import com.autocat.maplestory.openapi.nexon.dto.inner.Hair;
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
@Builder
public class CharacterBeautyEquipment {
    private OffsetDateTime date;
    private String characterGender;
    private String characterClass;
    private Hair characterHair;
    private Face characterFace;
    private String characterSkinName;
    private Hair additionalCharacterHair;
    private Face additionalCharacterFace;
    private String additionalCharacterSkinName;
}
