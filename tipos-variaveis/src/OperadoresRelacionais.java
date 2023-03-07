public class OperadoresRelacionais {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 != numero2;

        System.out.println("Número 1 é diferente do número 2? " + "Resposta: " + simNao);

    }
}

// Com o "==" também conseguimos verificar conteúdos, mas para comparar
// objetos/strings, é recomendado utilizar o método 'equals' ao invés de "=="