package entidades;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public static double obtemMediaDeAltura(Pessoa listaDePessoas[]) {
		double somaDasAlturas = 0.0;
		for (int i=0; i<listaDePessoas.length; i++) { somaDasAlturas += listaDePessoas[i].altura; }
		return somaDasAlturas/listaDePessoas.length;
	}
	
	public static int retornaQuantidadeDeMenoresDeDezesseisAnos(Pessoa listaDePessoas[]) {
		int quantidadeDeMenoresDeDezesseisAnos = 0;
		for (int i=0; i<listaDePessoas.length; i++) 
			if (listaDePessoas[i].idade < 16) quantidadeDeMenoresDeDezesseisAnos++;
		return quantidadeDeMenoresDeDezesseisAnos;
	}
	
	public static double exibePorcentagemDeMenoresDeDezesseisAnos(Pessoa listaDePessoas[],
			int quantidadeDeMenoresDeDezesseisAnos) {
		return quantidadeDeMenoresDeDezesseisAnos*100/listaDePessoas.length;
	}
	
	public static void exibeNomeDosMenoresDeDezesseisAnos(Pessoa listaDePessoas[]) {
		for (int i=0; i<listaDePessoas.length; i++) 
			if (listaDePessoas[i].idade < 16) System.out.println(listaDePessoas[i]);
	}
	
	public String toString() { return nome; }
}
