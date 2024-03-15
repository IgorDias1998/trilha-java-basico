package exercises01;

import java.util.Scanner;

public class exercise_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD, soma;
		
        System.out.println("Digite um numero inteiro");
		A = sc.nextInt();
        System.out.println("Digite outro número inteiro para multiplicar");
		B = sc.nextInt();

		PROD = A * B;
        soma = A + B;  

		System.out.println("PROD = " + PROD);
        System.out.println("Soma = " + soma);
	}
}