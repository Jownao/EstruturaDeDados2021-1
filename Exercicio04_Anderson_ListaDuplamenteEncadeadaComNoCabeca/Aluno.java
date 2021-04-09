package Exercicio04_Anderson_ListaDuplamenteEncadeadaComNoCabeca;

import Exercicio02_Anderson_ListaEncadeada.*;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(){
        this.nome ="";
        this.idade=0;
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade= idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
