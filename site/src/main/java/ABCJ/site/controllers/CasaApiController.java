package ABCJ.site.controllers;

import ABCJ.site.models.FacadeCasa;
import ABCJ.site.models.Ferramenta;
import ABCJ.site.models.Material;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/componentes")
public class CasaApiController {
    private final FacadeCasa facadeCasa;

    public CasaApiController() {
        facadeCasa = new FacadeCasa();
        facadeCasa.adicionarComponente(new Ferramenta("001", "Martelo"));
        facadeCasa.adicionarComponente(new Material("002", "Madeira"));
    }

    @GetMapping
    public Object getComponentes() {
        return facadeCasa.listarComponentes();
    }
}
