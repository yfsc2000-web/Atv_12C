package Atividade12c;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();
        double peso = 72.7*altura-58;
        System.out.println("O seu peso ideal é:" +peso);
    }
}
