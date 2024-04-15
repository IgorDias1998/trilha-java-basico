package Vegetais_Sobrescrita;

//Classe principal(PAI)
public class Arvore {
    String especie;
    int anoPlantio;
    boolean daFlor;

    //Construtor em memória da classe pai
    public Arvore(String especie, int anoPlantio, boolean daFlor) {
        this.especie = especie;
        this.anoPlantio = anoPlantio;
        this.daFlor = daFlor;
    }

    //Método para exibir os dados da classe pai
    public void exibirDados() {
        System.out.println("Especie: " + especie);
        System.out.println("Ano de Plantio: " + anoPlantio);
        System.out.println(daFlor ? "Tem floração" : "Não tem floração");
    }
    
}//fim da classe
