package reproduzirAparelho;

/**
 * Classe criada para servir de base para aparelhos
 * @author Igor Dias da Silva
 * @since Classe criada em 04/06
 */
public class Aparelho implements IAparelho {
    String marca;
    boolean ligado;
    
    public Aparelho(String marca, boolean ligado){
        this.marca = marca;
        this.ligado = ligado;
    }
    
    @Override
    public void ligar(){
        System.out.println("Aparelho ligado...");
    }
    
    @Override
    public void desligar(){
        ligado = false;
        System.out.println("Aparelho desligado..");
    }
    
    @Override
    public void pausar(){
        System.out.println("Aparelho pausado...");
    }
}
