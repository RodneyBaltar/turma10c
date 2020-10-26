package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// Crie as variaveis para armazenar:
		// nome do produto, código , valor e qtde.
		// exiba no final o nome do produto, o total e o total com 10% de desconto
		
		/*
		 * Parse => conversão entre tipos incompatíveis (String => primitivo)
		 * Primitivo => são os tipos que fazem parte da linguagem (começam com letras minusculas)
		 * Classe Wrapper => são classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 */
		
		 String produto = JOptionPane.showInputDialog ("Digite o nome do Produto");
		 int    codigo  = Integer.parseInt(JOptionPane.showInputDialog ("Digite o Código"));
	     double valor   = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor"));;
	     int    qtde   = Integer.parseInt(JOptionPane.showInputDialog ("Digite a Quantidade"));
	     double total  = qtde*valor;
	     
	     System.out.println("Produto:"            + produto);
	     System.out.println("Total:"              + total);
	     System.out.println("Total com Desconto:" + (total*0.9));

	}

}
