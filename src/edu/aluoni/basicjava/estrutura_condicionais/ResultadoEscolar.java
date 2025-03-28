package edu.aluoni.basicjava.estrutura_condicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 2;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);
    }
}
