package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarConsumidor();
            Sistema.cadastrarConsumidor();

            Sistema.cadastrarFatura();
            System.out.println(Sistema.buscarFaturaPorEmailConsumidor());
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}
