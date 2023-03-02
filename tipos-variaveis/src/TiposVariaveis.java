public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // problema encontrado pela IDE
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal;

        /*
         * o 'numeroNormal', por mais que agora seja 1,
         * em algum momento pode se tornar superior aos 32 mil
         * que o tipo short comporta, por isso a linguagem não permite.
         * 
         * adaptação sugerida pela IDE
         */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // utilizado o recurso casting

        /*
         * Exemplo de variáveis
         * 
         * int numero = 5;
         * numero = 10;
         * 
         * System.out.println(numero);
         */

        // Exemplo de constantes

        final int NUMERO = 5;
        final int NUMERO2 = 10;

        System.out.println(NUMERO + " " + NUMERO2);
    }
}