package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número a ser advinhado"));
		int chute = 0;
		int contador = 0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o número"));
			contador=contador+1;
			
		}while (numero!=chute);
		System.out.println(" Parabéns vc acertou " + contador + " tentativa(s).");

	}

}
