public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println ("TV Ligada ? " + smartTv.ligada);
        System.out.println ("Canal Atual :" + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println ("Volume Atual :" + smartTv.volume);


        smartTv.definirCanal(13);
        smartTv.diminiurCanal();
        smartTv.diminiurCanal();
        smartTv.aumentarCanal();
        System.out.println ("Canal Atual :" + smartTv.canal);


        smartTv.ligar ();
        System.out.println("Novo Status ->  TV Ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ->  TV Ligada ?" + smartTv.ligada);

    }
}