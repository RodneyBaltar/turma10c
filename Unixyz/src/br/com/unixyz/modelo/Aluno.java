package br.com.unixyz.modelo;


/*  -  Design Patterns => DTO (Data Transfer Object)
 *  - Todo atributo deve ser privado.
 *  - Todo atributo deve possuir um método de input (setter) e um método de output (getter)
 *  - cada classe deve possuir no minimo dois construtores (um vazio e outro cheio - com todos os atributos)
 */



public class Aluno {
	
		
	private int rm;
	public Aluno() {
		super();
	}
	private String nome;
	private String email;
	
	public void setAll (int rm, String nome, String email) {
		this.rm =rm;
		this.nome = nome;
		this.email = email;
		
	}
	
	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public String getAll () {
		return
				"RM:    "    + rm + "\n" +
				"Nome:  "    + nome + "\n" +
				"Email: "    + email;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
