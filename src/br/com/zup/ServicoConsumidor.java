package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    //validar email
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")) {
            throw new Exception("Email inválido");
        }
    }

    //verificar se email já existe no cadastro
    public static void verificarEmailNaListaCadastrada(String email) throws Exception{
        for (Consumidor referencia: consumidores){
            if (referencia.getEmail().equals(email)){
                throw new Exception("Este email já está cadastrado");
            }
        }
    }

    //cadastrar consumidor
    public static Consumidor cadastrarConsumidor(String nome, String email) throws Exception{
        validarEmail(email);
        verificarEmailNaListaCadastrada(email);
        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor); // fiz agora
        return consumidor;
    }

    //pesquisar consumidor por email
    public static Consumidor buscarConsumidorPorEmail(String email) throws Exception { //para avisar que poderá ter uma exceção
        for (Consumidor consumidorReferencia : consumidores) {
            if (consumidorReferencia.getEmail().equals(email)) {
                return consumidorReferencia;
            }
        }//para dizer ode a exceção pode acontecer
        throw new Exception("Consumidor não encontrado no sistema");
    }

//    //exibir lista de consumidores fiz agora só pra testar
//    public static void exibirConsumidores(){
//        for (Consumidor referencia: consumidores){
//            System.out.println(referencia);
//        }
//    }
}
