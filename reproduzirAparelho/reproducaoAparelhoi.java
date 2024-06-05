package reproduzirAparelho;

public class reproducaoAparelhoi {
    public static void main(String[] args) {
        IAparelho multimidea = new multimidea("Sound", true);
        multimidea.ligar();
        multimidea.desligar();
        multimidea.pausar();
    }
}
