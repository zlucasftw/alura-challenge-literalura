package br.com.alura.literalura.service;

import java.util.List;

public interface IDataConverterService {
    <T> T getData(String json, Class<T> tClass);
    <T> List<T> getListData(String json, Class<T> tClass);
}
