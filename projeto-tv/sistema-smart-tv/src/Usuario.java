public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarcanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println();

        smartTv.ligar();
        System.out.println("Teve ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Teve ligada? " + smartTv.ligada);

    }
}
