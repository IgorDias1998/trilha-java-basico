package reproduzirAparelho;

/**
 * Classe criada para criar um aparelho que utilize a Interface e o príncipio de herança de aparelho
 * @author Igor Dias da Silva
 * @since Classe criada em 04/06
 */
public class multimidea extends Aparelho{
    
    @Override
    public void ligar() {
        System.out.println("Reproduzindo vídeo...");
    }

    @Override
    public void pausar() {
        System.out.println("Vídeo pausado.");
    }

    @Override
    public void desligar() {
        System.out.println("Vídeo desligado.");
    }
    
    public multimidea(String marca, boolean ligado) {
        super(marca, ligado);
    }
}
