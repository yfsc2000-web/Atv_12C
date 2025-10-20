package Atividade12c;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();
        int media = (n1*3) + (n2*2)/2;
        System.out.println("A média ponderada será:" + media);
    }
}
