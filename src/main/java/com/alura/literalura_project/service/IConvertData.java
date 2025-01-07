package com.alura.literalura_project.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> className);
}
