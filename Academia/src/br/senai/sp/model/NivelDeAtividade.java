package br.senai.sp.model;
import br.senai.sp.model.Aluno;



public class NivelDeAtividade {

	private double peso;
	private int idade;
	private double altura;
	
	public void setPeso (double peso) {
		this.peso = peso;
	}
	
	public double getPeso () {
	return this.peso;
}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public int getIdade () {
		return this.idade;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}	
	
	
	//*** Criação do CalculoImc ´
	
	public class imc {
		
		imc = (peso)/(altura * altura);
		
	}
	
}
