package edu.aluoni;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        useConsole(args);
    }

    public static void useConsole(String[] args) { // args from console. see in README

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Nome Completo: " + nome + " " + sobrenome + "\nidade: " + idade + " anos" + "\naltura: "
                + altura + "cm");

    }

    public static void useScanner() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite altura");
        double altura = scanner.nextDouble();

        System.out.println("---------------------------------------");
        System.out.println("Nome Completo: " + nome + " " + sobrenome + "\nidade: " + idade + " anos" + "\naltura: "
                + altura + "cm");
    }
}