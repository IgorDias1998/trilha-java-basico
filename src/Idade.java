
import java.time.LocalDate;
import java.util.Scanner;

public class Idade {
    public void CalcularIdade()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();
        
        int anoAtual = LocalDate.now().getYear();
        
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade);
    }
}
