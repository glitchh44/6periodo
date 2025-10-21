import java.util.*;

public class MusicPlayer {
    private final List<String> playlist = new ArrayList<>();
    private int indexAtual = 0;

    private final EstadoPlayer paradoState;
    private final EstadoPlayer reproduzindoState;
    private final EstadoPlayer pausadoState;
    private EstadoPlayer estadoAtual;

    public MusicPlayer(List<String> faixas) {
        if (faixas != null) playlist.addAll(faixas);
        paradoState = new ParadoState(this);
        reproduzindoState = new ReproduzindoState(this);
        pausadoState = new PausadoState(this);
        estadoAtual = paradoState;
    }

    // Delegação
    public void play()  { estadoAtual.play(); }
    public void pause() { estadoAtual.pause(); }
    public void stop()  { estadoAtual.stop(); }
    public void next()  { estadoAtual.next(); }
    public void prev()  { estadoAtual.prev(); }

    // Helpers de playlist/estado
    boolean temFaixas() { return !playlist.isEmpty(); }

    String faixaAtual() {
        if (!temFaixas()) return "(sem faixas)";
        indexAtual = ((indexAtual % playlist.size()) + playlist.size()) % playlist.size();
        return playlist.get(indexAtual);
    }

    void proximaFaixa() {
        if (temFaixas()) indexAtual = (indexAtual + 1) % playlist.size();
    }

    void faixaAnterior() {
        if (temFaixas()) indexAtual = (indexAtual - 1 + playlist.size()) % playlist.size();
    }

    public void adicionarFaixa(String nome) {
        playlist.add(nome);
        System.out.println("Adicionada: " + nome);
    }

    public void listarPlaylist() {
        if (!temFaixas()) {
            System.out.println("Playlist vazia.");
            return;
        }
        System.out.println("Playlist (" + playlist.size() + "):");
        for (int i = 0; i < playlist.size(); i++) {
            String marcador = (i == indexAtual) ? " -> " : "    ";
            System.out.println(marcador + (i+1) + ". " + playlist.get(i));
        }
    }

    // Getters de estados
    public EstadoPlayer getParadoState() { return paradoState; }
    public EstadoPlayer getReproduzindoState() { return reproduzindoState; }
    public EstadoPlayer getPausadoState() { return pausadoState; }

    public void setEstado(EstadoPlayer novo) {
        this.estadoAtual = novo;
        System.out.println("Estado atual: " + estadoAtual.nome());
    }
}
