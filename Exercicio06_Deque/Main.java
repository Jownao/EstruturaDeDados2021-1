
package Exercicio06_Deque;

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
        Deque<Pessoa> deque = new Deque<>();
        
        //Verifica se o Deque esta vazio
        System.out.println("O deque esta vazio ? "+deque.isEmpty());
        System.out.println("Instanciando 8 pessoas...\n");
        //Adiciona um elemento no fim do deque
        System.out.println("Inserindo primeiro elemento: ");
        deque.inserirNoInicio(p1);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        deque.inserirNoFim(p2);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        deque.inserirNoFim(p3);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        deque.inserirNoFim(p4);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        deque.inserirNoFim(p5);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        deque.inserirNoFim(p6);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        deque.inserirNoFim(p7);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        deque.inserirNoFim(p8);
        System.out.println(deque);
        System.out.println("Tamanho: "+deque.tamanho());
        
        //Verificando se contem dado elemento no inicio fila
        System.out.println("Existe dado 1: "+deque.existeDado(p1));
        //Sem ser inicio
        System.out.println("Existe dado 6: "+deque.existeDado(p6));
        System.out.println();


        //Recupera o objeto do inicio da Fila, nao o remove;
        System.out.println();
        System.out.println("Recupera inicio: "+deque.RecuperarInicio());
        System.out.println("Recupera fim: "+deque.RecuperarFim());
        
        //Alterando o dado do inicio e fim do deque
        System.out.println();
        System.out.println("Antes da alteração: ");
        System.out.println(deque);
        System.out.println("Alterando primeiro elemento da deque pelo sexto: ");
        deque.AlterarInicio(p6);
        System.out.println(deque);
        System.out.println("Alterando ultimo elemento da deque pelo setimo: ");
        deque.AlterarFim(p7);
        System.out.println(deque);
        
        //Removendo o dado do inicio da fila
        System.out.println();
        System.out.println("Antes da alteração: ");
        System.out.println(deque);
        System.out.println("Removendo o elemento do inicio do deque");
        deque.RemoverInicio();
        System.out.println(deque);
        System.out.println("Removendo o elemento do fim do deque");
        deque.RemoverFim();
        System.out.println(deque);

        //Verificando o tamanho da fila
        System.out.println("Tamanho da fila: "+deque.tamanho());
        
        //Limpando a fila
        System.out.println("Limpando fila...");
        deque.limpa();
        System.out.println("Tamanho da fila apos limpeza: "+deque.tamanho());
        
        
        
        
        
        
    }
}
