package Museu;

public class SalaVersoes extends Sala{

    public SalaVersoes(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        String textoVersoesJava = """
                ===== Principais versões do Java =====
                -> Java 1.0 (1995): primeira versão oficial
                -> Java 5 (2004): introduziu Generics e Annotations
                -> Java 8 (2014): trouxe Lambda Expressions e Stream API
                -> Java 17 (2021): versão LTS com novas melhorias
                
                """;
        System.out.println(textoVersoesJava);
    }
}
