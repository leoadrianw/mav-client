package com.test.httpmethod.controller;

import com.test.httpmethod.request.MavClientImplRequest;
import com.test.httpmethod.response.MavClientImplResponse;
import com.test.httpmethod.service.MavClientImplService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequiredArgsConstructor
public class MavController {
    private final MavClientImplService mavClientImplService;

    @PostMapping(path = "/mav-client", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MavClientImplResponse mavClientImplResponseResponseEntity(@RequestHeader("TEST") String test, @RequestBody MavClientImplRequest request) throws URISyntaxException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("TEST", test);
        return mavClientImplService.mavClient(HttpMethod.POST, new URI("/mav-client"), headers, request);
    }
}
