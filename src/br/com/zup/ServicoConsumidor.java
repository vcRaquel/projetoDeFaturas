package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    //validar email
    public static void validarEmail(String email){
        if (email.contains("@")){
            System.out.println("Email inválido");
        }
    }
    //cadastrar consumidor

    //pesquisar consumidor por email
}
