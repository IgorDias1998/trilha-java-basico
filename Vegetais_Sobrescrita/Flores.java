package Vegetais_Sobrescrita;

public class Flores extends Arvore {
    private String corFloracao;
    private String estacaoFloracao;
    private String tipoPlanta;

    public Flores(String especie, int anoPlantio, boolean daFlor, String corFloracao, String estacaoFloracao, String tipoPlanta) {
        super(especie, anoPlantio, daFlor);
        this.corFloracao = corFloracao;
        this.estacaoFloracao = estacaoFloracao;
        this.tipoPlanta = tipoPlanta;
    }

    @Override
    public void exibirDados() {
        System.out.println("Especie: " + especie + " Ano de plantio: " + anoPlantio);
        System.out.println("Cor de flor: " + corFloracao + "Estacao de floracao: " + estacaoFloracao + "Tipo de planta: " + tipoPlanta);
    }
}
