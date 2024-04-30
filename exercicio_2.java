import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        // entrada de dados
        System.out.println("Digite o primero número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        // saida de dados

        System.out.println("A soma dos numeros digitados é " + (num1 + num2));

        sc.close();

    }
}