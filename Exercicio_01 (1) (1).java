package Atividade12c;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();
        int calculo = (idade *365);
        System.out.println("Você já viveu aproximadamente:" +calculo+ " dias");
    }
}
