package model;

import java.util.ArrayList;

public class academia {
	private String nome;
	private String localizacao;
	private String whatsapp;
	private String instagram;
	private ArrayList<Personal> personals;
	private ArrayList<Aluno> alunos;
	private ArrayList<Exercicio> exercicios;
	private ArrayList<Ficha> fichas;
	
	public academia(String nome) {
		super();
		this.nome = nome;
		this.localizacao = "";
		this.whatsapp = "";
		this.instagram = "";
		this.personals = new ArrayList<>();
		this.alunos = new ArrayList<>();
		this.exercicios = new ArrayList<>();
		this.fichas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public ArrayList<Personal> getPersonals() {
		return personals;
	}

	public void setPersonals(ArrayList<Personal> personals) {
		this.personals = personals;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ArrayList<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(ArrayList<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public ArrayList<Ficha> getFicha() {
		return fichas;
	}

	public void setFicha(ArrayList<Ficha> ficha) {
		this.fichas = ficha;
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	public void addExercicio(Exercicio exercicio) {
		exercicios.add(exercicio);
	}
	public void addPersonal(Personal personal) {
		personals.add(personal);
	}
	public void addFichs(Ficha ficha) {
		fichas.add(ficha);
	}
	public void removeAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	public void removeExercicio(Exercicio exercicio) {
		exercicios.remove(exercicio);
	}
	public void removePersonal(Personal personal) {
		personals.remove(personal);
	}
	public void removeFicha(Ficha ficha) {
		fichas.remove(ficha);
	}
	
	
	
	

}
