package Atividade12c;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base maior de um trapézio");
        int maior = sc.nextInt();
        System.out.println("Digite a base menor de um trapézio:");
        int menor = sc.nextInt();
        System.out.println("Digite a altura de um trapézio:");
        int altura = sc.nextInt();
        int area = (maior + menor)*altura/2;
        System.out.println("A área do trapézio é:" +area);
    }
}
