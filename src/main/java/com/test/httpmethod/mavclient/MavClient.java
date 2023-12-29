package com.test.httpmethod.mavclient;

import com.test.httpmethod.request.Request;
import com.test.httpmethod.response.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import java.net.URI;

public interface MavClient<R extends Request, S extends Response> {
    <T> T mavClient(HttpMethod httpMethod, URI url, HttpHeaders httpHeaders, R Request);
}
