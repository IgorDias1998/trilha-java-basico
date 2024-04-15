package Vegetais_Sobrescrita;

public class MundoFolhagens {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("Jirofleia", 2020, true);
        Flores flor = new Flores("Tulipa", 2023, true, "Vermelha", "Outono", "Sem espinho");
        Folhagem folha = new Folhagem("Pacova", 2023, true, "Peluda", "1x semana", false);
    
        arvore.exibirDados();
        flor.exibirDados();
        folha.exibirDados();
    }
}
