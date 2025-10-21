import java.util.HashMap;
import java.util.Map;

public class DocumentoRegistry {
    private Map<String, Documento> prototipos = new HashMap<>();

    public void registrar(String chave, Documento doc) {
        prototipos.put(chave, doc);
    }

    public Documento criarDocumento(String chave) {
        Documento prototipo = prototipos.get(chave);
        if (prototipo == null) {
            throw new IllegalArgumentException("Protótipo não encontrado: " + chave);
        }
        return prototipo.clone(); // retorna cópia do protótipo
    }
}
