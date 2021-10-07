package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    //validar email
    public static void validarEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Email inválido");
        }
    }

    //cadastrar consumidor
    public static Consumidor cadastrarConsumidor(String nome, String email) {
        validarEmail(email);
        Consumidor consumidor = new Consumidor(nome, email);
        return consumidor;
    }

    //pesquisar consumidor por email
    public static Consumidor buscarConsumidorPorEmail(String email) throws Exception { //para avisar que poderá ter uma exceção
        for (Consumidor consumidorReferencia : consumidores) {
            if (consumidorReferencia.getEmail().equals(email)) {
                return consumidorReferencia;
            }
        }//para dizer ode a exceção pode acontecer
        throw new Exception("Consumidor não encontrado");
    }
}
