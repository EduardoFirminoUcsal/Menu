package br.com.Menu.Prato;

public class Prato {
    private int id;
    private String nome;
    private String ingredientes;
    private String tipo;

    // Construtor vazio (padrão) para a classe Prato
    public Prato() {
    }

    // Construtor com parâmetros para criar um objeto Prato com ID, nome, ingredientes e tipo
    public Prato(int id, String nome, String ingredientes, String tipo) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
    }

    // Construtor com parâmetros para criar um objeto Prato com nome, ingredientes e tipo
    public Prato(String nome, String ingredientes, String tipo) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
    }

    // Getters e setters para acessar e modificar os atributos da classe Prato

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
