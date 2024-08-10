import java.util.Scanner;

public class Notas {
    public void CalcularMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quantidade de faltas do aluno: ");
        int faltas = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6 && faltas <= 5)
            System.out.println("Aluno aprovovado por nota e falta...");
        else if (media < 6 && faltas <= 5)
            System.out.println("Aluno reprovado por média");
        else if (media >= 6 && faltas > 5)
            System.out.println("Aluno reprovado por falta....");
        else
            System.out.println("Reprovado por nota e falta");
    }
}
