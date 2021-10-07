package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    //linha de frente, apresentar menus e receber dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Digite 1 para cadastrar um consumidor");
        System.out.println("Digite 2 para cadastrar uma fatura");
        System.out.println("Digite 3 para sair");
    }

    public static Consumidor cadastrarConsumidor() {
        String nome = capturarDados("Digite o nome do consumidor: ").nextLine();
        String email = capturarDados("Digite o email do consumidor").nextLine();
        //chama o método c mesmo nome da classe de servicoConsumidor (mesmo nome, pois são partes do mesmo objetivo)
        return ServicoConsumidor.cadastrarConsumidor(nome, email);
    }

    public static Fatura cadastrarFatura() throws Exception {
        String email = capturarDados("\n Digite o email do consumidor: ").nextLine();
        double valor = capturarDados("\n Digite o valor da fatura: ").nextInt();
        String dataVencimento = capturarDados("\n Digite a data de vencimento da fatura: ").nextLine();
        return ServicoFatura.cadastrarFatura(email, valor, dataVencimento);
    }

    public static List<Fatura> pesquisarFatura(){
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        ServicoConsumidor.validarEmail(email);
        List<Fatura> faturas = ServicoFatura.buscarFaturaPorEmailConsumidor(email);
        return faturas;
    }
}
