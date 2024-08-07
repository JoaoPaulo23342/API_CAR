package com.gitHub.JoaoPaulo23342.API_CAR.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NameCarData(
        @JsonAlias ("codigo") String codigoDoCarro,
        @JsonAlias ("nome") String nomeDoCarro) {

}
