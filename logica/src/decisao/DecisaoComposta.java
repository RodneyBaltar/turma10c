package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("faltas"));
		float media = (nota1+nota2)/2;
		if (media>=6 && faltas<=20) {
			System.out.println("Aprovado com media:" + media);
			
		}else if (media<4 || faltas >20 ) {
			System.out.println("Aluno Reprovado" + media);
			
			// and => &&
		    // or => ||

		}else {
			System.out.println("Voc� ainda tem uma chance no exame");

		}
            System.out.println("At� Logo");
	}

}



