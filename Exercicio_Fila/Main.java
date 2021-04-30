/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_Fila;


/**
 *
 * @author paulo
 */
public class Main {
    public static void main(String[] args) {
        //Estanciando alunos
	Aluno a1 = new Aluno("Paulo");
        Aluno a2 = new Aluno("Anderson");
        Aluno a3 = new Aluno("Viny");
        Aluno a4 = new Aluno("Danilo");
        Aluno a5 = new Aluno("Amadeu");
        
        //Criando a Pilha
        Fila fila = new Fila();

        //Adicionando Alunos no inicio da lista
        fila.Inserir(a1);
        fila.Inserir(a2);
        fila.Inserir(a3);
        fila.Inserir(a4);
        
        //Verificar se a fila está vazia
        System.out.println(fila.isEmpty());
        
        //Recuperar o primeiro valor da fila
        System.out.println(fila.Recupera());
        
        //Printado o tamanho da fila
        System.out.println(fila.tamanho());
        
        //Limpar a fila
//        fila.limparFila();
        
        fila.Alterar(a5);
        
        fila.Remover();

}
}


