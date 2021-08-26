package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite o valor do salário atual:");
        double salario = leitor.nextDouble();
        double salarioAtualizado = 0;
        double reajusteUsado =0;
        double reajuste1 = 0.2;
        double reajuste2 = 0.15;
        double reajuste3 = 0.1;
        double reajuste4 = 0.05;

        if(salario < 0){
            System.out.println("Digite um valor válido");
        } else {

        if(salario > 0 & salario <= 280){
            salarioAtualizado = ((salario * reajuste1) + salario);
            reajusteUsado = reajuste1;
        }
        else if(salario > 280 & salario <= 700){
            salarioAtualizado = ((salario * reajuste2) + salario);
            reajusteUsado = reajuste2;
        }
        else if(salario > 700 & salario <= 1500){
            salarioAtualizado = ((salario * reajuste3) + salario);
            reajusteUsado = reajuste3;
        }
        else if (salario > 1500){
            salarioAtualizado = ((salario * reajuste4) + salario);
            reajusteUsado = reajuste4;
        }

        System.out.println("O salário antes do reajuste era de R$" + salario);
        System.out.println("O percentual de aumento aplicado foi de: " + (reajusteUsado * 100) + "%");
        System.out.println("O valor do aumento foi de: R$" + (salarioAtualizado - salario));
        System.out.println("O valor do salário após o aumento é de: R$" + salarioAtualizado);
        }

    }
}
