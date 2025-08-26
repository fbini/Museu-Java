package Museu;

public class Visitante {
    private String nome;
    private int idade;

    public Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void explorarSala(Sala sala){
        System.out.println("===================================================================");
        System.out.println(nome + " entrou na "+ sala.getNome() + " (" + sala.getAnoCriacao() + ") ");
        System.out.println(sala.getDescricao());
        sala.exibirConteudo();
        System.out.println("===================================================================\n");

    }
}
