package model;
import java.util.ArrayList;


public class DTO {
	private ArrayList<Exercicio> exercicios;
	
	public DTO() {
		
	exercicios = new ArrayList<>();
	
	 exercicios.add(new Exercicio("Supino", 12, 40));
	    exercicios.add(new Exercicio("Agachamento", 15, 60));
	    exercicios.add(new Exercicio("Rosca Direta", 10, 20));
	    exercicios.add(new Exercicio("Leg Press", 12, 80));
	}

	public ArrayList<Exercicio> getExercicios(){
		return exercicios;
	}
}
