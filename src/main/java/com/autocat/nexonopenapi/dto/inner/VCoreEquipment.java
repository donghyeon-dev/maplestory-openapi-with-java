package com.autocat.nexonopenapi.dto.inner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VCoreEquipment {
    private String slotId;

    private Long slotLevel;

    
    private String vCoreName;

    
    private String vCoreType;

    
    private Long vCoreLevel;

    
    private String vCoreSkill1;

    
    private String vCoreSkill2;

    
    private String vCoreSkill3;

    // the first letter of the variable name when it generates getter/setter methods should be Upper for default.
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public void setSlotLevel(Long slotLevel) {
        this.slotLevel = slotLevel;
    }

    public void setvCoreName(String vCoreName) {
        this.vCoreName = vCoreName;
    }

    public void setvCoreType(String vCoreType) {
        this.vCoreType = vCoreType;
    }

    public void setvCoreLevel(Long vCoreLevel) {
        this.vCoreLevel = vCoreLevel;
    }

    public void setvCoreSkill1(String vCoreSkill1) {
        this.vCoreSkill1 = vCoreSkill1;
    }

    public void setvCoreSkill2(String vCoreSkill2) {
        this.vCoreSkill2 = vCoreSkill2;
    }

    public void setvCoreSkill3(String vCoreSkill3) {
        this.vCoreSkill3 = vCoreSkill3;
    }
}
