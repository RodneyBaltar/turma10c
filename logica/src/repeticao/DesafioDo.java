package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero a ser advinhado"));
		int chute = 0;
		int contador = 0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�mero"));
			contador=contador+1;
			
		}while (numero!=chute);
		System.out.println(" Parab�ns vc acertou " + contador + " tentativa(s).");

	}

}
