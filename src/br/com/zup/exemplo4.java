package br.com.zup;

import java.util.Scanner;

public class exemplo4 {
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

        System.out.println();
        int diadesejado = leitor.nextInt();

        switch (diadesejado){
            case 1:
                System.out.println("é domingo");
                break;
            case 2:
                System.out.println("é segunda");
                break;
            case 3:
                System.out.println("é terça");
                break;
            case 4:
                System.out.println("é quarta");
                break;
            case 5:
                System.out.println("é quinta");
                break;
            case 6:
                System.out.println("é sexta");
                break;
            case 7:
                System.out.println("é sábado");
                break;
        }
    }
}
