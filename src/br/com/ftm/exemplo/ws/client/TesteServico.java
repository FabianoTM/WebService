package br.com.ftm.exemplo.ws.client;

public class TesteServico {
	
	public static void main(String[] args) {
		HelloWeb port = new HelloWebService().getHelloWebPort();
		System.out.println("Resposta da chamada do webservice: ");
		System.out.println(port.hello(" usuário"));
	}

}
