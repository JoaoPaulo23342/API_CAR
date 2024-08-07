package com.gitHub.JoaoPaulo23342.API_CAR.Service;

import java.util.List;

public interface ICarConvert {
    <T> T obterDados(String json, Class<T> classe);


    <T> List<T> getList(String json, Class<T> classe);
}
