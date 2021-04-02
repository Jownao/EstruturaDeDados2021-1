package Exercicio02_Anderson_ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        //Estanciando alunos
    	Aluno a1 = new Aluno("Johnny", 40);
        Aluno a2 = new Aluno("Paulo", 19);
        Aluno a3 = new Aluno("Luiz", 19);
        Aluno a4 = new Aluno("Gustavo", 20);
        Aluno a5 = new Aluno("Vinicius", 19);
        Aluno a6 = new Aluno("Augusto", 19);
        
        //Criando a Lista Encadeada
        ListaEncadeada lista = new ListaEncadeada();

        //Adicionando Alunos no inicio da lista
        lista.adicionaInicio(a1);
        lista.adicionaInicio(a2);
        lista.adicionaInicio(a3);

        //Printando lista de Alunos
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a3 = (Aluno) lista.Recupera(2);
        System.out.println(lista.tamanho());
           
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a3.getNome());
           
        System.out.println("-".repeat(100));
        
        //Removendo Aluno que esta no inicio
        lista.removeInicio();
        
        //Printando lista de Alunos
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println("-".repeat(100));
        
        //Adicionando Aluno no fim da lista
        lista.adicionaFim(a4);
        lista.adicionaFim(a5);
        
        //Printando lista de Alunos
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a4 = (Aluno) lista.Recupera(2);
//        a5 = (Aluno) lista.Recupera(3);
        System.out.println(lista.tamanho());
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a4.getNome());
//        System.out.println(a5.getNome());
        System.out.println("-".repeat(100));
        
        //Removendo Aluno que esta no fim
//        lista.removeFim();
//        System.out.println(lista.tamanho());
//        System.out.println("-".repeat(100));
        
        //Adicionando e Rmovendo da Posição
        lista.adicionaPosicao(0, a6);
        lista.adicionaPosicao(4, a5);
        a6 = (Aluno) lista.Recupera(0);
        a1 = (Aluno) lista.Recupera(1);
        a2 = (Aluno) lista.Recupera(2);
        a4 = (Aluno) lista.Recupera(3);
        a5 = (Aluno) lista.Recupera(4);
        System.out.println(a6.getNome());
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a4.getNome());
        System.out.println(a5.getNome());
        System.out.println(lista.tamanho());
        System.out.println("-".repeat(100));
        
        lista.removerPosicao(2);
        a6 = (Aluno) lista.Recupera(0);
        a1 = (Aluno) lista.Recupera(1);
        a2 = (Aluno) lista.Recupera(2);
        a4 = (Aluno) lista.Recupera(3);
        System.out.println(a6.getNome());
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a4.getNome());
        System.out.println(lista.tamanho());
        
//        System.out.println(lista.existeDado(1));

}
}


