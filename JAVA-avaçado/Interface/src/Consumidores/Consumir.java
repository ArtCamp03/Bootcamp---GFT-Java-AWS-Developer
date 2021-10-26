package Consumidores;

import java.util.function.Consumer;

public class Consumir {
    public static void main(String[] args) {

        // por referencia
        Consumer<String> ImprimirFrase = System.out::println;
        // usando lambda
        Consumer<String> ImprimirFrase2 = Frase -> System.out.println(Frase);

        ImprimirFrase.accept("Ola a todos");
        ImprimirFrase2.accept("Chamou segunda impressao");
    }
}
