package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class Implementarluno2 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("RM")), 
				JOptionPane.showInputDialog("Nome").toUpperCase(), 
				JOptionPane.showInputDialog("Email").toUpperCase()
				);
		System.out.println(aluno.getAll());

	}

}