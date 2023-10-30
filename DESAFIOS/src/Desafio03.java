import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args){
		try (Scanner leitor = new Scanner(System.in)) {
			int C = leitor.nextInt();
			String nome;
			

// TODO: complete os espaços em branco com sua solução para o problema

			for (int i = 0; i < C ; i++) {
				nome = leitor.next();
				/*int numero = leitor.nextInt();*/
				if (nome.equals("Thor")) System.out.println("Y");
				else System.out.println("N");
			}
		}
    }
}
