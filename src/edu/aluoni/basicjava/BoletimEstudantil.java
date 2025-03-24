package edu.aluoni.basicjava;

public class BoletimEstudantil {
    public static int mediaFinal(int[] args){
        int somaNotas=0;
        int totalNotas = args.length;
        
        for(int i=0; i<totalNotas; i++){
            System.out.println(args[i]);
            somaNotas+=args[i];
        }
        int mediaFinal = somaNotas / totalNotas;
        return mediaFinal;
    }
    
    public static String resultado(int mediaFinal) {
        
        if(mediaFinal<6){
            return ("reprovado");
        }else if(mediaFinal==6){
            return ("Prova minerva");
        }else{
            return ("Aprovado");
        }
    }

    public static void main(String[] args) {
        int[] notas ={10};
        
        int mediaFinal = mediaFinal(notas);
        String resultado = resultado(mediaFinal);

        System.out.println("Média final: " + mediaFinal);
        System.out.println("Resultado: " + resultado);
    }
}
