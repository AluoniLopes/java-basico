package edu.aluoni.basicjava.estrutura_condicionais;

public class SistemaMedidas {

    public static void main(String[] args) {
        char sigla = 'M';
        switch (sigla) {
            case 'P':
                System.out.println("Pequeno");
                break;
            case 'M':
                System.out.println("Medio");
                break;
            case 'G':
                System.out.println("Grande");
                break;
            default:
                System.out.println("Nao especificado");
                break;
        }
    }
}