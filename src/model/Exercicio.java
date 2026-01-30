package model;

public class Exercicio {
	private String nome;
	private int repeticoes;
	private int carga;
	
	
	public Exercicio(String nome, int repeticoes, int carga) {
		this.nome = nome;
		this.repeticoes = repeticoes;
		this.carga = carga;
	}
	
	public Exercicio() {
		
	}
	public Exercicio(String nome) {
		this.nome = nome;
		this.repeticoes = 0;
		this.carga = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRepeticoes() {
		return repeticoes;
	}
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	@Override
	public String toString() {
		return "Exercicio [nome=" + nome + ", repeticoes=" + repeticoes + ", carga=" + carga + "]";
	}
	

	
	
}
