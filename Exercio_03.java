package Atividade12c;

import java.util.Scanner;

public class Exercio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço do produto:");
        double valor = sc.nextDouble();
        double desconto = (valor * 0.15);
        System.out.println("O valor do produto com o desconto de 15% é:" +desconto);
    }
}
