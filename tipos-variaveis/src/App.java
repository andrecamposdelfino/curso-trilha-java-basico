public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("Tv ligada : " + smartTv.ligada + " No canal " + smartTv.canal);

        smartTv.mudarCanal(20);
        System.out.println("Mudando para o canal : " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Aumentado o volume :" + smartTv.volume);

        Calculadora calculadora = new Calculadora();
        
        int soma = calculadora.somar(1, 1);
        System.out.println(soma);

       
    }
}
