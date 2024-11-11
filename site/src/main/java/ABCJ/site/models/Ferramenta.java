package ABCJ.site.models;

    // Ferramenta usa a interface ComponenteCasa
public class Ferramenta implements ComponenteCasa {
    private String codigo;
    private String nome;

    // Classe Ferramenta está encapsulado ou também, pode-se considerar child do facade
    public Ferramenta(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
