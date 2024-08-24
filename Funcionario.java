public class Funcionario {
    public String nome;
    public String sobrenome;
    public int horasTrabalhadas;
    public float valorPorHora;



    public String nomeCompleto()
    {
        System.out.println("Nome Completo do funcionário: ");
        return (nome + " " +  sobrenome);
    }

    public float calcularSalario() {

        System.out.println("O seu salário será de: ");
        return ( horasTrabalhadas * valorPorHora);

    }

    public void incrementarHoras(int horasincrementadas) {
        this.valorPorHora += horasincrementadas;


    }


}
