package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		
	
				/*
				 * Parse => convers�o entre tipos incompat�veis (String => primitivo)
				 * Primitivo => s�o os tipos que fazem parte da linguagem (come�am com letras minusculas)
				 * 
				 * boolean => armazena True ou False
				 * char => armazena um caracter
				 * byte => numeros inteiros (-127 // +128)
				 * short => numeros inteiros (-32k // + 32k)
				 * int => numeros inteiros (-2bilhoes // +2bilhoes)
				 * long => numeros inteiros 
				 * float => numeros reais
				 * double => numeros reais (possui o dobro de precis�o nas casas decimais)
				 * 
				 * Classe Wrapper => s�o classes que apoiam os tipos primitivos. Exemplo: parse().
				 * int => Integer
				 * double => Double
				 * float => Float
				 * boolean = Boolean
				 */
		
		 String nome = JOptionPane.showInputDialog ("Digite o nome");
		 String disciplina = JOptionPane.showInputDialog ("Digite a Disciplina");
		 float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		 float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		 float media = (nota1+nota2)/2;
		 System.out.printf("%s sua m�dia na disciplina %s foi de %.2f", nome, disciplina, media);


	}

}
