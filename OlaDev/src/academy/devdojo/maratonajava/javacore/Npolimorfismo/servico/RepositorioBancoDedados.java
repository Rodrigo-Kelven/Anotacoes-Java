package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDedados implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando em um Banco de Dados..");
    }
}
