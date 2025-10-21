public class PausadoState implements EstadoPlayer {
    private final MusicPlayer player;

    public PausadoState(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("▶️  Retomando: " + player.faixaAtual());
        player.setEstado(player.getReproduzindoState());
    }

    @Override
    public void pause() {
        System.out.println("Já está pausado.");
    }

    @Override
    public void stop() {
        System.out.println("⏹️  Parando (saindo de pausado).");
        player.setEstado(player.getParadoState());
    }

    @Override
    public void next() {
        player.proximaFaixa();
        System.out.println("Próxima selecionada: " + player.faixaAtual() + " (pausado, use Play para tocar)");
    }

    @Override
    public void prev() {
        player.faixaAnterior();
        System.out.println("Anterior selecionada: " + player.faixaAtual() + " (pausado, use Play para tocar)");
    }

    @Override
    public String nome() { return "PAUSADO"; }
}
