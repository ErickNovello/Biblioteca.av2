package domain;

    //extends herança
public class Livro extends Exemplar{

    //Polimorfismo
    @Override
    public void reserva() {
        System.out.println("Livro "+ getNome() + " do autor "+ getAutor()+ " do ano "+getAnoLançamento()
                + " reservado com sucesso!");
        setStatus("Livro reservado");
    }

    //Construtor
    public Livro(String nome, Integer anoLançamento, String autor) {
        super(nome, anoLançamento, autor);
    }
}
