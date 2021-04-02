package Exercicio03_Anderson_ListaDuplamenteEncadeada;
   
import Exercicio02_Anderson_ListaEncadeada.*;
import java.util.Iterator;

public class Iterador<T> implements Iterator{
    
    private Celula atual;
    
    public Iterador(Celula atual){
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext(){
        if(atual != null){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public Object next(){
        T elemento = (T) atual.getElemento();
        atual = atual.getProxima();
        return elemento;
    }
    
    public Celula getAtual(){
        return atual;
    }
    
}