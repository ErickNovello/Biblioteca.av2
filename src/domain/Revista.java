package domain;

    //extends herança
public class Revista extends Exemplar{

    //Polimorfismo / sobrescrita
    @Override
    public void reserva() {
        System.out.println("Revista "+ getNome() + " do autor "+ getAutor()+ " do ano "+getAnoLançamento()
                + " reservado com sucesso!");
        setStatus("Revista reservado");
    }

    //Construtor
    public Revista(String nome, Integer anoLançamento, String autor) {
        super(nome, anoLançamento, autor);
    }
}
