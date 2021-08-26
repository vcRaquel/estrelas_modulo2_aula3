package br.com.zup;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os seguintes valores para seus respectivos diascorrespondentes:");
        System.out.println("1 - Para Segunda");
        System.out.println("2 - Para Terça");
        System.out.println("3 - Para Quarta");
        System.out.println("4 - Para Quinta");
        System.out.println("5 - Para Sexta");
        System.out.println("6 - Para Sábado");
        System.out.println("7 - Para Domingo");
        System.out.println("Digite o valor desejado: ");
        double diaDesejado = leitor.nextDouble();

        if (diaDesejado == 1){
            System.out.println("O dia desejado foi a Segunda");
        }
        else if (diaDesejado == 2){
            System.out.println("O dia desejado foi a Terça");
        }
        else if (diaDesejado == 3){
            System.out.println("O dia desejado foi a Quarta");
        }
        else if (diaDesejado == 4){
            System.out.println("O dia desejado foi a Quinta");
        }
        else if (diaDesejado == 5){
            System.out.println("O dia desejado foi a Sexta");
        }
        else if (diaDesejado == 6){
            System.out.println("O dia desejado foi a Sábado");
        }
        else if (diaDesejado == 7){
            System.out.println("O dia desejado foi a Domingo");
        }
        else{
            System.out.println("Digite uma opção válida");
        }
    }
}
