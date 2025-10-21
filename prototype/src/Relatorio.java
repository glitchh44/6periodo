import java.time.LocalDate;

public class Relatorio extends Documento {
    private String periodo;

    public Relatorio(String cliente, String periodo) {
        super(
            "Relatório Mensal de Consultoria",
            cliente,
            LocalDate.now(),
            "Relatório detalhado das atividades e resultados do período.",
            "Gerente de Projetos"
        );
        this.periodo = periodo;
    }

    public void setPeriodo(String periodo) { this.periodo = periodo; }

    private Relatorio(String titulo, String cliente, LocalDate data, String conteudo, String assinatura, String periodo) {
        super(titulo, cliente, data, conteudo, assinatura);
        this.periodo = periodo;
    }

    @Override
    public Documento clone() {
        return new Relatorio(titulo, cliente, data, conteudo, assinatura, periodo);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Período do relatório: " + periodo);
        System.out.println("================================\n");
    }
}
