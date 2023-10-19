package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		System.out.print("Quantas pessoas serão digitadas? ");
		int tamanhoDoVetor = sc.nextInt();
		sc.nextLine();
		Pessoa listaDePessoas[] = new Pessoa[tamanhoDoVetor];
		
		for (int i=0; i<listaDePessoas.length;i++) {
			System.out.println("\nDigite as informacoes da pessoa numero " + (i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			listaDePessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		System.out.printf("\nAltura media: " + String.format("%.2f", Pessoa.obtemMediaDeAltura(listaDePessoas)));
		System.out.println("\nPorcentagem de pessoas com menos de 16 anos: " + 
				Pessoa.exibePorcentagemDeMenoresDeDezesseisAnos(listaDePessoas,
						Pessoa.retornaQuantidadeDeMenoresDeDezesseisAnos(listaDePessoas)) + "%");
		/*Foram feitos dois metodos para encapsular melhor as funcoes, onde o metodo de retorno da
		 quantodade de menores de dezesseis anos é necessário para calcular a porcentagem de pessoas
		 que pertencem a essa faixa etária.*/
		System.out.println("Nome das pessoas menores de 16 anos");
		Pessoa.exibeNomeDosMenoresDeDezesseisAnos(listaDePessoas);
		sc.close();
	}
}
