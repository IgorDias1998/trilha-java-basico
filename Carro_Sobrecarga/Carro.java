/*
 * Classe para demonstrar a utilização do método de sobrecarga de construtores e de métodos comuns
 * @author Igor Dias da Silva
 * @since Classe criada em 10/04/2024
 */

public class Carro {
    String marca;
    String modelo;
    int ano;
    String ignicaoEletrica;
    String ignicaoCombustao;

    //Sobrecarga de construtores
    public Carro(String marca, String modelo, int ano, String ignicaoCombustao) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ignicaoCombustao = ignicaoCombustao;
    }

    public Carro(String marca, String modelo, int ano, String ignicaoEletrica) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ignicaoEletrica = ignicaoEletrica;
    }

    //Sobrecarga de métodos comum
    public String ligarCarro() {
        return "Carro ligado pelo APP";
    }

    public String ligarCarro(int x) {
        return "Carro ligado com chave";
    }

    public String ligarCarro(String x) {
        return "Carro ligado pelo chaveiro a distância";
    }
}
