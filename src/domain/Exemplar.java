package domain;

public abstract class Exemplar {

    //Atributos
    private String status = "Livre";
    private String nome;
    private Integer anoLançamento;
    private String autor;

    //Metodo para reservar livro
    public void reserva(){
        System.out.println("Exemplar "+ nome + " reservado com sucesso!");
        this.status = "Exemplar reservado";
    }


    //Get and Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAnoLançamento() {
        return anoLançamento;
    }
    public void setAnoLançamento(Integer anoLançamento) {
        this.anoLançamento = anoLançamento;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //Construtor
    public Exemplar(String nome, Integer anoLançamento, String autor) {
        this.nome = nome;
        this.anoLançamento = anoLançamento;
        this.autor = autor;
    }
    public Exemplar() {
    }

}
