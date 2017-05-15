/**
 * @author ROBERTO ABREU BENTO
 * @author FELIPE OLIVEIRA
 * 
 * @date 13/05/2017
 * @version 1.0.1
 * @description FIFO STAGE ALGORITHM OPERATING STRUCTURE
 * 
 */
package fifo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		int opcaoint= 0;
		int value = 0;
		FIFO f = new FIFO();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		do {
			limpatela();
			System.out.println("|========================");
			System.out.println("|     Tamanho: 10        |");
			System.out.println("|                        |");
			System.out.println("|     1 - Est� Vazio?    |");
			System.out.println("|     2 - Est� Cheio?    |");
			System.out.println("|     3 - Adiciona Item  |");
			System.out.println("|     4 - Remove Item    |");
			System.out.println("|     5 - Mostra         |");
			System.out.println("|     0 - Sair           |");
			System.out.println("|=========================");
			System.out.print("Digite a op��o desejada: ");
			try{
	            opcaoint = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Op��o inv�lida!");
	            continue;
	        }
			System.out.println();
			switch (opcaoint) {
			case 1:
				boolean isEmpty = f.empty();
				if (isEmpty) {
					System.out.println("Est� vazio!!!");
				} else {
					System.out.println("N�O est� vazio!!!");
				}
				break;
			case 2:
				boolean isFull = f.full();
				if (isFull) {
					System.out.println("Est� cheio!!!");
				} else {
					System.out.println("N�O Est� cheio!!!");
				}
				break;   
			case 3:
				if (f.full()) {
					System.out.println("Fila cheia. N�o � poss�vel inserir um valor");
					break;
				}
				System.out.print("Informe o valor de deseja adicionar: ");
				try{
		            value = Integer.parseInt(br.readLine());
		        }catch(NumberFormatException nfe){
		            System.err.println("Op��o inv�lida!");
		            continue;
		        }
				System.out.println("Valor ["+value+"] adicionado na lista!!!");
				break;
			case 4:
				f.remove();
				System.out.println("Elemento removido da lista!!!");
				break;
			case 5:
				f.show();
				break;
			case 0:
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
			TimeUnit.SECONDS.sleep(2);
		} while (opcaoint != 0);
	}
	
	public static void limpatela() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 }
}

