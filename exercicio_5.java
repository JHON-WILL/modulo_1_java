import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        // Locale antes do scanner para não ter erro
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Variaveis
        int n_fun;
        System.out.println("Digite o numero do funcionário: ");
        n_fun = sc.nextInt();
        double n_hour;
        System.out.printf("Digite as horas trabalhadas do funcionario %d: \n", n_fun);
        n_hour = sc.nextDouble();
        double salario_hora;
        System.out.printf("Digite quanto o funcionario %d ganha por hora: \n", n_fun);
        salario_hora = sc.nextDouble();
        double salario = n_hour * salario_hora;
        // Saida de dados
        System.out.printf("O funcionario %d recebeu um salário de R$%.2f", n_fun, salario);

        sc.close();

    }
}