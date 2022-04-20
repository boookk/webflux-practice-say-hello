package com.boookk.webfluxpractice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Component
public class Handler {

    private final WebClient webClient = WebClient.create("http://localhost:8081");
//    public WebClient webClient() {
//        return WebClient
//                .create("http://localhost:8080");
//    }

    public Mono<ServerResponse> hello(ServerRequest request) {
        String name = request.queryParam("name").get();
//        HashMap<String, String> messageMap = new HashMap<>();
//        messageMap.put("to", name);
//        messageMap.put("message", "hello " + name);

//        Mono<String> job = InfoClient.getInfo();
//        System.out.println(InfoClient.getInfo().block());

        Mono<String> job = webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/info-service/uri")
                        .queryParam("name", name)
                        .build()
                ).retrieve()
                .bodyToMono(InfoService.class)
                .map(InfoService::getJob);

        Mono<SayHello> sayHello = job.map(i -> new SayHello(name, i));

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(sayHello);
    }
}
