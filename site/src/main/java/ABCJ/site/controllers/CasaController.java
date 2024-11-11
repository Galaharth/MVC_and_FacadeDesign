package ABCJ.site.controllers;

import ABCJ.site.models.FacadeCasa;
import ABCJ.site.models.Ferramenta;
import ABCJ.site.models.Material;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// Primeiro Controller

@Controller
@RequestMapping("/componentes")
public class CasaController {
    private final FacadeCasa facadeCasa;

    // Instanciamento de objetos como modelo
    public CasaController() {
        facadeCasa = new FacadeCasa();
        facadeCasa.adicionarComponente(new Ferramenta("001", "Martelo"));
        facadeCasa.adicionarComponente(new Material("002", "Madeira"));
    }

    @GetMapping
    public String getComponentes(Model model) {
        model.addAttribute("componentes", facadeCasa.listarComponentes());
        return "componentes"; // Nome do arquivo HTML Thymeleaf
    }
}
