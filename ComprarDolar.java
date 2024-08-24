import java.util.Scanner;

public class ComprarDolar {

    public static void main(String args[]) {
        Scanner leitura = new Scanner(System.in);

        Moeda dolar = new Moeda();

        System.out.println("Digite o valor de reais que deseja converter: ");
        dolar.ValorReal = leitura.nextDouble();

        System.out.println("Digite o valor da cotação do dolar: ");
        dolar.cotacaoDolar = leitura.nextDouble();

        dolar.calcularConversao();

    }

}
