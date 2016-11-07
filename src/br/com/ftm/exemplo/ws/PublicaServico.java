package br.com.ftm.exemplo.ws;

import javax.xml.ws.Endpoint;

public class PublicaServico {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String address = "http://localhost:8081/hello";
		System.out.println("Publicando webservice em: " + address);
		System.out.println("WSDL: " + address + "?wsdl");
		HelloWeb servico = new HelloWeb();
		Endpoint endpoint = Endpoint.publish(address, servico);
	}

}
