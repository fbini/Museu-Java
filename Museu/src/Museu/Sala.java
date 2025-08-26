package Museu;

public abstract class Sala {
    private String nome;
    private String descricao;
    private int anoCriacao;

    public Sala(String nome, String descricao, int anoCriacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoCriacao = anoCriacao;
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void exibirConteudo(){

    }
}
