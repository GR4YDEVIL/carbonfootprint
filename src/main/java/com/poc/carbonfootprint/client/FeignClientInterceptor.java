package com.poc.carbonfootprint.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

@Component
public class FeignClientInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("X-RapidAPI-Key", "TODO - ADD AUTH");
        template.header("X-RapidAPI-Host", "carbonfootprint1.p.rapidapi.com");
    }
}
