package Exercicio02_Anderson_ListaEncadeada;

public class Celula {
    
    private Celula proxima;
    
    private Object elemento;
    
    public Celula(){
        
    }
    
    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    
    
    
}
