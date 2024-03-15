package imc;

/**
 * Classe criada para instanciar objetos da classe pessoa
 * @author Igor Dias
 * @since classe criada em 15 de mar. de 2024
 */
public class Cadastro {
    public static void main(String args[]){
        
        Pessoa p1;//Cria a variavel que faz referencia ao objeto
        Pessoa p2 = new Pessoa("Ana Clara", 22, (float)1.64, (float) 50);
        p1 = new Pessoa("Igor", 25, (float)1.65, (float) 95);//Criando uma instancia de pessoa
        p1.exibirDadosPessoaGUI();
        p2.exibirDadosPessoaGUI();
        
    }//fim do main
    //Fim da classe
}
