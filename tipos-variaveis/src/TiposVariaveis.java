public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        //casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto + 1;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto2);

        //variaveis VS constantes
        int numero = 1;
        numero = 2;
        int numeros = numero + numeroCurto;
        final double VALOR_DE_PI = 3.14;
        System.out.println(numeros);
        System.out.println(VALOR_DE_PI);

    }
}
