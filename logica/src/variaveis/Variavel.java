package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		/*
		 * Tipos de Dados =>
		 
		 * Alfanumérico (String): é o dado que não deve ser utilizado em operações aritméticas.
		 
		 * Numérico: é o dado que pode ser utilizado em operações aritméticas ou ele é um dado chave de busca dentro da aplicação.
		 * int => para números inteiros
		 * double => para números reais com casas decimais
		 */
         
		 String nome = JOptionPane.showInputDialog ("Digite seu Nome");
		 int    idade= Integer.parseInt(JOptionPane.showInputDialog ("Digite sua Idade"));
		 double altura = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua Altura"));;
		 double peso = Double.parseDouble(JOptionPane.showInputDialog ("Digite seu Peso"));;
		 double imc = peso / (altura*altura);
		 System.out.println("Usuário :  "  + nome);
		 System.out.println("Idade   :  "  + idade);
		 System.out.printf("IMC     :  %.2f" , imc);
		 
		 // %f => numeros reais    %s => Strings    %d => inteiros 
		  
	}

}
