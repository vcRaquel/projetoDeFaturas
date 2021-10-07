package br.com.zup;

public class Consumidor {
    private String nome;
    private String email;

    //construtores
    public Consumidor() {

    }

    public Consumidor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n O nome do consumidor é: " + getNome());
        retorno.append("\n O e-mail do consumidor é: " + getEmail());
        return retorno.toString();
    }
}
