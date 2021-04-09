package Exercicio04_Anderson_ListaDuplamenteEncadeadaComNoCabeca;

public class NoCabeca<T>{
	private Celula noCabeca;
	private Celula inicio;
	private Celula fim;
	private int quantidadeElementos;
	
	public NoCabeca() {
		
		this.noCabeca = new Celula(null);
		this.inicio = null;
		this.fim = null;
		this.quantidadeElementos = 0;
	}
	
	public void adiciona(T elemento, int posicao) {
		if (posicao == 0) {
			this.adicionaInicio(elemento);
		} else if (posicao == this.quantidadeElementos - 1) {
			this.adicionaFim(elemento);
		} else {
			try {
				this.verificaPosicaoAdicao(posicao);
				Celula anterior = this.recuperaCelula(posicao - 1);
				Celula proxima = this.recuperaCelula(posicao);
				Celula nova = new Celula(anterior, proxima, elemento);
				anterior.setProxima(nova);
				proxima.setAnterior(nova);
				this.quantidadeElementos ++;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("A posicao indicada não existe!\nA lista vai de 0 até "+this.quantidadeElementos);
			}
		}
	}
	
	public void adicionaInicio(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.quantidadeElementos == 0) {
			this.inicio = nova;
			this.fim = nova;
			this.inicio.setAnterior(this.noCabeca);
			this.fim.setProxima(this.noCabeca);
			this.noCabeca.setAnterior(this.fim);
			this.noCabeca.setProxima(this.inicio);
		} else {
			this.noCabeca.setAnterior(this.fim);
			this.noCabeca.setProxima(nova);
			nova.setAnterior(this.noCabeca);
			nova.setProxima(this.inicio);
			this.inicio.setAnterior(nova);
			this.inicio = nova;
			Celula proxima = this.inicio.getProxima();
			proxima.setAnterior(this.inicio);
		}
		this.quantidadeElementos ++;
	}
	
	public void adicionaFim(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.quantidadeElementos == 0) {
			this.inicio = nova;
			this.fim = nova;
			this.inicio.setAnterior(this.noCabeca);
			this.fim.setProxima(this.noCabeca);
			this.noCabeca.setAnterior(this.fim);
			this.noCabeca.setProxima(this.inicio);
		} else {
			this.noCabeca.setAnterior(nova);
			this.noCabeca.setProxima(this.inicio);
			nova.setAnterior(this.fim);
			nova.setProxima(this.noCabeca);
			this.fim.setProxima(nova);
			this.fim = nova;
		}
		this.quantidadeElementos ++;
	}
	
	public boolean existeDado(T elemento) {
		if (this.quantidadeElementos != 0) {
			Iterador<Celula> iterador = new Iterador<>(this.inicio);
			int contador = 0;
			while (iterador.hasNext()) {
				if (contador != this.quantidadeElementos - 1) {
					contador ++;
					if (iterador.next().equals(elemento)) {
						return true;
					}
				} else {
					break;
				}
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T recupera(int posicao) {
		try {
			this.verificaPosicao(posicao);
			Celula celula = this.recuperaCelula(posicao);
			return (T) celula.getElemento();
		} catch (NullPointerException e) {
			System.out.println("A lista está vazia!");
			return null;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("A posicao indicada não existe!\nA lista vai de 0 até "+this.quantidadeElementos);
			return null;
		}
	}
	
	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeInicio();
		} else if (posicao == this.quantidadeElementos - 1) {
			this.removeFim();
		} else {
			try {
				this.verificaPosicao(posicao);
				Celula anterior = this.recuperaCelula(posicao - 1);
				Celula proxima = this.recuperaCelula(posicao + 1);
				anterior.setProxima(proxima);
				proxima.setAnterior(anterior);
				this.quantidadeElementos --;
			} catch (NullPointerException e) {
				System.out.println("A lista está vazia!");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("A posicao indicada não existe!\nA lista vai de 0 até "+this.quantidadeElementos);
			}
		}
	}
	
	public void removeInicio() {
		try {
			this.verificaPosicao(0);
			this.inicio = this.inicio.getProxima();
			this.inicio.setAnterior(this.noCabeca);
			this.noCabeca.setProxima(this.inicio);
			this.quantidadeElementos --;
		} catch (NullPointerException e) {
			System.out.println("A lista está vazia!");
		}
	}
	
	public void removeFim() {
		try {
			this.verificaPosicao(this.quantidadeElementos - 1);
			this.fim = this.recuperaCelula(this.quantidadeElementos - 2);
			this.fim.setProxima(this.noCabeca);
			this.noCabeca.setAnterior(this.fim);
			this.quantidadeElementos --;
		} catch (NullPointerException e) {
			System.out.println("A lista está vazia!");
		}
	}
	
	public int tamanho() {
		return this.quantidadeElementos;
	}
	
	public void limpa() {
		this.inicio = null;
		this.fim = null;
		this.quantidadeElementos = 0;
	}
	
	//Adicionais
	
	@Override
	public String toString() {
		if (this.quantidadeElementos == 0) return "[]";
		Iterador<Celula> iterador = new Iterador<>(inicio);
		int contador = 0;
		String listaToString = "[" + iterador.next();
		while (iterador.hasNext()) {
			if (contador != this.quantidadeElementos - 1) {
				listaToString += ", " + iterador.next();
				contador ++;
			} else {
				break;
			}
		}
		listaToString += "]";
		return listaToString;
	}
	
	private Celula recuperaCelula(int posicao) {
		try {
			this.verificaPosicao(posicao);
			Iterador<Object> iterador = new Iterador<Object>(this.inicio);
			int contador = 0;
			int indice = 0;
			while (iterador.hasNext()) {
				if (contador != this.quantidadeElementos - 1) {
					contador ++;
					if (indice != posicao) {
						iterador.next();
						indice ++;
					} else {
						break;
					}
				} else {
					break;
				}
			}
			return iterador.getAtual();
		} catch (NullPointerException e) {
			System.out.println("A lista está vazia!");
			return null;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("A posicao indicada não existe!\nA lista vai de 0 até "+this.quantidadeElementos);
			return null;
		}
	}
	
	private void verificaPosicao(int posicao){
		if (this.quantidadeElementos == 0){
			throw new NullPointerException("Lista vazia!");
		}
		if ((posicao < 0 || posicao > this.quantidadeElementos)){
			throw new ArrayIndexOutOfBoundsException("Posição Inválida!");
		}
	}

	private void verificaPosicaoAdicao(int posicao){
		if ((posicao < 0 || posicao > this.quantidadeElementos)){
			throw new ArrayIndexOutOfBoundsException("Posição Inválida!");
		}
	}
	
	public String imprimeNo() {
		if (this.quantidadeElementos == 0) return "Lista vazia!";
		String anterior = this.noCabeca.getAnterior().getElemento().toString();
		String proxima = this.noCabeca.getProxima().getElemento().toString();
		return "Anterior: "+anterior+"\nProxima: "+proxima;
	}
}
