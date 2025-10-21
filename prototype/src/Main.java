import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DocumentoRegistry registry = new DocumentoRegistry();

        // Registra protótipos base
        registry.registrar("contrato", new Contrato("Cliente Genérico"));
        registry.registrar("fatura", new Fatura("Cliente Genérico", 0.0));
        registry.registrar("relatorio", new Relatorio("Cliente Genérico", "Janeiro/2025"));

        // Gera documentos personalizados
        Contrato contratoJoao = (Contrato) registry.criarDocumento("contrato");
        contratoJoao.setCliente("João da Silva");
        contratoJoao.setData(LocalDate.of(2025, 1, 20));
        contratoJoao.setAssinatura("Maria Carvalho - Diretora Comercial");

        Fatura faturaAna = (Fatura) registry.criarDocumento("fatura");
        faturaAna.setCliente("Ana Costa");
        faturaAna.setValor(4590.75);
        faturaAna.setData(LocalDate.of(2025, 2, 10));

        Relatorio relatorioCarlos = (Relatorio) registry.criarDocumento("relatorio");
        relatorioCarlos.setCliente("Carlos Andrade");
        relatorioCarlos.setPeriodo("Fevereiro/2025");

        // Exibe os documentos
        contratoJoao.exibir();
        faturaAna.exibir();
        relatorioCarlos.exibir();
    }
}
