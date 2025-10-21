public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        calculadora.setStrategy(new FreteNormal());
        System.out.println("Frete Normal: R$ " + calculadora.calcularFrete(10, 100));

        calculadora.setStrategy(new FreteExpresso());
        System.out.println("Frete Expresso: R$ " + calculadora.calcularFrete(10, 100));

        calculadora.setStrategy(new FreteEconomico());
        System.out.println("Frete Econômico: R$ " + calculadora.calcularFrete(10, 100));
    }
}
