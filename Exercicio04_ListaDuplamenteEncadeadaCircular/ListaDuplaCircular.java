
package Exercicio04_ListaDuplamenteEncadeadaCircular;

public class ListaDuplaCircular<T> {
    private Celula primeira;
    
    private Celula ultima;
    
    private int totalDeElementos;

    public ListaDuplaCircular() {
        this.primeira = primeira;
        this.ultima = ultima;
        this.totalDeElementos = totalDeElementos;
    }
    
    
    public void adicionaInicio(T elemento){
        Celula nova = new Celula(elemento);
        //Se a lista for vazia 
        if( this.totalDeElementos == 0){
            ultima = nova;
            //nova.setProxima(nova);
            primeira = nova;
            //nova.setAnterior(nova);
            this.totalDeElementos++;
        } else{
            nova.setProxima(primeira);
            nova.setAnterior(ultima);
            primeira = nova;
            Celula next = primeira.getProxima();
            next.setAnterior(primeira);

            this.totalDeElementos ++;
        }
    }
    
     public void removeFim(){
        Iterador it = new Iterador(this.primeira);
        int i = 0;
        if( this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista está vazia!");
        }else if (this.totalDeElementos == 1){
            limparLista();
            totalDeElementos--;
        } else{
            while (it.hasNext()) {
                if (i != totalDeElementos - 1) {
                    it.next();
                    i++;
                } else {
                    break;
                }
                
                Celula now = it.getAtual();
                Celula bfr = now.getAnterior();
                ultima.setElemento(now);
                ultima.setAnterior(bfr);
                ultima.setProxima(primeira);
                totalDeElementos--;
            } 
        }
        
        
    }
     
     public void removerDuplos(){
         if (this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista já está vazia!");
        } else{
             for(int i = 0; i != totalDeElementos - 1 ; i++){
                 for(int j = i+1; Recupera(j) == Recupera(i);j++){
                     removerPosicao(j);
                     break;
                 }
                 
             }
        }
         
     }
     
     public void removerPosicao(int pos){
        Iterador it = new Iterador(this.primeira);
        int i = 0;
        if ( pos < 0 || pos > totalDeElementos){
            System.out.println("Posição invalida");
        } else if(totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista está vazia!");
        }else if(totalDeElementos == 1){
            limparLista();
            totalDeElementos--;
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
     
     public void limparLista(){
        if (this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista já está vazia!");
        } else{
            primeira = null;
            ultima = null;
        }
    }
     
      public T Recupera(int posicao) {
        
        if (totalDeElementos == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= totalDeElementos) {
            
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

    
    
}
