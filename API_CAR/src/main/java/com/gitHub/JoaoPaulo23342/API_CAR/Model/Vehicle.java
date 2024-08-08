package com.gitHub.JoaoPaulo23342.API_CAR.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Vehicle(
        @JsonAlias("Valor") String valorDoVeiculo,
        @JsonAlias("Marca") String marcaDoVeiculo,
        @JsonAlias("Modelo") String modeloDoVeiculo,
        @JsonAlias("AnoModelo") Integer anoDoVeiculo,
        @JsonAlias("Combustivel") String combustivel,
        @JsonAlias("CodigoFipe") String idDaFipe,
        @JsonAlias("MesReferencia") String mesReferencia,
        @JsonAlias("SiglaCombustivel") String siglaDoCombustivel
) {
}
