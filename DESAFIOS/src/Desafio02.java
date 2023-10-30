import java.util.Scanner;

public class Desafio02 {
   
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		int limitador = 10;
        String nomes[] = new String[limitador];
		
		for(int i=0 ; i<limitador ; i++) {
            
			nomes[i] = sc. nextLine();
            
        }
        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
	}
}
