package Funcoes;

import java.util.function.Function;

public class Funcitons {
    public static void main(String[] args) {
        Function<String, String> RetornaNomeContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> RetornaInteiro = string -> Integer.valueOf(string);

        System.out.println(RetornaNomeContrario.apply("Ola Mundo"));
        System.out.println(RetornaInteiro.apply("456"));
    }
}
