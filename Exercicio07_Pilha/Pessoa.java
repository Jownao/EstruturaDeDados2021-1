
package Exercicio07_Pilha;

public class Pessoa {
    
    private String nome;

    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
	public String toString() {
		return this.nome;}
}
