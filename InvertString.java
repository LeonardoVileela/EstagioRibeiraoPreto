import java.util.Scanner;

public class InvertString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a String que deseja inverter");
        String[] entrada = scanner.nextLine().split("");
        String resposta = "";

        for (int i = entrada.length - 1; i >= 0; i--) {
            resposta = resposta + entrada[i];
        }

        System.out.println(resposta);

    }
}
