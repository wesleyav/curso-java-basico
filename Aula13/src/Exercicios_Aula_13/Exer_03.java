/*
 Faça um Programa que peça dois números e imprima a soma.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número (do tipo inteiro): ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número (do tipo inteiro)");
        int numero2 = scan.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos números infomados é: " + soma);
    }
}
