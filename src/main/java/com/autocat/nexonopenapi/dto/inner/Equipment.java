package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
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
public class Equipment {

    /** 장비 부위 */
    private String itemEquipmentPart;

    /** 장비 슬롯 위치 */
    private String itemEquipmentSlot;

    private String itemName;

    private String itemIcon;

    private String itemDescription;

    private String itemShapeName;

    private String itemShapeIcon;

    private String itemGender;

    
    private Option itemTotalOption;

    
    private Option itemBaseOption;

    private String potentialOptionGrade;

    private String additionalPotentialOptionGrade;

    
    private String potentialOption1;

    
    private String potentialOption2;

    
    private String potentialOption3;

    
    private String additionalPotentialOption1;

    
    private String additionalPotentialOption2;

    
    private String additionalPotentialOption3;

    private Long equipmentLevelIncrease;

    
    private Option itemExceptionalOption;

    
    private Option itemAddOption;

    private Long growthExp;

    private Long growthLevel;

    private String scrollUpgrade;

    private String cuttableCount;

    private String goldenHammerFlag;

    private String scrollResilienceCount;

    private String scrollUpgradeableCount;

    private String soulName;

    private String soulOption;

    
    private Option itemEtcOption;

    private String starforce;

    private String starforceScrollFlag;

    
    private Option itemStarforceOption;

    private Long specialRingLevel;

    private OffsetDateTime dateExpire;


}
