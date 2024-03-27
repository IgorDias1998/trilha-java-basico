package Veiculo;

public class Caminhao extends Veiculo {
    boolean refrigerado;
    int eixos;
    float tara;
    
    public Caminhao(String marca, String modelo, int ano, boolean refrigerado, int eixos, float tara) {
        super(marca, modelo, ano);
        this.refrigerado = refrigerado;
        this.eixos = eixos;
        this.tara = tara;
    }
    
    public void exibirDadosCaminhao() {
        super.exibirDadosVeiculo();
        System.out.println("Refrigerado: " + (refrigerado ? "Refrigerado": "Não refrigerado"));
        System.out.println("Nº eixos: " + eixos);
        System.out.println("Tara: " + tara);
    }
}
