package com.gitHub.JoaoPaulo23342.API_CAR.Service;

public interface ICarConvert {
    <T> T obterDados(String json, Class<T> classe);
}
