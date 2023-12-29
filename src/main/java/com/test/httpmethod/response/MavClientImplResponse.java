package com.test.httpmethod.response;

import lombok.Setter;

@Setter
public class MavClientImplResponse implements Response {
    private String id;
    private String method;
    private String url;
    private String header;
}
