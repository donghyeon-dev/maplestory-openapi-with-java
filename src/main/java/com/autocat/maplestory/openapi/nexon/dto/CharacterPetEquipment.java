package com.autocat.maplestory.openapi.nexon.dto;

import com.autocat.maplestory.openapi.nexon.dto.inner.PetAutoSkill;
import com.autocat.maplestory.openapi.nexon.dto.inner.PetEquipment;
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
public class CharacterPetEquipment {

    private OffsetDateTime date;

    private String pet1Name;

    private String pet1Nickname;

    private String pet1Icon;

    private String pet1Description;

    private PetEquipment pet1Equipment;

    
    private PetAutoSkill pet1AutoSkill;

    
    private String pet1PetType;

    
    private List<String> pet1Skill;

    
    private OffsetDateTime pet1DateExpire;

    
    private String pet2Name;

    
    private String pet2Nickname;

    
    private String pet2Icon;

    
    private String pet2Description;

    
    private PetEquipment pet2Equipment;

    
    private PetAutoSkill pet2AutoSkill;

    
    private String pet2PetType;

    
    private List<String> pet2Skill;

    
    private OffsetDateTime pet2DateExpire;

    
    private String pet3Name;

    
    private String pet3Nickname;

    
    private String pet3Icon;

    
    private String pet3Description;

    
    private PetEquipment pet3Equipment;

    
    private PetAutoSkill pet3AutoSkill;

    
    private String pet3PetType;

    
    private List<String> pet3Skill;

    
    private OffsetDateTime pet3DateExpire;

}
