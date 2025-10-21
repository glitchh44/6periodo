public class ReproduzindoState implements EstadoPlayer {
    private final MusicPlayer player;

    public ReproduzindoState(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Já está reproduzindo: " + player.faixaAtual());
    }

    @Override
    public void pause() {
        System.out.println("⏸️  Pausado: " + player.faixaAtual());
        player.setEstado(player.getPausadoState());
    }

    @Override
    public void stop() {
        System.out.println("⏹️  Parando reprodução.");
        player.setEstado(player.getParadoState());
    }

    @Override
    public void next() {
        player.proximaFaixa();
        System.out.println("▶️  Reproduzindo próxima: " + player.faixaAtual());
    }

    @Override
    public void prev() {
        player.faixaAnterior();
        System.out.println("▶️  Reproduzindo anterior: " + player.faixaAtual());
    }

    @Override
    public String nome() { return "REPRODUZINDO"; }
}
