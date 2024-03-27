package Veiculo;

public class Carro extends Veiculo{
    String chassi;
    float valor;
    float potencia;

    public Carro(String marca, String modelo, int ano, String chassi, float valor, float potencia) {
        super(marca, modelo, ano);
        this.chassi = chassi;
        this.valor = valor;
        this.potencia = potencia;
    }
    
    public void exibirDadosCarro() {
        super.exibirDadosVeiculo();
        System.out.println("Chassi: " + chassi);
        System.out.println("Valor : R$" + valor);
        System.out.println("Potência: " + potencia + "Hp");
    }
}