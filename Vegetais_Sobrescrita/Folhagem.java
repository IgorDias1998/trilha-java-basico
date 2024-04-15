package Vegetais_Sobrescrita;

public class Folhagem extends Arvore {
    private String tipoFolha;
    private String tipoRega;
    private boolean ehDeSol;

    public Folhagem(String especie, int anoPlantio, boolean daFlor, String tipoFolha, String tipoRega, boolean ehDeSol) {
        super(especie, anoPlantio, daFlor);
        this.tipoFolha = tipoFolha;
        this.tipoRega = tipoRega;
        this.ehDeSol = ehDeSol;
    }

    @Override
    public void exibirDados() {
        System.out.println("Exibindo uma folhagem");
        System.out.println("Especie: " + especie + " Ano de plantio: " + anoPlantio);
        System.out.println("Tipo folhagem: " + tipoFolha + "Tipo de rega: " + tipoRega);
        System.out.println(ehDeSol ? "Deve ser cultivada no sol" : "Deve ser cultivada na sombra");

    }

}
