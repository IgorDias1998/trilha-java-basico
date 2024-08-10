
import java.util.Scanner;

public class IMC {
    public void CalcularIMC()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu imc é: " + imc);
    }
}
