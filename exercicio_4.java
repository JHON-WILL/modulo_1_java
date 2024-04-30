import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        c = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        d = sc.nextInt();

        int resultado = (a * b - c * d);

        System.out.println("O resultado da equação  (A * B - C * D) é " + resultado);

        sc.close();
    }
}