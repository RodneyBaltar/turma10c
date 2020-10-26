package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * FOr : utilizamos, normalmente quando nao ha intera��o do usu�rio com a repeti��o.
		 * Sintaxe:
		 * 1� Parametro : inicio da repeticao com a definicao do contador
		 * 2� Parametro : condi��o, ou seja, at� quando o la�o vai ser executado
		 * 3� Parametro : qual a forma de contagem
		 */

		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("DIgite um valor"));
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + "x" + contador + " =" + (tabuada * contador));
		}
	}

}
