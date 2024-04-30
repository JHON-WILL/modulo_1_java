import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;
        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);

        System.out.println("A area do circulo é " + area);

        sc.close();
    }
}