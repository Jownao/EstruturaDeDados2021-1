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



public class Pilha<T> {
        
    private int totalDeElementos;
    
    private Celula topo;
    
    public Pilha(){
        this.topo = null;
        this.totalDeElementos = 0;
    }
    
    public void Push(T elemento){
        Celula novo = new Celula(elemento);
        if (this.totalDeElementos == 0){
            topo = novo;
            totalDeElementos++;
        }else{
            novo.setAnterior(topo);
            topo = novo;
            totalDeElementos ++;
        }
    }
    
    public void Pull(T elemento){
        Pop();
        Push(elemento);
    }
    
    public void Pop(){
        if( this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Pilha está vazia!");
        }else if (this.totalDeElementos == 1){
            topo = null;
            totalDeElementos = 0;
        } else{
            Celula bfr = topo.getAnterior();
            topo.setAnterior(null);
            topo = bfr;
            totalDeElementos --;
            
        }
    }
    
    public boolean isEmpty(){
        return this.topo == null;
    }
    
    public T top(){
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("A pilha está vazia!");
        } else {
            return (T) topo.getElemento();
        }
    }
    
    public void limparPilha(){//Funcinando
        if (this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista já está vazia!");
        } else{
            System.out.println("A pilha foi limpa");
            topo = null;
            totalDeElementos = 0;
        }
    }
    
    public int tamanho(){
        return totalDeElementos;
    }
    
}
