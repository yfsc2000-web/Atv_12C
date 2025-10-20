package Atividade12c;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        int quadrado = sc.nextInt();
        int area = quadrado * quadrado;
        System.out.println("A area do quadrado é:" + quadrado);
        int perimetro = quadrado*4;
        System.out.println("O perimetro do quadrado é:" +perimetro);
    }
}
