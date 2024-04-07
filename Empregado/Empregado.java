/*
Crie uma classe em Java chamada Empregado que inclui três partes de informações 
como variáveis de instância – nome (String), sobrenome (String) e um salário mensal (double). 
A classe deve ter um construtor, métodos get e set para cada variável de instância. 
Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o 
salário anula de cada objeto. Então dê a cada Empregado um aumento de 10% e exiba novamente o 
salário anual de cada Empregado. 
 */

public class Empregado {
    String nome;
    String sobrenome;
    double salarioMensal;
    double salarioAnual;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.salarioAnual = salarioMensal * 12;
    }

    public void exibirEmpregado() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Salário: " + salarioMensal);
        System.out.println("Salário Anual: " + salarioAnual);
    }

    public double reajustarSalarioAnual() {
        salarioAnual = salarioAnual * 1.1;
        System.out.println("Reajuste de salário: " + salarioAnual);
        return salarioAnual;
    }
}