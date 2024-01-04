package com.autocat.nexonopenapi.feign;

import com.autocat.nexonopenapi.dto.*;
import com.autocat.nexonopenapi.dto.inner.UnionRaider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * CharacterClient는 지정된 URL로 GET 요청을 보내는 Feign 클라이언트 인터페이스입니다.
 * 서버에서 다양한 형태의 캐릭터 데이터를 가져오는 메소드가 포함되어 있습니다.
 *
 * @author donghyeon.park
 */
@FeignClient(name = "Union", url = "https://open.api.nexon.com", configuration = FeignConfig.class)
public interface UnionClient {


    /**
     * 캐릭터의 유니온 레벨 및 유니온 등급 정보를 조회합니다.
     *
     * @param ocid 캐릭터의 OCID
     * @param date 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 유니온 정보를 포함한 Union 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/user/union")
    Union getUnion(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

    /**
     * 캐릭터의 유니온 공격대 정보를 조회합니다.
     * @param ocid - 캐릭터의 OCID
     * @param date - 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 유니온 공격대 정보를 포함한 UnionRaider 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/user/union-raider")
    UnionRaider getUnionRaider(@RequestParam(value = "ocid") String ocid
            , @RequestParam(value = "date") String date);

}
