public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SistemaSmarTv sistemaSmarTv = new SistemaSmarTv();
        System.out.println("A tv está ligada? " + SistemaSmarTv.ligada);

        sistemaSmarTv.ligarTv();
        System.out.println("Qual o novo status da tv? " + SistemaSmarTv.ligada);

        System.out.println("Qual o volume atual da tv? " + SistemaSmarTv.volume);
        sistemaSmarTv.diminuirVolume();
        
        
    }
}
