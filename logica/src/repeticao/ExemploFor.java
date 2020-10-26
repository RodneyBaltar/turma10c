package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * FOr : utilizamos, normalmente quando nao ha interação do usuário com a repetição.
		 * Sintaxe:
		 * 1º Parametro : inicio da repeticao com a definicao do contador
		 * 2º Parametro : condição, ou seja, até quando o laço vai ser executado
		 * 3º Parametro : qual a forma de contagem
		 */

		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("DIgite um valor"));
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + "x" + contador + " =" + (tabuada * contador));
		}
	}

}
