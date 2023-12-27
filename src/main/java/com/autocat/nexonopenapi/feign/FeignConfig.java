package com.autocat.nexonopenapi.feign;

import com.autocat.nexonopenapi.config.CustomSnakeCaseStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import feign.RequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.Collections;

/**
 * FeignConfig는 Feign Client의 설정을 담당하는 클래스로 아래와 같은 역할을 합니다.
 * 1. FeignClient를 통해 받아온 Response에 대해서 snake_case를 camelCase로 변환하는 역할을 합니다.
 * 2. FeignClient를 통해 요청을 보낼 때, Header에 API Key를 담아 보내는 역할을 합니다.
 */
public class FeignConfig {

    @Bean
    public Encoder feignEncoder() {
        return new SpringEncoder(feignHttpMessageConverter());
    }

    @Bean
    public Decoder feignDecoder() {
        return new SpringDecoder(feignHttpMessageConverter());
    }

    @Bean
    public ObjectFactory<HttpMessageConverters> feignHttpMessageConverter() {
        final HttpMessageConverters httpMessageConverters = new HttpMessageConverters(new CustomMappingJackson2HttpMessageConverter());
        return () -> httpMessageConverters;
    }

    // Custom Converter for Snake Case to Camel Case
    private static class CustomMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {

        public CustomMappingJackson2HttpMessageConverter() {
            getObjectMapper().registerModule(new JavaTimeModule()).setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        }
    }

    @Bean
    public RequestInterceptor requestInterceptor(){
        return requestTemplate -> {
            requestTemplate.header("x-nxopen-api-key", System.getenv("NXOPEN_API_KEY"));
        };
    }
}
