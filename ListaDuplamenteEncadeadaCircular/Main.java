package ListaDuplamenteEncadeadaCircular;

import Exercicio02_Anderson_ListaEncadeada.*;
import ListaDuplamenteEncadeadaCircular.ListaDuplaCircular;


public class Main {
    public static void main(String[] args) {
        //Estanciando alunos
    	Aluno a1 = new Aluno("Johnny", 40);
        Aluno a2 = new Aluno("Paulo", 19);
        Aluno a3 = new Aluno("Luiz", 19);
        Aluno a4 = new Aluno("Gustavo", 20);
        Aluno a5 = new Aluno("Vinicius", 19);
        Aluno a6 = new Aluno("Augusto", 19);
        Aluno a7 = new Aluno("Paul", 19);
        
        //Criando a Lista Encadeada
        ListaDuplaCircular<Aluno> lista = new ListaDuplaCircular<Aluno>();
        
        
        //Adicionando Alunos no inicio da lista
        lista.adicionaInicio(a1);
        lista.adicionaInicio(a2);
        lista.adicionaInicio(a3);
        lista.adicionaInicio(a3);
        

        
        lista.removerDuplos();
        
        //Printando lista de Alunos
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a3 = (Aluno) lista.Recupera(2);
//      a4 = (Aluno) lista.Recupera(3);
        
           
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a3.getNome());
//      System.out.println(a4.getNome());
           
        System.out.println("-".repeat(100));
        
//        Removendo Aluno que esta no inicio
//        lista.removeFim();
//        
//        //Printando lista de Alunos
//        a1 = (Aluno) lista.Recupera(0);
//        a2 = (Aluno) lista.Recupera(1);
//        System.out.println(a1.getNome());
//        System.out.println(a2.getNome());
//        System.out.println("-".repeat(100));
        
        

}
}


