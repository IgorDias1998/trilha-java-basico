package ContaBancaria;

public class CadastroConta {
    public static void main(String[] args) {
        ContaBancaria contaIgor;
        
        contaIgor = new ContaBancaria();
        contaIgor.criarConta("Igor", "Dias", 500.50);

        contaIgor.depositarValor(200);
        contaIgor.sacarValor(100);
        
    }
}
