package Veiculo;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    
    //MÈTODO Construtor do objeto em memória
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    //Método comum para exibir os dados de um veículo
    public void exibirDadosVeiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}