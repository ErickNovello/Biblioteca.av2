import domain.Biblioteca;
import domain.Cliente;
import domain.Livro;
import domain.Revista;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Livro livro1 = new Livro("1 - HP", 2010, "JK");
        Livro livro2 = new Livro("2 - Pierce Jackson", 2011, "Bryan");
        Livro livro3 = new Livro("3 - AC Origins", 2015, "Ezio");
        Revista revista1 = new Revista("4 - Veja", 2007, "Cidiney");
        Revista revista2 = new Revista("5 - Epoca", 2022, "Carlos");
        Revista revista3 = new Revista("6 - Caras", 2009, "Irineu");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNome("Cebo nasCalenas");
        biblioteca.setLivro(Arrays.asList(livro1, livro2, livro3));
        biblioteca.setRevista(Arrays.asList(revista1, revista2, revista3));

        Cliente cli1 = new Cliente();
        System.out.println("Para se cadastrar no sistema digite seu nome: ");
        cli1.setName(entrada.nextLine());
        System.out.println("Digite sua idade:");
        cli1.setIdade(entrada.nextInt());
        cli1.setCodigo(+1);

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Cliente Criado com sucesso:");
        System.out.println("Nome: " + cli1.getName());
        System.out.println("Idade: " + cli1.getIdade());
        System.out.println("Código: " + cli1.getCodigo());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("\nPara alugar um exemplar, escolha abaixo um dos modelos:");
        biblioteca.listarExemplares();

        System.out.println("Digite o codigo do livro: ");
        Integer resposta = entrada.nextInt();

        if (resposta == 1){
            livro1.reserva();
        } else if (resposta == 2){
            livro2.reserva();
        } else if (resposta == 3){
            livro3.reserva();
        } else if (resposta == 4){
            revista1.reserva();
        } else if (resposta == 5){
            revista2.reserva();
        } else if (resposta == 6){
            revista3.reserva();
        } else {
            System.out.println("Livro ou Revista Inexistente, Gentileza, escreva novamente o nome corretamente.");
        }



    }
}
