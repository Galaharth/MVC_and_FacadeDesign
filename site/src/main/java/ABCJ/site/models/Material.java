package ABCJ.site.models;


    // Classe Material está encapsulado ou também, pode-se considerar child do facade
public class Material implements ComponenteCasa {
    private String codigo;
    private String nome;

    public Material(String codigo, String nome) {
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
