package com.boookk.webfluxpractice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Component
public class Handler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        String name = request.queryParam("name").get();
        HashMap<String, String> messageMap = new HashMap<>();
        messageMap.put("to", name);
        messageMap.put("message", "hello " + name);

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(messageMap);
    }
}
