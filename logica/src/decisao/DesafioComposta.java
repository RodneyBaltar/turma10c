package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {

		String veiculo = JOptionPane.showInputDialog("Veiculo").toUpperCase();

		byte capacidade = Byte.parseByte(JOptionPane.showInputDialog ("Capacidade"));

		if (capacidade ==2) {

			System.out.println(veiculo  + " Categoria A ");

		}else if (capacidade >7) {

			System.out.println(veiculo  + " categoria C ");
		}
		else if (capacidade>=4) {
			System.out.println(veiculo  + " categoria B ");
			
		}else {
			System.out.println("Categoria desconhecida");
		}
	}
}
