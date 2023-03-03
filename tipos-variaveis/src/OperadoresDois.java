public class OperadoresDois {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(-numero);
        // Exemplo de operador unário de valor negativo.
        System.out.println(numero);
        /*
         * O operador de negação não afetou o valor da variável principal,
         * apenas fez efeito no momento da impressão.
         * Se desejar que o operador unário altere definitivamente
         * o valor da variável, é necessário negá-lo da seguinte forma:
         */

        numero = -numero;

        /*
         * Para tornar o número positivo novamente, é necessário realizar uma
         * operação aritmética, descrita a seguir:
         */
        numero = numero * -1;
    }

}
