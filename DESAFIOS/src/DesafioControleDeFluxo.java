import java.util.Scanner;

public class DesafioControleDeFluxo {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            int parametroUm = terminal.nextInt();
            int parametroDois = terminal.nextInt();
            int contador = 0;

            if (parametroUm < parametroDois) {
                int contar = parametroDois - parametroUm;
                System.out.println(contar);
                while (contador < contar) {
                    System.out.println(contador+1);
                    contador++;
                }
            }
        }

       /* try {
                //Chamando o método contendo a lógica de contagem
                contar (parametroUm, parametroDois);
        } catch */
    }
}
