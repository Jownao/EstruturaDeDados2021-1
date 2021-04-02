package Exercicio03_Anderson_ListaDuplamenteEncadeada;

public class Celula {
    
    private Celula proxima;
    
    private Celula anterior;
    
    private Object elemento;
    
    public Celula(){
        
    }
    
    
    public Celula(Celula proxima, Celula anterior, Object elemento) {
        this.proxima = proxima;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    
    public Celula(Object elemento){
        this.elemento = elemento;
        
    }
        
    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

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

