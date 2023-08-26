import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando o objeto scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Bem Vindo ao Banco Santander Digital");
        System.out.println(" ");

        System.out.print("Por favor informe o seu nome: ");
        String nome = input.next();

        System.out.print("Por favor informe o seu sobrenome: ");
        String sobrenome = input.next();

        System.out.print("Por favor informe a sua agência: ");
        int agencia = input.nextInt();

        System.out.print("Por favor informe a sua conta: ");
        int conta = input.nextInt();

        System.out.print("Por favor informe o seu saldo: ");
        double saldo = input.nextDouble();
        System.out.println(" ");

        //imprimindo os dados obtidos
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta " + conta + ", e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
