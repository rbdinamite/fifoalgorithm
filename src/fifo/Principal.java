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
			System.out.println("|     1 - Está Vazio?    |");
			System.out.println("|     2 - Está Cheio?    |");
			System.out.println("|     3 - Adiciona Item  |");
			System.out.println("|     4 - Remove Item    |");
			System.out.println("|     5 - Mostra         |");
			System.out.println("|     0 - Sair           |");
			System.out.println("|=========================");
			System.out.print("Digite a opção desejada: ");
			try{
	            opcaoint = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Opção inválida!");
	            continue;
	        }
			System.out.println();
			switch (opcaoint) {
			case 1:
				boolean isEmpty = f.empty();
				if (isEmpty) {
					System.out.println("Está vazio!!!");
				} else {
					System.out.println("NÃO está vazio!!!");
				}
				break;
			case 2:
				boolean isFull = f.full();
				if (isFull) {
					System.out.println("Está cheio!!!");
				} else {
					System.out.println("NÃO Está cheio!!!");
				}
				break;   
			case 3:
				if (f.full()) {
					System.out.println("Fila cheia. Não é possível inserir um valor");
					break;
				}
				System.out.print("Informe o valor de deseja adicionar: ");
				try{
		            value = Integer.parseInt(br.readLine());
		        }catch(NumberFormatException nfe){
		            System.err.println("Opção inválida!");
		            continue;
		        }
				f.add(value);
				System.out.println("Valor ["+value+"] adicionado na lista!!!");
				break;
			case 4:
				if (f.empty()) {
					System.out.println("Lista vazia!!!");
				} else {
					f.remove();
					System.out.println("Elemento removido da lista!!!");
				}
				break;
			case 5:
				f.show();
				break;
			case 0:
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			TimeUnit.SECONDS.sleep(1);
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

