package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Rodrigo Kelven";
        professor.sexo = 'M';
        professor.idade = 20;

        System.out.println(professor.nome + " " + professor.sexo + " " + professor.idade);
    }
}
