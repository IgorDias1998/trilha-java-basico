package Veiculo;

public class CaminhaoCegonha extends Caminhao {
    int capacidadeCarros;
    float altura;
    boolean segundoPiso;

    public CaminhaoCegonha(String marca, String modelo, int ano, boolean refrigerado, int eixos, float tara, int capacidadeCarros, float altura, boolean segundoPiso) {
        super(marca, modelo, ano, refrigerado, eixos, tara);
        this.capacidadeCarros = capacidadeCarros;
        this.altura = altura;
        this.segundoPiso = segundoPiso;
    }
    
    public void exibirDadosCegonha() {
        super.exibirDadosCaminhao();
        System.out.println("Capacidade: " + capacidadeCarros + " carros");
        System.out.println("Altura: " + altura);
        System.out.println("Tem segundo piso? " + (segundoPiso ? "Sim" : "Não"));
    }
}