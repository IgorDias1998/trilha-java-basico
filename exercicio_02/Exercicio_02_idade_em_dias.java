package exercicio_02;

import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

public class Exercicio_02_idade_em_dias {
    public void main(String [] args) {
        int ano;
        int meses;
        int dias;
        int idade_em_dias;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos anos tem: ");
        ano = sc.nextInt();
        System.out.println("Digite os meses: ");
        meses = sc.nextInt();
        System.out.println("Digite os dias: ");
        dias = sc.nextInt();

        idade_em_dias = (ano * 365) + (meses * 30) + dias;
        System.out.println(idade_em_dias);
    }
}
