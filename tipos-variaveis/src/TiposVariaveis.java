public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        //casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //variaveis VS constantes
        int numero = 1;
        numero = 2;
        final double VALOR_DE_PI = 3.14;
        System.out.println(numero);
        System.out.println(VALOR_DE_PI);

    }
}
