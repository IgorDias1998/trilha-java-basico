package ContaBancaria;

public class ContaBancaria {
    String nome;
    String sobrenome;
    double saldoInicial;

    public void criarConta(String nome, String sobrenome, double saldoInicial) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.saldoInicial = saldoInicial;
    }

    public void exibirConta() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Saldo inicial: " + saldoInicial);
    }

    public void depositarValor(double valor) {
        saldoInicial += valor;
    }

    public void sacarValor(double valor) {
        if (saldoInicial > valor) {
            System.out.println("Saque realizado");
            saldoInicial -= valor;
            System.out.println("Novo saldo: " + saldoInicial);
        }
        else {
            System.out.println("Saldo insuficiente. Você tem apenas R$" + saldoInicial);
        }
    }
}
