package domain;

import java.util.List;

public class Biblioteca {

    //Atributos
    private String nome;
    private List<Livro> livro;
    private List<Revista> revista;

    //Metodo que lista os exemplares
    public void listarExemplares(){
        System.out.println("Livros: ");
        for (Livro livros : livro) {
            System.out.println(livros.getNome());
        }
        System.out.println("\nRevistas: ");
        for (Revista revistas : revista) {
            System.out.println(revistas.getNome());
        }
    }

    //Get e Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Livro> getLivro() {
        return livro;
    }
    public void setLivro(List<Livro> livro) {
        this.livro = livro;
    }
    public List<Revista> getRevista() {
        return revista;
    }
    public void setRevista(List<Revista> revista) {
        this.revista = revista;
    }
}
