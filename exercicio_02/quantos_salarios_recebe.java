package exercicio_02;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
 */

public class quantos_salarios_recebe {
    public void main(String [] args){
        double salario;
        double salario_minimo = 788;
        double salarios_recebidos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        salario = sc.nextInt();
        salarios_recebidos = salario / salario_minimo;
        System.out.println("Você recebe: " + salarios_recebidos + "salários");
    }
}
