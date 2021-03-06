package Exercicio03_ListaDuplamenteEncadeada;

public class ListaDupla<T> {
    
    private Celula primeira;
    
    private Celula ultima;
    
    private int totalDeElementos;
    
    
    public ListaDupla(){
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }
    
    public void trocaPosicao(int pos) {
	if (this.totalDeElementos == 0) {
		throw new ArrayIndexOutOfBoundsException("A lista está vazia");
	} else if (this.totalDeElementos == 1) {
		throw new ArrayIndexOutOfBoundsException("A lista contêm apenas um elemento");
	} else if (pos == (this.totalDeElementos - 1)) {
		throw new ArrayIndexOutOfBoundsException("A posição passada é a última da lista logo nada será alterado!\nEscolha outra posição: ");
	} else if (pos >= this.totalDeElementos || pos < 0) {
		throw new ArrayIndexOutOfBoundsException("Posição invalida!");
        } else {
		T elemento = this.Recupera(pos);
                this.adicionaFim(elemento);
		this.removerPosicao(pos);
		}
	}
    
    public void adicionaPosicao(int pos, T elemento){
        Iterador it = new Iterador(this.primeira);
        int i = 0;
        Celula nova = new Celula(elemento);
        if ( pos < 0 || pos > tamanho()){
            System.out.println("Posição invalida");
        } else{
            if (totalDeElementos == 0){
                adicionaInicio(elemento);
            }else{
            while (it.hasNext()) {
                if (i != pos - 1) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
        }
            if ( pos == 0){
            adicionaInicio(elemento);
            }else if (pos == totalDeElementos){
                adicionaFim(elemento);
            } else {
                Celula bfr = it.getAtual();
                Celula now = bfr.getProxima();
                nova.setAnterior(bfr);
                nova.setProxima(now);
                bfr.setProxima(nova);
                now.setAnterior(nova);
                this.totalDeElementos++;
            }
        }
    }
    
    public void removerPosicao(int pos){
        Iterador it = new Iterador(this.primeira);
        int i = 0;
        if ( pos < 0 || pos > tamanho()){
            System.out.println("Posição invalida");
        } else if(totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista está vazia!");
        }else if(totalDeElementos == 1){
            limparLista();
            totalDeElementos--;
        } else if(pos == 0){
            removeInicio();
        }else if (pos == totalDeElementos - 1){
            removeFim();
        }else{
            while (it.hasNext()) {
                if (i != pos - 1) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            Celula bfr = it.getAtual();
            Celula now = bfr.getProxima();
            Celula next = now.getProxima();
            
            now.setProxima(null);
            now.setAnterior(null);
            bfr.setProxima(next);
            next.setAnterior(bfr);
            this.totalDeElementos--;
        }
    }
   
    
    //Adicionar no Inicio da lista
    public void adicionaInicio(T elemento){//Funcionando
        Celula nova = new Celula(elemento);
        //Se a lista for vazia 
        if( this.totalDeElementos == 0){
            ultima = nova;
            primeira = nova;
            this.totalDeElementos++;
        } else{
            nova.setProxima(primeira);
            nova.setAnterior(null);
            primeira = nova;
            Celula next = primeira.getProxima();
            next.setAnterior(primeira);
            
            this.totalDeElementos ++;
        }
    }
    
    public void adicionaFim(T elemento){//Funcionando
        Celula nova = new Celula(elemento);
        if ( tamanho() == 0){
            this.adicionaInicio(elemento);
            primeira = nova;
            ultima = nova;
            totalDeElementos++;
        } else{
            nova.setProxima(null);
            nova.setAnterior(ultima);
            ultima.setProxima(nova);
            ultima = nova;
            totalDeElementos++;
        }
    }
       
    public void removeInicio(){//Funcionando
        Celula nova = new Celula();
        if( this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista está vazia!");
        } else if (this.totalDeElementos == 1){
            limparLista();
            totalDeElementos--;
        }else {
            nova = primeira.getProxima();
            nova.setAnterior(null);
            primeira.setProxima(null);
            primeira = nova;
            totalDeElementos--;
    }
}
    
    
    public void removeFim(){//Funcionando
        Iterador it = new Iterador(this.primeira);
        int i = 1;
        if( this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista está vazia!");
        }else if (this.totalDeElementos == 1){
            limparLista();
            totalDeElementos--;
        } else{
            while (it.hasNext()) {
                if (i != tamanho() - 1) {
                    it.next();
                    i++;
                } else {
                    break;
                }
                
                Celula now = it.getAtual();
                Celula bfr = now.getAnterior();
                ultima.setElemento(now);
                ultima.setAnterior(bfr);
                ultima.setProxima(null);
                totalDeElementos--;
            } 
        }
    }
       
    
    public int tamanho(){
        return this.totalDeElementos;
    }
    
    public T Recupera(int posicao) {//Funcionando
        
        if (tamanho() == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= tamanho()) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.primeira);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) it.getAtual().getElemento();
        }
    }
    
    public void limparLista(){//Funcinando
        if (this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista já está vazia!");
        } else{
            primeira = null;
            ultima = null;
        }
    }
    
    public boolean existeDado(T elemento){//Não Funcionando
        Iterador it = new Iterador(this.primeira);
        if( this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista está vazia!");
        } else {
           while (it.hasNext()) {
                if (it.getAtual().getElemento() != elemento) {
                    it.next();
                } else {
                    break;
                }
            }
            return it.getAtual().getElemento() == elemento;
        }
    }

    
}
