package Exercicio06_Deque;

public class Deque<T>{
       
    private Celula primeiro;
    private Celula ultimo;
    private int quantidadeElementos;

    //Construtor padrão
    public Deque() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantidadeElementos = 0;
    }
    
    //Adiciona um elemento no início do deque
    public void inserirNoInicio(T elemento){
        Celula nova = new Celula(elemento);
        if (this.quantidadeElementos == 0){
            this.primeiro = nova;
            this.ultimo = nova;
        } else{
            nova.setProxima(this.primeiro);
            this.primeiro = nova;
        }
        this.quantidadeElementos ++;
    }
    //Adiciona um elemento no fim do deque
    public void inserirNoFim(T elemento){
        Celula nova = new Celula(elemento);
        if (this.quantidadeElementos == 0){
            this.primeiro = nova;
            this.ultimo = nova;
        } else{
            this.ultimo.setProxima(nova);
            this.ultimo = nova;
        }
        this.quantidadeElementos ++;
    }
    //Verifica se existe dado no deque
    public boolean existeDado(T elemento) {
		if (this.tamanho() == 0) {
			throw new ArrayIndexOutOfBoundsException("O deque está vazio!");
		} else {
			Iterador<Object> iterador = new Iterador<Object>(this.primeiro);
			while (iterador.hasNext()) {
				if (iterador.next().equals(elemento)) {
					return true;
				}
			}
		}
		return false;
	}
    
    //Verirfica se o deque está vazio
    public boolean isEmpty() {
		return this.quantidadeElementos == 0;
	}

    //Recupera o objeto do início do deque, não remove
    @SuppressWarnings("unchecked")
	public T RecuperarInicio() {
		if (this.quantidadeElementos == 0) {
			throw new ArrayIndexOutOfBoundsException("A deque está vazia!");
		} else {
			return (T) this.primeiro.getElemento();
		}
	}

    //Recupera o objeto do fim do deque, não remove
    @SuppressWarnings("unchecked")
	public T RecuperarFim() {
		if (this.quantidadeElementos == 0) {
			throw new ArrayIndexOutOfBoundsException("A deque está vazia!");
		} else {
			return (T) this.ultimo.getElemento();
		}
	}

    //Altera o valor do objeto do início do deque
    public void AlterarInicio(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.quantidadeElementos == 0) {
			throw new ArrayIndexOutOfBoundsException("A deque está vazia!");
		} else if (this.quantidadeElementos == 1) {
			this.primeiro.setProxima(null);
			this.primeiro = nova;
			this.ultimo = nova;
		} else {
			Celula proxima = this.primeiro.getProxima();
			this.primeiro.setProxima(null);
			this.primeiro = nova;
			this.primeiro.setProxima(proxima);
		}
	}
    //Altera o valor do objeto do fim do deque
    public void AlterarFim(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.quantidadeElementos == 0) {
			throw new ArrayIndexOutOfBoundsException("O deque esta vazio!");
		} else if (this.quantidadeElementos == 1) {
			this.primeiro.setProxima(null);
			this.primeiro = nova;
			this.ultimo = nova;
		} else {
			Celula anterior = this.recuperaCelula(quantidadeElementos - 2);
			this.ultimo = nova;
			anterior.setProxima(this.ultimo);
			this.ultimo.setProxima(null);
		}
	}
    //Remove o objeto do inicio do deque
    public void RemoverInicio() {
		if (this.quantidadeElementos == 0) {
			throw new ArrayIndexOutOfBoundsException("A deque está vazia!");
		} else if (this.quantidadeElementos == 1) {
			this.primeiro = null;
			this.ultimo = null;
			this.quantidadeElementos = 0;
		} else {
			Celula proxima = this.primeiro.getProxima();
			this.primeiro.setProxima(null);
			this.primeiro = proxima;
			this.quantidadeElementos --;
		}
	}
    //Remove o objeto do fim do deque
    public void RemoverFim() {
		if (this.quantidadeElementos == 0) {
			throw new ArrayIndexOutOfBoundsException("A deque está vazia!");
		} else if (this.quantidadeElementos == 1) {
			this.primeiro = null;
			this.ultimo = null;
			this.quantidadeElementos = 0;
		} else {
			this.ultimo = this.recuperaCelula(this.quantidadeElementos - 2);
			this.ultimo.setProxima(null); ;
			this.quantidadeElementos --;
		}
	}

    //Retorna tamanho do deque
    public int tamanho() {
		return this.quantidadeElementos;
	}

    //Exclui todos os elementos do deque
    public void limpa() {
		this.primeiro = null;
		this.quantidadeElementos = 0;
	}

    //Método toString
    @Override
	public String toString() {

		if (this.isEmpty()) 
            return "[]";
            
		Iterador<Object> iterador = new Iterador<>(this.primeiro);

		String dequeToString = "[" + iterador.next().toString();
		while (iterador.hasNext()) {
			dequeToString += ", " + iterador.next().toString();
		}
		dequeToString += "]";
		return dequeToString;
	}
    //Recuperar cécula dada a posição
    private Celula recuperaCelula(int posicao) {
		Iterador<Object> iterador = new Iterador<Object>(this.primeiro);

		int indice = 0;
		while (iterador.hasNext()) {
			if (indice != posicao) {
				iterador.next();
				indice ++;
			} else {
				break;
			}
		}
		return iterador.getAtual();
	}
}
