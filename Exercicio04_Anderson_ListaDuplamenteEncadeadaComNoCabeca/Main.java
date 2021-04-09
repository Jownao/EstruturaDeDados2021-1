package Exercicio04_Anderson_ListaDuplamenteEncadeadaComNoCabeca;

public class Main {
	public static void main(String[] args) {
		NoCabeca<Aluno> alunos = new NoCabeca<>();
		
		Aluno a1 = new Aluno("Albert", 01);
	    Aluno a2 = new Aluno("Bolang", 02);
	    Aluno a3 = new Aluno("Costa", 03);
	    Aluno a4 = new Aluno("Dado", 04);
	    Aluno a5 = new Aluno("Egua", 05);
	    Aluno a6 = new Aluno("Free", 06);
	    
	    System.out.println("Vetor vazio");
	    System.out.println(alunos);
	    System.out.println("Nó cabeça");
	    System.out.println(alunos.imprimeNo());
	    System.out.println("Adiciona Final");
	    alunos.adicionaFim(a3);
	    System.out.println(alunos);
	    System.out.println("Nó cabeça");
	    System.out.println(alunos.imprimeNo());
	    System.out.println("Adiciona Final");

	}
}
