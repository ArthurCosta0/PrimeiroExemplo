public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Carro Opala = new Carro();

        Opala.ligar();

        Opala.freio = false;

        Opala.trocarmarcha();

        Opala.acelerar(20);

        Opala.trocarmarcha();

        Opala.acelerar(40);

        Opala.trocarmarcha();

        Opala.acelerar(60);

        Opala.desligar();


        Carro X6 = new Carro();

    }
}