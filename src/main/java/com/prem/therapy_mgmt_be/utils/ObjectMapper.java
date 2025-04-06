package com.prem.therapy_mgmt_be.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class ConsoleMapper {

    public String toString(Object mapData) {
        ObjectMapper mapper=new ObjectMapper();
        try {
            return mapper.writeValueAsString(mapData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
