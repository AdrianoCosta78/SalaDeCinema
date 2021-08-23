package telaCinema;

import java.util.Scanner;

public class TelaPrincipal {
	
	final static Scanner entrada = new Scanner(System.in);
	static Cinema cinema;
	
	private static void comprarIngresso() {
		boolean flag;
		int comprarFila;
		int comprarColuna;
		
		do {
			System.out.print("Por favor informe a fila: ");
			comprarFila = entrada.nextInt();
			System.out.print("Por favor informe a coluna: ");
			comprarColuna = entrada.nextInt();
			flag = cinema.verificarAssento(comprarFila, comprarColuna);
			
		}while(!flag);
		
		cinema.comprarIngresso(comprarFila, comprarColuna);
	}
	
	public static void main(String[] args) {
		String menu = "1 - Escolher assento\n"
			         +"2 - Comprar Ingresso\n"
			         +"3 - Estatisticas\n"
			         +"4 - Sair";
	
	System.out.println("Seja bem vindo ao CineAdriano\n");
		

	System.out.print("informe o numeros de fila que você deseja ter na sala: ");
	int filas = entrada.nextInt();
	
	System.out.print("Informe o numero de colunas que você deseja ter na sala: ");
	int colunas = entrada.nextInt();	
	
	
		cinema = new Cinema(filas, colunas);
		cinema.SalaCinema();
		cinema.imprimirSala();
		
		
		
		
		int opcao;
		
		do {
			
			System.out.println(menu);
			opcao = entrada.nextInt();
			
				
			switch (opcao) {
			   case 1:
				   cinema.imprimirSala();
				   break;
			   case 2:
				   comprarIngresso();
				   break;
			   case 3:
				   cinema.calcularPreco(filas);
				   break;
			   case 4:
				   System.out.println("Obrigado! Bom filme.");
				   break;	   
			   default:
				   System.out.println("Essa opção não existe\n");
				   break;
			}
			
		}while(opcao != 4);
		
		entrada.close();
	}

}

