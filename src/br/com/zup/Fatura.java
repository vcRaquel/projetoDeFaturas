package br.com.zup;

import java.util.Calendar;
import java.util.Date;

public class Fatura {
    private Consumidor consumidor;
    private double valor;
    private String data;

    //construtor
    public Fatura() {

    }

    public Fatura(Consumidor consumidor, double valor, String data) {
        this.consumidor = consumidor;
        this.valor = valor;
        this.data = data;
    }

    //getters e setters

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Titular da fatura: " + consumidor.getNome());
        retorno.append("\n Valor da fatura R$: " + valor);
        retorno.append("\n Data de vencimento: " + data);
        return retorno.toString();
    }
}
