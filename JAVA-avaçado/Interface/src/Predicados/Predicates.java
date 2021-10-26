package Predicados;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<String> EstaVazio = valor -> valor.isEmpty();
        System.out.println(EstaVazio.test("ola"));
    }
}
