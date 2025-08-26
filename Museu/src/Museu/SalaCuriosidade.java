package Museu;

public class SalaCuriosidade extends Sala{

    public SalaCuriosidade(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        String textoCuriosidades = """
                ===== Curiosidades sobre Java =====
                -> O nome 'Java' vem de um tipo de café
                -> O mascote oficial é o Duke
                -> É uma das linguagens mais usadas no mundo corporativo
             
                """;
        System.out.println(textoCuriosidades);
    }
}
