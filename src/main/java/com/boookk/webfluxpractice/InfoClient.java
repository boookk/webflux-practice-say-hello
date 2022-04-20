package com.boookk.webfluxpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class InfoClient {

    @Bean
    public WebClient webClient() {
        return WebClient
                .create("http://localhost:8080");
    }
//    public InfoClient(WebClient.Builder builder) {
//        this.client = builder.baseUrl("http://localhost:8080").build();
//    }

//    public Mono<String> getInfo() {
//        return this.client.get().uri("/info-service/uri").accept(MediaType.APPLICATION_JSON)
//                .retrieve()
//                .bodyToMono(InfoService.class)
//                .map(InfoService::getJob);
//    }

}
