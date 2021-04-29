
package Exercicio05_Filas;

import java.util.Iterator;

/**
 *
 * @author jownao
 */
@SuppressWarnings("rawtypes")
public class Iterador<T> implements Iterator{
    
    private Celula atual;
    
    public Iterador(Celula atual){
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext(){
        if(atual != null){
            return true;
        } else {
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public Object next(){
        T elemento = (T) atual.getElemento();
        atual = atual.getProxima();
        return elemento;
    }
    
    public Celula getAtual(){
        return atual;
    }
    
}
