package ABCJ.site.models;


    // Classe Insumo está encapsulado ou também, pode-se considerar child do facade
public class Insumo implements ComponenteCasa {
    private String codigo;
    private String nome;
    private int quantidade;

    public Insumo(String codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
