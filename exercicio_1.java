import java.util.Locale;

public class exercicio_1 {
    public static void main(String[] args) {
        String produto_1 = "Computador";
        String produto_2 = "Mesa de escritorio";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        Double preco_1 = 2100.0;
        Double preco_2 = 650.50;
        double medida = 53.234567;

        Locale.setDefault(Locale.US);

        System.out.printf("%s, cujo preço é R$%.2f\n", produto_1, preco_1);
        System.out.printf("%s, cujo preço é R$%.2f\n\n", produto_2, preco_2);
        System.out.printf(" Anotação:\n Idade: %d\n Codigo: %d\n Sexo: %s\n\n", idade, codigo, genero);
        System.out.printf(
                " Medida com oito casas decimais: %.8f\n Medida com duas casa decimais: %.2f\n Pontos decimais brasileiros: %.2f \n",
                medida, medida, medida);

    }

}
