import java.time.LocalDate;

public class Fatura extends Documento {
    private double valor;

    public Fatura(String cliente, double valor) {
        super(
            "Fatura de Serviços",
            cliente,
            LocalDate.now(),
            "Descrição dos serviços prestados e valores correspondentes.",
            "Financeiro - Empresa XYZ"
        );
        this.valor = valor;
    }

    public void setValor(double valor) { this.valor = valor; }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Valor total: R$ " + valor);
        System.out.println("================================\n");
    }

    private Fatura(String titulo, String cliente, LocalDate data, String conteudo, String assinatura, double valor) {
        super(titulo, cliente, data, conteudo, assinatura);
        this.valor = valor;
    }

    @Override
    public Documento clone() {
        return new Fatura(titulo, cliente, data, conteudo, assinatura, valor);
    }
}
