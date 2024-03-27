package Veiculo;

public class CaminhaoBau extends Caminhao{
    int volume;
    boolean rastreado;
    boolean portaLateral;
    String tipoBau;
    
    public CaminhaoBau(String marca, String modelo, int ano, boolean refrigerado, int eixos, float tara, int volume, boolean ratreado, boolean portaLateral, String tipoBau) {
        super(marca, modelo, ano, refrigerado, eixos, tara);
        this.volume = volume;
        this.rastreado = rastreado;
        this.portaLateral = portaLateral;
        this.tipoBau = tipoBau;
    }
    
    public void exibirDadosCaminhaoBau() {
        super.exibirDadosCaminhao();
        System.out.println("Volume: " + volume);
        System.out.println("Rastreado? " + (rastreado ? "Sim" : "Não"));
        System.out.println("Tem porta lateral? " + (portaLateral ? "Sim" : "Não"));
        System.out.println("Tipo do Baú: " + tipoBau);
    }
}
