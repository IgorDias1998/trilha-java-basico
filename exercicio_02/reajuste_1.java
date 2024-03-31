package exercicio_02;

import java.util.Scanner;

/* Informar um saldo e imprimir o saldo com reajuste de 1%.
 */

public class reajuste_1 {
    public static void main(String [] args) {
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o saldo: ");
        valor = sc.nextInt();
        System.out.println("Reajuste: " + valor * 1.01);
    }
}
