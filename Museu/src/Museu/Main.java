package Museu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("== Bem vindo ao Museu do Java ==");
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        Visitante visitante = new Visitante(nome, idade);

        Sala salaFundadores = new SalaFundadores("Sala fundadores", "História de James Gosling", 1991);
        Sala salaVersoes = new SalaVersoes("Sala de Versões", "Principais versões do Java",1995);
        Sala salaCuriosidades = new SalaCuriosidade("Sala de Curiosidades", "Fatos interessantes e curiosidades sobre Java", 2000);

        int opcao;
        do {
            System.out.println("Bem-vindo ao Museu da Programação Java");
            System.out.println("Escolha uma sala para visitar: ");
            System.out.println("1. " + salaFundadores.getNome());
            System.out.println("2. " + salaVersoes.getNome());
            System.out.println("3. " + salaCuriosidades.getNome());
            System.out.println("0. Sair do museu");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    visitante.explorarSala(salaFundadores);
                    break;
                case 2:
                    visitante.explorarSala(salaVersoes);
                    break;
                case 3:
                    visitante.explorarSala(salaCuriosidades);
                    break;
                case 0:
                    System.out.println("Obrigado pela visita! ");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

    }

}