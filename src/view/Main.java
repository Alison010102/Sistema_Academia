package view;

import model.DTO;
import model.Exercicio;
import model.Aluno;
import model.Personal;
import model.Ficha;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DTO dto = new DTO();

        Exercicio e1 = new Exercicio("Supino", 12, 40);
        Exercicio e2 = new Exercicio("Agachamento", 15, 60);
        Exercicio e3 = new Exercicio("Rosca Direta", 10, 20);

        dto.getExercicios().add(e1);
        dto.getExercicios().add(e2);
        dto.getExercicios().add(e3);

        Aluno aluno1 = new Aluno("Alison", "2026-01-30", 'M');
        Personal personal1 = new Personal("Ana", "11988887777");

        Ficha ficha1 = new Ficha(aluno1);
        ficha1.setPersonal(personal1);
        ficha1.setDataFim("2026-12-31");

        for (Exercicio e : dto.getExercicios()) {
            ficha1.adicionarExercicio(e);
        }

        System.out.println("Aluno: " + ficha1.getAluno().getNome());
        System.out.println("Personal: " + ficha1.getPersonal().getNome());
        System.out.println("Data de término da ficha: " + ficha1.getDataFim());
        System.out.println("Exercícios da ficha:");
        for (Exercicio e : ficha1.getExercicios()) {
            System.out.println("- " + e.getNome() + ": " + e.getRepeticoes() + " repetições, " + e.getCarga() + "kg");
        }
    }
}
