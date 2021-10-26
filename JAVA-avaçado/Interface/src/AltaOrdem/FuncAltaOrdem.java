package AltaOrdem;

public class FuncAltaOrdem {
    public static void main(String[] args) {
        Somar soma = (a,b) -> a+b;
        System.out.println(Operacao(soma,a 1, b 2));
    }

    public static int Operacao(Soma sum, int a, int b) {
        return sum.somar(a,b);
    }

    interface Soma(){
        public int somar(int a,int b);
    }
}
