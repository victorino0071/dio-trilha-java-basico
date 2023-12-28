public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv televisao = new SmartTv();

        System.out.println("TV Ligada? " + televisao.ligada);
        System.out.println("Canal Atual: " + televisao.canal);
        System.out.println("Volume atual: " + televisao.volume);
        
        televisao.ligar();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        televisao.subirCanal();
        televisao.subirCanal();
        

        System.out.println("Novo status - televisao ligada? " + televisao.ligada);
        System.out.println("Novo status - volume televisao? " + televisao.volume);
        System.out.println("Novo status - canal televisao? " + televisao.canal);
        
        televisao.mudarCanal(89);
        System.out.println("Novissimo status - canal televisao? " + televisao.canal);
    }   
}
