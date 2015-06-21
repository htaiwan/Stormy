package com.htaiwan.app.stormy.weather;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by app on 6/21/15.
 */
public class JacksonMapper {
    private static final ObjectMapper mapper = new ObjectMapper();

    private JacksonMapper() {

    }

    public static ObjectMapper getInstance() {
        return mapper;
    }
}
