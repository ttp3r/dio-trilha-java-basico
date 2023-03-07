import javax.sound.sampled.SourceDataLine;

public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições é verdadeira");
        }

        if (condicao1 && (5 > 3)) {
            System.out.println("As duas condiões são verdadeiras");
        }

        System.out.println("Fim!");
    }
}
