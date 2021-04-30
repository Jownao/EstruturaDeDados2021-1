/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_Pilhas;

/**
 *
 * @author paulo
 */
public class Main {
    public static void main(String[] args) {
        //Estanciando alunos
	Aluno a1 = new Aluno(1);
        Aluno a2 = new Aluno(2);
        Aluno a3 = new Aluno(3);
        Aluno a4 = new Aluno(4);
        Aluno a5 = new Aluno(5);
        Aluno a6 = new Aluno(6);
        
        //Criando a Pilha
        Pilha pilha = new Pilha();

        //Adicionando Alunos no inicio da lista
        pilha.Push(a1);
        pilha.Push(a2);
        pilha.Push(a3);
        
        //Verificar se a pilha está vazia
        System.out.println(pilha.isEmpty());
        
        //Printar o tamanho da pilha
        System.out.println(pilha.tamanho());
        
        //Limpar a pilha
        pilha.limparPilha();
        
        pilha.Push(a5);
        pilha.Push(a6);
        //Trocar o valor da pilha
        pilha.Pull(a4);

        a6 = (Aluno) pilha.top();
        System.out.println(a6.getNumero());
        
        
           

}
}


