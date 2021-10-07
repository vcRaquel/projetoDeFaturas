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
}
