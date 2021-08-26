package br.com.zup;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite o primeiro número: ");
        double numero1 = leitor.nextDouble();
        System.out.println("Por favor digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O primeiro número: " + numero1 + " é o maior número");
        }
        else if (numero1 == numero2){
            System.out.println("Os números são iguais");
        }
        else {
            System.out.println("O segundo número: " + numero2 + " é o maior número");
        }
    }
}
