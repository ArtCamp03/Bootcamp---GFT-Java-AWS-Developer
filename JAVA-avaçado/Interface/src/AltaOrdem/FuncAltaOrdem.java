package AltaOrdem;

public class FuncAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a,b) -> a+b;
        Calculo SUB = (a,b) -> a-b;
        Calculo DIV = (a,b) -> a/b;
        Calculo MULT = (a,b) -> a*b;

        System.out.println(Operacao(SOMA, 1,  2));
        System.out.println(Operacao(SUB, 1,  2));
        System.out.println(Operacao(DIV, 1,  2));
        System.out.println(Operacao(MULT, 1,  2));
    }

    public static int Operacao(Calculo calc, int a, int b) {
        return calc.somar(a,b);
    }

    @FunctionalInterface
    interface Calculo {
        public int somar(int a,int b);
    }
}
