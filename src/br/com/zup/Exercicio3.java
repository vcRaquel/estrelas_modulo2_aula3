package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        if(nota1 >0 & nota1 <=10){
            System.out.println("Primeira nota registrada com sucesso");
        }
        else{
            System.out.println("Por favor digite uma nota válida");
        }
        System.out.println("Por favor digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        if(nota2 >0 & nota2 <=10){
            System.out.println("Segunda nota registrada com sucesso");
        }
        else{
            System.out.println("Por favor digite uma nota válida");
        }

        double media = ((nota1 + nota2) /2);

        if(media >= 7 & media < 10){
            System.out.println("Aprovado");
        }
        else if(media > 0 & media < 7){
            System.out.println("Reprovado");
        }
        else if(media == 10){
            System.out.println("Aprovado com distinção");
        }else {
            System.out.println("Digite uma nota válida");
        }

    }
}
