import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String nomeCliente, agencia;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o numero de agencia abaixo");
        agencia = entrada.nextLine();
        
        System.out.println("Digite seu nome");
        nomeCliente = entrada.nextLine();
        System.out.println("Por favor, insira o seu saldo");
        saldo = entrada.nextDouble();
        
        System.out.println("Insira aqui o numero da conta");
        numeroConta = entrada.nextInt();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "  + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
