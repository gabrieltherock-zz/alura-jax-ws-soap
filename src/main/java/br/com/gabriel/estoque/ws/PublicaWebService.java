package br.com.gabriel.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

    public static void main(String[] args) {

        EstoqueWS service = new EstoqueWS();
        String url = "http://localhost:8080/estoquews";

        System.out.println("Servidor rodando em " + url + "?wsdl");
        Endpoint.publish(url, service);
    }
}
