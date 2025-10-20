package Atividade12c;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do depósito:");
        double deposito = sc.nextDouble();
        System.out.println("Digite o valor da taxa de juros mensal:");
        double taxa = sc.nextDouble();
        double resultado = deposito * (taxa/100);
        System.out.println("O rendimento total será:" + resultado);
    }
}
