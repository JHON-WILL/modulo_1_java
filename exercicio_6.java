import java.util.Locale;
import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // variaveis
        int cod_peca1, qtd_peca1, cod_peca2, qtd_peca2;
        double vlr_peca1, vlr_peca2, vlr_pago;
        // entrada de dados
        System.out.println("Digite o codigo da peça 1, a quantidade de peças e o valor unitario da peça 1");
        cod_peca1 = sc.nextInt();
        qtd_peca1 = sc.nextInt();
        vlr_peca1 = sc.nextDouble();
        System.out.println("Digite o codigo da peça 2, a quantidade de peças e o valor unitario da peça 2");
        cod_peca2 = sc.nextInt();
        qtd_peca2 = sc.nextInt();
        vlr_peca2 = sc.nextDouble();

        vlr_pago = qtd_peca1 * vlr_peca1 + qtd_peca2 * vlr_peca2;
        // saida de dados
        System.out.printf("O valor da compra ficou R$%.2f", vlr_pago);

        sc.close();
    }
}