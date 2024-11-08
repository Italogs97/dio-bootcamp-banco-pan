public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;


    public void aumentarCanal (){
        canal ++;
        System.out.println("Aumentando o Canal para " + canal);
    }

    public void diminiurCanal (){
        canal --;
        System.out.println("Diminuindo o Canal para " + canal);
    }

    public void definirCanal (int novoCanal){

        canal = novoCanal;
        System.out.println("Definir Canal para " + canal);

    }


    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuir o volume para " + volume);
    }




    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


}