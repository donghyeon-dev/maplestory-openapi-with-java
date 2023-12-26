package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.OffsetDateTime;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Equipment {

    @Comment("장비 부위")
    private String itemEquipmentPart;

    @Comment("장비 슬롯 위치")
    private String itemEquipmentSlot;

    private String itemName;

    private String itemIcon;

    private String itemDescription;

    private String itemShapeName;

    private String itemShapeIcon;

    private String itemGender;

    @JsonProperty("item_total_option")
    private Option itemTotalOption;

    @JsonProperty("item_base_option")
    private Option itemBaseOption;

    private String potentialOptionGrade;

    private String additionalPotentialOptionGrade;

    @JsonProperty("potential_option_1")
    private String potentialOption1;

    @JsonProperty("potential_option_2")
    private String potentialOption2;

    @JsonProperty("potential_option_3")
    private String potentialOption3;

    private String additionalPotentialOption1;

    private String additionalPotentialOption2;

    private String additionalPotentialOption3;

    @JsonProperty("equipment_level_increase")
    private Long equipmentLevelIncrease;

    @JsonProperty("item_exceptional_option")
    private Option itemExceptionalOption;

    @JsonProperty("item_add_option")
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

    @JsonProperty("item_etc_option")
    private Option itemEtcOption;

    private String starforce;

    private String starforceScrollFlag;

    @JsonProperty("item_starforce_option")
    private Option itemStarforceOption;

    private Long specialRingLevel;

    private OffsetDateTime dateExpire;


}
