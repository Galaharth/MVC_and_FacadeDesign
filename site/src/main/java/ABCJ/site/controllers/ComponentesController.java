package ABCJ.site.controllers;

import ABCJ.site.models.FacadeCasa;
import ABCJ.site.models.ComponenteCasa;
import ABCJ.site.models.Ferramenta;
import ABCJ.site.models.Material;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Segundo Controller

@RestController
@RequestMapping("/api/componentes")
public class ComponentesController {
    private final FacadeCasa facadeCasa;


    // Instanciamento de objetos como modelo
    public ComponentesController() {
        facadeCasa = new FacadeCasa();
        facadeCasa.adicionarComponente(new Ferramenta("001", "Martelo"));
        facadeCasa.adicionarComponente(new Material("002", "Madeira"));
    }

    @GetMapping
    public List<ComponenteCasa> getComponentes() {
        return facadeCasa.listarComponentes(); // Agora funciona corretamente
    }
}
