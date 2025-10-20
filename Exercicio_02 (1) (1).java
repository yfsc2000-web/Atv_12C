package Atividade12c;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas:");
        double horas = sc.nextDouble();
        double minutos = (horas * 60);
        System.out.println("A quantidade de horas convertidas é:" +minutos);
    }
}

