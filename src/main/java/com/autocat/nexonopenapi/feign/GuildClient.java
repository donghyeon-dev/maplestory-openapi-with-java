package com.autocat.nexonopenapi.feign;

import com.autocat.nexonopenapi.dto.Guild;
import com.autocat.nexonopenapi.dto.GuildBasic;
import com.autocat.nexonopenapi.dto.Union;
import com.autocat.nexonopenapi.dto.inner.UnionRaider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * GuildClient 지정된 URL로 GET 요청을 보내는 Feign 클라이언트 인터페이스입니다.
 * 서버에서 길드 데이터를 가져오는 메소드가 포함되어 있습니다.
 *
 * @author donghyeon.park
 */
@FeignClient(name = "Guild", url = "https://open.api.nexon.com", configuration = FeignConfig.class)
public interface GuildClient {


    /**
     * 길드 식별자(oguild_id) 정보를 조회합니다.
     *
     * @param guildName 길드 명
     * @param worldName 월드 명
     * @return 길드 식별자(oguild_id) 정보를 포함한 Guild 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/guild/id")
    Guild fetchGuildId(@RequestParam(value = "guild_name") String guildName
            , @RequestParam(value = "world_name") String worldName);

    /**
     * 캐릭터의 유니온 공격대 정보를 조회합니다.
     * @param ocid - 캐릭터의 OCID
     * @param date - 정보를 얻고자 하는 날짜
     * @return 해당 날짜의 캐릭터 유니온 공격대 정보를 포함한 UnionRaider 객체를 반환합니다.
     */
    @GetMapping("/maplestory/v1/guild/basic")
    GuildBasic fetchGuildBasic(@RequestParam(value = "oguild_id") String oguildId
            , @RequestParam(value = "date") String date);

}
