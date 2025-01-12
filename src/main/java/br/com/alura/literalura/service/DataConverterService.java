package br.com.alura.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataConverterService implements IDataConverterService {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> tClass) {
        try {
            return this.mapper.readValue(json, tClass);
        } catch (JsonProcessingException error) {
            throw new RuntimeException("JSON serialization error. " + error.getMessage());
        }
    }

    @Override
    public <T> List<T> getListData(String json, Class<T> tClass) {
        CollectionType list = mapper.getTypeFactory()
                .constructCollectionType(List.class, tClass);
        try {
            return this.mapper.readValue(json, list);
        } catch (JsonProcessingException error) {
            throw new RuntimeException("JSON serialization error. " + error.getMessage());
        }
    }
}
