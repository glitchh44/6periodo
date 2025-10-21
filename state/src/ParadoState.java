public class ParadoState implements EstadoPlayer {
    private final MusicPlayer player;

    public ParadoState(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        if (player.temFaixas()) {
            System.out.println("▶️  Reproduzindo: " + player.faixaAtual());
            player.setEstado(player.getReproduzindoState());
        } else {
            System.out.println("Playlist vazia. Adicione músicas primeiro.");
        }
    }

    @Override
    public void pause() {
        System.out.println("Não é possível pausar: o player está parado.");
    }

    @Override
    public void stop() {
        System.out.println("Já está parado.");
    }

    @Override
    public void next() {
        if (player.temFaixas()) {
            player.proximaFaixa();
            System.out.println("Próxima selecionada: " + player.faixaAtual() + " (ainda parado, use Play)");
        } else {
            System.out.println("Playlist vazia.");
        }
    }

    @Override
    public void prev() {
        if (player.temFaixas()) {
            player.faixaAnterior();
            System.out.println("Anterior selecionada: " + player.faixaAtual() + " (ainda parado, use Play)");
        } else {
            System.out.println("Playlist vazia.");
        }
    }

    @Override
    public String nome() { return "PARADO"; }
}
