package edu.aluoni.basicjava.metodos;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv(12,13);
    
        System.out.println("Is on? " + smartTv.ligada);
        System.out.println("volume: " + smartTv.volume);
        System.out.println("channel: " + smartTv.canal);
        rule();
        
        smartTv.ligar();
        System.out.println("Is on? " + smartTv.ligada);
        rule();
        
        smartTv.desligar();
        System.out.println("Is on? " + smartTv.ligada);
    }

    private static void rule() {
        System.out.println("-----------------");
    }    
}
    