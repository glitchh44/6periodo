public class FreteEconomico implements FreteStrategy {
    @Override
    public double calcular(double peso, double distancia) {
        return (peso * 0.8) + (distancia * 0.3); // mais barato e mais demorado
    }
}
