package edu.aluoni.basicjava.estrutura_condicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 23;
        double valorSolicitado = 22;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo R$" + saldo);
        } else {
            System.out.println("Saldo insuficente");
            System.out.println("Saldo R$" + saldo);
        }
    }
}
