public class FreteExpresso implements FreteStrategy {
    @Override
    public double calcular(double peso, double distancia) {
        return (peso * 2.0) + (distancia * 1.0) + 15; // mais caro e mais rápido
    }
}
