import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> faixasIniciais = Arrays.asList(
            "Lo-fi Beats - Sunrise",
            "Chillhop - Coffee Time",
            "Synthwave - Night Drive"
        );
        MusicPlayer player = new MusicPlayer(faixasIniciais);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MUSIC PLAYER ===");
            System.out.println("[1] Play / Retomar");
            System.out.println("[2] Pause");
            System.out.println("[3] Stop");
            System.out.println("[4] Próxima faixa");
            System.out.println("[5] Faixa anterior");
            System.out.println("[6] Listar playlist");
            System.out.println("[7] Adicionar faixa");
            System.out.println("[0] Sair");
            System.out.print("Escolha: ");

            String op = sc.nextLine().trim();
            switch (op) {
                case "1": player.play(); break;
                case "2": player.pause(); break;
                case "3": player.stop(); break;
                case "4": player.next(); break;
                case "5": player.prev(); break;
                case "6": player.listarPlaylist(); break;
                case "7":
                    System.out.print("Nome da nova faixa: ");
                    String nome = sc.nextLine();
                    player.adicionarFaixa(nome);
                    break;
                case "0":
                    System.out.println("Até mais! 👋");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
