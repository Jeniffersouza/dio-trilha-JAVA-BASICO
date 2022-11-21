public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("VOLUME ATUAL ? " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("VOLUME ATUAL ? " + smartTv.volume);


        System.out.println("CANAL ATUAL : " + smartTv.canal);
        smartTv.mudarCanal(7);
        
        System.out.println("CANAL ATUAL : " + smartTv.canal);

        System.out.println("VOLUME ATUAL ? " + smartTv.volume);

        System.out.println("TV LIGADA? " + smartTv.ligada);
        System.out.println("CANAL ATUAL ? " + smartTv.canal);
        System.out.println("VOLUME ATUAL ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("NOVO Status -> TV LIGADA? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("NOVO Status -> TV LIGADA? " + smartTv.ligada);
    }
}
