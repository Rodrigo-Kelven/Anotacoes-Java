package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Joao";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
