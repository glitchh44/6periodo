import java.time.LocalDate;

public abstract class Documento implements Prototype<Documento> {
    protected String titulo;
    protected String cliente;
    protected LocalDate data;
    protected String conteudo;
    protected String assinatura;

    public Documento(String titulo, String cliente, LocalDate data, String conteudo, String assinatura) {
        this.titulo = titulo;
        this.cliente = cliente;
        this.data = data;
        this.conteudo = conteudo;
        this.assinatura = assinatura;
    }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setData(LocalDate data) { this.data = data; }
    public void setAssinatura(String assinatura) { this.assinatura = assinatura; }

    public void exibir() {
        System.out.println("================================");
        System.out.println("Título: " + titulo);
        System.out.println("Cliente: " + cliente);
        System.out.println("Data: " + data);
        System.out.println("Conteúdo:\n" + conteudo);
        System.out.println("Assinado por: " + assinatura);
        System.out.println("================================\n");
    }

    // método que cada subclasse vai implementar
    public abstract Documento clone();
}
