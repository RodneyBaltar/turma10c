package br.com.concessionaria.modelo;

public class Formula1 {

	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;


	//Sintaxe para os metodos

	// <modificador> <Tipo do Retorno> <nomeMetodo> ( <TipoParam> <nomeParam>)

	public void preencherEscuderia(String parametro) {

		escuderia=parametro.toUpperCase();

	}

	public String retornarEscuderia() {

		return escuderia;


	}

	public void preencherCor(String pCor) {
		cor = pCor.toUpperCase();

	}

	public String retornarCor() {

		return cor;


	}
	public void preencherValor(float pValor) {

		valor = pValor;

	}

	public float retornarValor() {

		return valor;

	}

	public String ligar() {
		status=true;
		return "Carro Ligado !";


	}
	public String desligar() {
		status=false;
		return "Carro Desligado !";

	}

    public void acelerar(float pVelocidade) {
    	
    	if (status==true) {
    		velocidadeAtual+=pVelocidade;
    }
    }
    
    public void desacelerar (float pVelocidade) {
    	
    	if (status==true) {
    		
    		velocidadeAtual -=pVelocidade;
    		
    		if (velocidadeAtual<0) {
    			velocidadeAtual=0;
    	}
    		
    		
    	}
    }
    	
    	public float retornarVelocidadeAtual() {
    		return velocidadeAtual;
    	}
    }
    

