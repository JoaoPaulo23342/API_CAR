package com.gitHub.JoaoPaulo23342.API_CAR.Main;

import com.gitHub.JoaoPaulo23342.API_CAR.Service.Server;

import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private Server server = new Server();
    private final String address = "https://parallelum.com.br/fipe/api/v1/";
    public void Menu() {

        var menu = """
                *** OPÇÔES ***
                
                
                Carro
                Moto
                Caminhão
                
                Digite Uma das opções para Consultar: 
                
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
    }
}
