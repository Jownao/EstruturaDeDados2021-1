package Exercicio01_ListaSimples;
     
import java.util.Iterator;
@SuppressWarnings("rawtypes")
public class Iterador<T> implements Iterator{
    
    T[] itens;
    int posicao = 0;
    
    public Iterador(T[] itens){
        this.itens = itens;
    }
    
    public boolean hasNext(){
        if(posicao < 0 || posicao >= itens.length){
            return false;
        } else {
            return true;
        }
    }
        public Object next(){
            Object item = itens[posicao];
            posicao++;
            return item;
        }
    }
    

