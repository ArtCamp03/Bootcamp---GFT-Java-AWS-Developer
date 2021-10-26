package Funcional;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //funcional
        int[] valores = {1,2,3,4,5,6};
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));
    }
}
