import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // final = const
        System.out.print("Digite o salário: ");
        final float salario = leitor.nextFloat();

        if (salario < 1000) {
            var novoSalario = salario * 1.1f;

            // sout
            System.out.println(novoSalario);
        } else {
            System.out.println("Salário dentro da faixa");
        }

    }

}