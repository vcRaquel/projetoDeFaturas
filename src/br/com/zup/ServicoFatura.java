package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String dataVencimento)throws Exception{
        Consumidor consumidor = ServicoConsumidor.buscarConsumidorPorEmail(email);
        Fatura fatura = new Fatura(consumidor,valor,dataVencimento);
        faturas.add(fatura);
        return fatura;
    }

    public static List<Fatura> buscarFaturaPorEmailConsumidor(String email){
        List<Fatura> faturasDoUsuario = new ArrayList<>();
        for (Fatura faturaReferencia: faturas) {
            if (faturaReferencia.getConsumidor().getEmail().equals(email)){
                faturasDoUsuario.add(faturaReferencia);
            }
        }
        return faturasDoUsuario;
    }
}
