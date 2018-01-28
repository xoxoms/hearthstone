package com.xoxoms.support.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.text.SimpleDateFormat;

/**
 * Created by ms on 2018. 1. 28..
 */
public class JsonUtils {
    private final ObjectMapper objectMapper;

    private JsonUtils() {
        objectMapper = new ObjectMapper();
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // Java Classd에 없는 property를 만난다면 exceptoin 발생 여부
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        objectMapper.configure(MapperFeature.AUTO_DETECT_GETTERS, true);
//        objectMapper.configure(MapperFeature.AUTO_DETECT_IS_GETTERS, true);
//        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
//        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
//        objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//        objectMapper.registerModule(new JavaTimeModule());
    }

    private static JsonUtils getInstance() {
        return new JsonUtils();
    }

    private static ObjectMapper getMapper() {
        return getInstance().objectMapper;
    }

    public static <T> T fromJson(String jsonStr, Class<T> cls) {
        try {
            return getMapper().readValue(jsonStr, cls);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
