import java.util.Scanner;

public class TesteFuncionario {



    public static  void main(String args[]) {
        Scanner leitura = new Scanner(System.in);
        Funcionario testefuncionario = new Funcionario();

        System.out.println("Digite o nome do funcionário: ");
        testefuncionario.nome = leitura.next();

        System.out.println("Digite o sobrenome do funcionário: ");
        testefuncionario.sobrenome = leitura.next();

        System.out.println("Digite as horas trabalhadas: ");
        testefuncionario.horasTrabalhadas = leitura.nextInt();

        /*0System.out.println("Digite o valor pago por hora");
        testefuncionario.valorPorHora = leitura.nextFloat();*/


        testefuncionario.valorPorHora = 8;

        System.out.println("Digite o valor de horas que deseja incrementar: ");
        int horas = leitura.nextInt();
        testefuncionario.incrementarHoras(horas);


        System.out.println(testefuncionario.nomeCompleto());
        System.out.println(testefuncionario.calcularSalario());







    }

}
