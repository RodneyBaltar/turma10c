package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		/*
		 * Tipos de Dados =>
		 
		 * Alfanum�rico (String): � o dado que n�o deve ser utilizado em opera��es aritm�ticas.
		 
		 * Num�rico: � o dado que pode ser utilizado em opera��es aritm�ticas ou ele � um dado chave de busca dentro da aplica��o.
		 * int => para n�meros inteiros
		 * double => para n�meros reais com casas decimais
		 */
         
		 String nome = JOptionPane.showInputDialog ("Digite seu Nome");
		 int    idade= Integer.parseInt(JOptionPane.showInputDialog ("Digite sua Idade"));
		 double altura = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua Altura"));;
		 double peso = Double.parseDouble(JOptionPane.showInputDialog ("Digite seu Peso"));;
		 double imc = peso / (altura*altura);
		 System.out.println("Usu�rio :  "  + nome);
		 System.out.println("Idade   :  "  + idade);
		 System.out.printf("IMC     :  %.2f" , imc);
		 
		 // %f => numeros reais    %s => Strings    %d => inteiros 
		  
	}

}
