package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //linha de frente, apresentar menus e receber dados

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
