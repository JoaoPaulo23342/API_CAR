package com.gitHub.JoaoPaulo23342.API_CAR.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Models(List<NameCarData> modelos)   {

}
