
package Exercicio07_Pilha;

public class Celula {
    
    private Celula anterior;
	private Object elemento;
	
	public Celula() {
		super();
	}

	public Celula(Object elemento) {
		super();
		this.elemento = elemento;
	}

	public Celula(Celula anterior, Object elemento) {
		super();
		this.anterior = anterior;
		this.elemento = elemento;
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
