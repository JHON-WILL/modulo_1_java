import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char poligono;
        double a, b, c, raio, area;

        do {
            System.out.println(
                    "Digite: \nA para Triangulo \nB para Circulo \nC para Trapézio \nD para Quadrado \nE para Retângulo");
            poligono = sc.next().charAt(0);
        } while (poligono != 'a' && poligono != 'A' && poligono != 'b' && poligono != 'B' &&
                poligono != 'c' && poligono != 'C' && poligono != 'd' && poligono != 'D' &&
                poligono != 'e' && poligono != 'E');

        if (poligono == 'a' || poligono == 'A') {// calculo da area do triangulo

            System.out.println("A área do triângulo retângulo tem A por base e B por altura.");
            System.out.println("Digite A: ");
            a = sc.nextDouble();
            System.out.println("Digite B: ");
            b = sc.nextDouble();
            area = (a * b) / 2;

            System.err.printf("A area do triangulo é: %.3f", area);

        } else if (poligono == 'b' || poligono == 'B') {// calculo da area do circulo

            System.out.println("Qual é o raio do círculo?");
            raio = sc.nextDouble();
            area = 3.14159265359 * Math.pow(raio, 2.0);

            System.out.printf("A area do circulo é: %.3f", area);

        } else if (poligono == 'c' || poligono == 'C') {// calculo da area do trapezio

            System.out.println("A área do trapézio que tem A e B por bases e C por altura");
            System.out.println("Digite A: ");
            a = sc.nextDouble();
            System.out.println("Digite B: ");
            b = sc.nextDouble();
            System.out.println("Digite C: ");
            c = sc.nextDouble();
            area = (a + b) * (c / 2);

            System.out.printf("A area do trapézio é: %.3f", area);

        } else if (poligono == 'd' || poligono == 'D') {// calculo da area do quadrado

            System.out.println("A área do quadrado que tem base A e lado B");
            System.out.println("Digite A: ");
            a = sc.nextDouble();
            System.out.println("Digite B: ");
            b = sc.nextDouble();
            area = a * b;

            System.out.printf("A a área do quadrado é: %.3f", area);

        } else if (poligono == 'e' || poligono == 'E') {// calculo da area do retangulo

            System.out.println("a área do retângulo que tem lados A e B.");
            System.out.println("Digite A: ");
            a = sc.nextDouble();
            System.out.println("Digite B: ");
            b = sc.nextDouble();
            area = a * b;

            System.out.printf("A a área do retângulo é: %.3f", area);

        }

        sc.close();
    }
}