package Museu;

public class SalaFundadores extends Sala{

    public SalaFundadores(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        String textoFundadores = """
                ===== Fundadores do Java =====
                -> James Gosling, considerado o pai do Java
                -> Criado na Sun Microsystems em 1991, lançado em 1995
                -> O objetivo inicial era para dispositivos eletrônicos e televisores interativos
                
                """;
        System.out.println(textoFundadores);

    }

}
