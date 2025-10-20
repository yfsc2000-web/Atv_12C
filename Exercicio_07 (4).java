package Atividade12c;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos quilômetros o carro percorreu:");
        double quilometros = sc.nextDouble();
        System.out.println("Digite o valor de litros percorridos:");
        double litros = sc.nextDouble();
        double resultado = quilometros/litros;
        System.out.println("O consumo médio será de:" + resultado);
    }
}
