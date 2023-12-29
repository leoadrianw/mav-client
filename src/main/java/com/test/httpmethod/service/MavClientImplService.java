package com.test.httpmethod.service;

import com.test.httpmethod.mavclient.MavClient;
import com.test.httpmethod.request.MavClientImplRequest;
import com.test.httpmethod.response.MavClientImplResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class MavClientImplService implements MavClient<MavClientImplRequest, MavClientImplResponse> {

    @Override
    public MavClientImplResponse mavClient(HttpMethod httpMethod, URI url, HttpHeaders headers, MavClientImplRequest request) {
        MavClientImplResponse response = new MavClientImplResponse();
        response.setId(request.getId());
        response.setMethod(httpMethod.name());
        response.setUrl(url.getPath());
        response.setHeader(String.valueOf(headers.get("TEST")));

        return response;
    }
}
