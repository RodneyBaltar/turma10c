package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("A");
			System.out.println("Resultado = " + (numero * 10));
			
		}catch (Exception e) {
			System.out.println("DEU RUIM");
			
		}finally {
			System.out.println("AT� LOGO");
		}

	}

}
