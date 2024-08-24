public class Moeda {
    public double ValorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void calcularConversao() {
        quantidadeDolar = ValorReal / cotacaoDolar;
        System.out.println("A quantidade de dolar que será convertida será de: " + quantidadeDolar + "$");


    }
}
