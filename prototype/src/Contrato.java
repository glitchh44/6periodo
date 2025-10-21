import java.time.LocalDate;

public class Contrato extends Documento {
    public Contrato(String cliente) {
        super(
            "Contrato de Prestação de Serviços",
            cliente,
            LocalDate.now(),
            """
            CONTRATO DE PRESTAÇÃO DE SERVIÇOS

            Este contrato estabelece as condições de prestação de serviços de consultoria técnica entre as partes.
            O contratante declara estar ciente das cláusulas e condições aqui estabelecidas.
            """,
            "Diretor de Operações"
        );
    }

    private Contrato(String titulo, String cliente, LocalDate data, String conteudo, String assinatura) {
        super(titulo, cliente, data, conteudo, assinatura);
    }

    @Override
    public Documento clone() {
        return new Contrato(titulo, cliente, data, conteudo, assinatura);
    }
}
