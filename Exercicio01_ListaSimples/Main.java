package Exercicio01_ListaSimples;

import Exercicio02_ListaEncadeada.Aluno;

public class Main {
   public static void main(String[] args){
       Vetor<Aluno> vetor= new Vetor<Aluno>(2);
       
       Aluno a1 = new Aluno("Johnny", 40);
       Aluno a2 = new Aluno("Paulo", 19);
       Aluno a3 = new Aluno("Luiz", 19);
       Aluno a4 = new Aluno("Gustavo", 20);
       Aluno a5 = new Aluno("Vinicius", 19);
       Aluno a6 = new Aluno("Augusto", 19);
       
       vetor.adicionaPosicao(a1, 0);
       vetor.adicionaFim(a2);
       vetor.adicionaFim(a3);
       vetor.adicionaPosicao(a5, 2);
       
       
       
    
       System.out.println(vetor.tamanho());
       
       for (int i = 0; i < vetor.tamanho(); i++){
           System.out.println(vetor.recuperar(i).getNome());
       }
       System.out.println("-".repeat(100));
       
       vetor.adicionaInicio(a4);
       
       for (int i = 0; i < vetor.tamanho(); i++){
           System.out.println(vetor.recuperar(i).getNome());
       }
       System.out.println("-".repeat(100));
       
       vetor.removerFim();
       
       vetor.removerInicio();
       
       for (int i = 0; i < vetor.tamanho(); i++) {
            System.out.println(vetor.recuperar(i).getNome());
        }
       System.out.println("-".repeat(100));
       
       vetor.removerPosicao(1);
       for (int i = 0; i < vetor.tamanho(); i++) {
            System.out.println(vetor.recuperar(i).getNome());
        }
       
       vetor.adicionaInicio(a6);
       
       
       System.out.println("-".repeat(100));
       for (int i = 0; i < vetor.tamanho(); i++) {
            System.out.println(vetor.recuperar(i).getNome());
        }
        System.out.println(vetor.tamanho());
       
   }
}
