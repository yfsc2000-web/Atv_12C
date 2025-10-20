package Atividade12c;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra:");
        double valorCompra = sc.nextDouble();
        double resultado = valorCompra/3;
        System.out.println("O valor a ser pago nas três parcelas será:" +resultado);
    }
}
