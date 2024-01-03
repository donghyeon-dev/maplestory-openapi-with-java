package com.autocat.nexonopenapi.feign;

import com.autocat.nexonopenapi.config.CustomPropertyNamingStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import feign.Contract;
import feign.RequestInterceptor;
import feign.codec.Decoder;
import feign.optionals.OptionalDecoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * FeignConfig는 Feign Client의 설정을 담당하는 클래스로 아래와 같은 역할을 합니다.
 * 1. FeignClient를 통해 받아온 Response에 대해서 snake_case를 camelCase로 변환하는 역할을 합니다.
 * 2. FeignClient를 통해 요청을 보낼 때, Header에 API Key를 담아 보내는 역할을 합니다.
 */
//@Configuration
public class FeignConfig {
    @Bean
    public Decoder feignDecoder() {
        final ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(
                new MappingJackson2HttpMessageConverter(customObjectMapper()));
        return new OptionalDecoder(new ResponseEntityDecoder(new SpringDecoder(objectFactory)));
    }

    @Bean
    public Contract feignContract() {
        return new SpringMvcContract();
    }

    private ObjectMapper customObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(new CustomPropertyNamingStrategy());
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("x-nxopen-api-key", System.getenv("NXOPEN_API_KEY"));
        };
    }
}
