package domain;

public class Cliente {

    // atributos
    private String name;
    private Integer idade;
    private Integer codigo;


    //construtor
    public Cliente(String name, Integer idade, Integer codigo) {
        this.name = name;
        this.idade = idade;
        this.codigo = codigo;
    }
    public Cliente() {
    }

    //Get and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
