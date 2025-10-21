public class FreteNormal implements FreteStrategy {
    @Override
    public double calcular(double peso, double distancia) {
        return (peso * 1.2) + (distancia * 0.5);
    }
}
