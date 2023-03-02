public class Operadores {

    public static void main(String[] args) {
       /*
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        */

        String concatenacao = "?";
        
        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        /*Testes de concatenação.
         * Ao tentar concatenar valores de texto e numéricos, ele realizou as primeiras somas antes das strings,
         * mas ao se deparar com a string, não pôde seguir somando e concatenou os demais valores. A partir do
         * momento onde ele encontra um caractere, ele deixa de realizar a soma.
         */
    }

}
