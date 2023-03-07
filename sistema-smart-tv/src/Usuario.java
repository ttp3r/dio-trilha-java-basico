public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.trocarCanalParaCima();
        System.out.println("Trocando de canal: " + smartTv.canal);
        smartTv.trocarCanalParaCima();
        System.out.println("Trocando de canal: " + smartTv.canal);
        smartTv.trocarCanalParaBaixo();
        System.out.println("Trocando de canal: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Você mudou de canal para : " + smartTv.canal);

        smartTv.conectarNetflix();
        System.out.println("Você conectou sua TV a Netflix");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.desligar();
        System.out.println("Sua TV está desligando. TV ligada: " + smartTv.ligada);
    }
}
