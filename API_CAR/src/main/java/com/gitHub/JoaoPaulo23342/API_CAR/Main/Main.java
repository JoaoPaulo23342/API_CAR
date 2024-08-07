package com.gitHub.JoaoPaulo23342.API_CAR.Main;

import com.gitHub.JoaoPaulo23342.API_CAR.Model.Models;
import com.gitHub.JoaoPaulo23342.API_CAR.Model.NameCarData;
import com.gitHub.JoaoPaulo23342.API_CAR.Service.CarConvert;
import com.gitHub.JoaoPaulo23342.API_CAR.Service.Server;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private Server server = new Server();
    private final String address = "https://parallelum.com.br/fipe/api/v1/";
    private CarConvert  adapt  = new CarConvert();
    public void Menu() {

        var menu = """
                ** Boas Vindas ao Sistema de Consulta de carros **
                
                *** ESCOLHA UMA DAS OPÇÕES ABAIXO ***
                
                
                Carro
                Moto
                Caminhão
                
                Digite Uma das opções: 
                
                """;

        System.out.println(menu);
        var op = sc.nextLine();
        String uri;
        if (op.toLowerCase().contains("carr")) {
            uri = address + "carros/marcas";

        }else if (op.toLowerCase().contains("mot")) {
            uri = address + "motos/marcas";
        } else {
            uri = address + "caminhoes/marcas";
        }
        var json = server.obterDados(uri);
        System.out.println(json);
        var brands = adapt.getList(json, NameCarData.class);
        brands.stream()
                .sorted(Comparator.comparing(NameCarData::codigoDoCarro))
                .forEach(System.out::println);

        System.out.println("Digite o Codigo da Marca que vc deseja: ");
        var idBrands = sc.nextLine();

        uri = uri + "/" + idBrands + "/modelos";
        json = server.obterDados(uri);
        var modelsList = adapt.obterDados(json, Models.class);
        System.out.println("\nResultado da busca dos modelos referente a essa marca: ");
        modelsList.modelos().stream()
                .sorted(Comparator.comparing(NameCarData::codigoDoCarro))
                .forEach(System.out::println);



    }
}
