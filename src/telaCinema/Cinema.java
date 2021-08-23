package telaCinema;

public class Cinema {
	
	private final int fila;
	private final int coluna;
	private String [][] sala;
	private int ticket;
	private int ingressoAtual;
	private int preco;
	
	public Cinema (int fila, int coluna) {
		this.fila = fila;
		this.coluna = coluna;
		this.sala = new String[fila + 1][coluna + 1];
		this.ticket = 0;
		this.preco = 10;
	}
	
	public void SalaCinema() {
		for(int i = 0; i < sala.length; i++) {
			for(int j = 0; j < sala[0].length; j++) {
				if(i == 0 && j == 0) {
					sala[i][j] = " ";
				}else if(i == 0) {
					sala[i][j] = String.valueOf(j);
				}else if(j == 0) {
					sala[i][j] = String.valueOf(i);
				}else {
					sala[i][j] = "P";
				}
			}
		}
		
	}
		
		public void imprimirSala() {
		System.out.print("\n ___TELA_DO_CINEMA___ ");
		System.out.print("\n|____________________| \n");
		System.out.println("\n");
			for(String[] assento : sala) {
				for ( int j = 0; j < sala[0].length; j++) {
					System.out.print(assento[j]+" ");
				}
				System.out.println("\n");
			}
		}
		
		public boolean verificarAssento(int comprarFila, int comprarColuna) {
			
			   boolean verificar = comprarFila > fila || comprarColuna > coluna || comprarFila == 0 || comprarColuna == 0;
			
			if( verificar) {
				System.out.println("\nEsse assento não existe\n");
				return false;
			}else if(sala[comprarFila][comprarColuna].equals("X")) {
				System.out.println("\nEsse assento está ocupado\n");
				return false;
			}
			return true;
			
		}
		
		
		
		public void comprarIngresso(int comprarFila, int comprarColuna) {
			ticket +=1;
			ingressoAtual += preco;
			sala[comprarFila][comprarColuna] = "X";
			System.out.println("\nValor do ingresso R$"+ preco+"\n");
			
		}
		
		public int calcularPreco(int comprarFila) {
			int valorTotal;
			
			valorTotal = ticket * preco;
			System.out.println("A quantidade de tickets comprado(s): "+ ticket);
			System.out.println("O valor total dos ingresso(s): R$"+ valorTotal);
			System.out.println(" ");
			return valorTotal;
			
		
		}
		
		
}

