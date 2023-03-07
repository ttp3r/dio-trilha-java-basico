public class SmartTv {
    boolean conectarN = true;
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Você ligou a TV, acompanhe o estado atual: ");
        System.out.println("Canal atual: " + canal);
        System.out.println("Volume atual: " + volume);
    }

    public void desligar() {
        ligada = false;

    }

    public void aumentarVolume() {
        // volume = volume +1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void trocarCanalParaBaixo(){
        canal--;
    }

    public void trocarCanalParaCima(){
        canal++;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void conectarNetflix() {
        conectarN = true;
    }
}