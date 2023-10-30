import java.util.Scanner;

public class DesafioControleDeFluxo {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();
        System.out.println(" ");

        try {
            conta(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExceptions exceptions) {
            System.out.println("Informe o segundo valor maior que o primeiro.");
        }
    }    

    static void conta (int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions {
        int contar = parametroDois - parametroUm;
        int contador = 1;

        if (parametroDois > parametroUm) {
           while (contador <= contar) {
            System.out.println("Imprimindo o número: " + contador);
            contador++;
            } 
        } else {
            throw new ParametrosInvalidosExceptions();
        }
        
        
    }
}
