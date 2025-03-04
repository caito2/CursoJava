import java.util.Scanner;

// Classe principal
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) { // pega a condição da exceção
            // Imprimir a mensagem: "O segundo parâmetro deve ser maior que o primeiro"
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();// lança uma nova exceção da classe parametroinvalido
        }

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println(i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    // criação de exceção
}
