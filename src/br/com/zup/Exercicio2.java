package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite o valor do primeiro produto:");
        float produto1 = leitor.nextFloat();
        System.out.println("Por favor digite o valor do segundo produto:");
        float produto2 = leitor.nextFloat();
        System.out.println("Por favor digite o valor do terceiro produto:");
        float produto3 = leitor.nextFloat();

        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("O primeiro produto é o mais barato");
        }
        if (produto2 < produto1 & produto2 < produto3){
            System.out.println("O segundo produto é o mais barato");
        }else{
            System.out.println("O terceiro produto é o mais barato");
        }

    }
}
