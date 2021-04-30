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



public class Fila<T> {
    
    private Celula primeira;
    
    private Celula ultima;
    
    private int totalDeElementos;
    
    
    public Fila(){
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }    
    
    //Adicionar no fim da fila
    public void Inserir(T elemento){//Funcionando
        Celula nova = new Celula(elemento);
        //Se a fila for vazia 
        if( this.totalDeElementos == 0){
            ultima = nova;
            primeira = nova;
            this.totalDeElementos++;
        } else{
            ultima.setProxima(nova);
            ultima = nova;
            this.totalDeElementos ++;
        }
    }
      
    
    public void Remover(){//Funcionando
        if( this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Fila está vazia!");
        } else if (this.totalDeElementos == 1){
            primeira = null;
            ultima = null;
            this.totalDeElementos = 0;
        }else {
            Celula next = primeira.getProxima();
            primeira.setProxima(null);
            primeira = next;
            totalDeElementos --;
    }
}
    
    public void Alterar(T elemento){
        Celula novo = new Celula(elemento);
        if (tamanho() == 0){
            primeira = novo;
            ultima = novo;
            this.totalDeElementos ++;
        } else{
            Celula next = primeira.getProxima();
            primeira.setElemento(null);
            primeira = novo;
            primeira.setProxima(next);
        }
}
    
     
    public int tamanho(){
        return this.totalDeElementos;
    }
    
    public T Recupera() {//Funcionando
        
        if (tamanho() == 0) {
            
            System.out.println("A fila está vazia!!");
            return null;
            
        } else {
            
            return (T) primeira.getElemento();
        }
    }
    
    public void limparFila(){//Funcinando
        if (this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista já está vazia!");
        } else{
            primeira = null;
            ultima = null;
        }
    }
    
    
    
    public boolean isEmpty(){
        return this.primeira == null;
    }
    
    
}
