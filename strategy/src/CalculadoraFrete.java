public class CalculadoraFrete {
    private FreteStrategy strategy;

    public void setStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularFrete(double peso, double distancia) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete definida!");
        }
        return strategy.calcular(peso, distancia);
    }
}
