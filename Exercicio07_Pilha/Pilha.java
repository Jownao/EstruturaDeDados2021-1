package Exercicio07_Pilha;

public class Pilha<T> {
    private Celula topo;
    private int quantidadeElementos;
    
    //Construtor padrao
    public Pilha() {
        this.topo = null;
        this.quantidadeElementos = 0;
    }

    //Adiciona um elemento na posicao indicada
    public void Push(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.isEmpty()) {
			this.topo = nova;
		} else {
			nova.setAnterior(this.topo);
			this.topo = nova;
		}
		this.quantidadeElementos ++;
	}

    //Verifica se o dado existe no topo da pilha
    public boolean existeDado(T elemento) {
		if (this.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("A pilha esta vazia!");
		} else {
			return this.topo.getElemento() == elemento;
		}
	}
    
    //Verifica se a pilha esta vazia
	public boolean isEmpty() {
		return this.topo == null;
	}

    //Recupera o objeto do topo da pilha
    @SuppressWarnings("unchecked")
	public T Top(){
		if(this.isEmpty()){
            throw new RuntimeException("A pilha está vazia!");
        }
        return (T) this.topo.getElemento();
	}
	
    //Altera o valor do objeto do topo da pilha
	public void Pull(T elemento) {
		this.Pop();
		this.Push(elemento);
	}

    //Remove objeto do topo da pilha
    public void Pop() {
		if (this.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("A pilha está vazia!");
		} else if (this.quantidadeElementos == 1) {
			this.topo = null;
			this.quantidadeElementos = 0;
		} else {
			Celula anterior = this.topo.getAnterior();
			this.topo.setAnterior(null);
			this.topo = anterior;
			this.quantidadeElementos --;
		}
	}

    //Retorna tamanho da pilha
    public int tamanho() {
		return this.quantidadeElementos;
	}

    //Exclui todos os elementos da pilha
    public void limpa() {
			this.topo = null;
			this.quantidadeElementos = 0;
	}

    //Metodo toString
    @Override
	public String toString() {
		if (this.isEmpty()) return "[]";
		Iterador<Object> iterador = new Iterador<>(this.topo);
		String pilhaToString = "[" + iterador.next().toString();
		while (iterador.hasNext()) {
			pilhaToString += ", " + iterador.next().toString();
		}
		pilhaToString += "]";
		return pilhaToString;
	}
}
