
package Exercicio07_Pilha;

public class Main {
    public static void main(String[] args) {
        
    	Pessoa p1 = new Pessoa("Johnny");
        Pessoa p2 = new Pessoa("Paulo Vitor");
        Pessoa p3 = new Pessoa("Paulo Gustavo");
        Pessoa p4 = new Pessoa("Juliana");
        Pessoa p5 = new Pessoa("Gladston");
        Pessoa p6 = new Pessoa("Jennifer");
        Pessoa p7 = new Pessoa("Thiago");
        Pessoa p8 = new Pessoa("Victoria");
        
        //Construtor padrao
        Pilha<Pessoa> pilha = new Pilha<>();
        
        //Verifica se o Deque esta vazio
        System.out.println("A pilha esta vazia ? "+pilha.isEmpty());
        System.out.println("Instanciando 8 pessoas...\n");
        //Adiciona um elemento no fim do deque
        System.out.println("Inserindo primeiro elemento: ");
        pilha.Push(p1);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        pilha.Push(p2);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        pilha.Push(p3);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        pilha.Push(p4);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        pilha.Push(p5);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        pilha.Push(p6);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        pilha.Push(p7);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        pilha.Push(p8);
        System.out.println(pilha);
        System.out.println("Tamanho: "+pilha.tamanho());
        
        //Verificando se contem dado elemento no inicio fila
        System.out.println("Existe dado 1 no topo: "+pilha.existeDado(p1));
        //Sem ser inicio
        System.out.println("Existe dado 8 no topo: "+pilha.existeDado(p8));
        System.out.println();


        //Recupera o objeto do inicio da pilha
        System.out.println();
        System.out.println("Recupera o elemento do topo:  "+pilha.Top());
        
        //Alterando o dado do inicio e fim da pilha
        System.out.println();
        System.out.println("Antes da alteração: ");
        System.out.println(pilha);
        System.out.println("Alterar topo pelo quinto: ");
        pilha.Pull(p5);
        System.out.println(pilha);

        
        //Removendo o dado do inicio da pilha
        System.out.println();
        System.out.println("Antes da alteração: ");
        System.out.println(pilha);
        System.out.println("Remove topo: ");
        pilha.Pop();
        System.out.println(pilha);

        //Verificando o tamanho da fila
        System.out.println("Tamanho da pilha: "+pilha.tamanho());
        
        //Limpando a fila
        System.out.println("Limpando pilha...");
        pilha.limpa();
        System.out.println("Tamanho da pilha apos limpeza: "+pilha.tamanho());
        
        
        
        
        
        
    }
}
