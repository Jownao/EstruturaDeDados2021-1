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
public class Celula {
    
    private Celula anterior;
    
    private Object elemento;
    
    public Celula(){
        
    }
    
    
    public Celula(Object elemento) {
        this.elemento = elemento;
    }
    
    
    //Construtor
    public Celula(Celula anterior, Object elemento) {
        this.anterior = anterior;
        this.elemento = elemento;
    }
    
    //Get e Setters
    public Celula getAnterior() {
        return anterior;
    }
    

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
}
