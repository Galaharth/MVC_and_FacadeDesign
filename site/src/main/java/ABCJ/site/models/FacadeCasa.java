package ABCJ.site.models;

import java.util.ArrayList;
import java.util.List;


// Uso de design pattern facade para uso de herança
public class FacadeCasa {
    private List<ComponenteCasa> componentes;

    public FacadeCasa() {
        componentes = new ArrayList<>();
    }

    public void adicionarComponente(ComponenteCasa componente) {
        componentes.add(componente);
    }

    public List<ComponenteCasa> listarComponentes() {
        return componentes;
    }
}
