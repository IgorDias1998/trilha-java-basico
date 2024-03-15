package imc;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */

public class Pessoa {
    String nome;
    int idade;
    float altura, peso;
    
    //Metodo construtor do objeto em memória
    public Pessoa(String nome, int idade, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    //Metodo comum para mostrar os dados de uma pessoa
    public void exibirDadosPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
       
    }//Fim da classe
        
    //Metodo comum para exibir os dados em formato GUI
    public void exibirDadosPessoaGUI(){
        String msg;
        msg = "nome" + nome +
              "\nIdade: " + idade + 
              "\nAlatura: " + altura +
              "\nIMC:" + calcularIMC()+
              "\nClassificação: " + classificarIMC();
        JOptionPane.showMessageDialog(null, msg);
    }
        
    //Metodo comum para calcular o IMC de uma pessoa
    public float calcularIMC(){
        return peso/(altura*altura);
    }
    //Metodo para classificar pessoa
    public String classificarIMC(){
        float imc;
        imc = calcularIMC();
        if(imc <18.5)
            return "Abaixo do peso";
        else if (imc < 24.9)
            return "Peso ideal";
        else if (imc < 29.9)
            return "Levemente acima do peso";
        else if (imc < 34.9)
            return "Obesidade grau 1";
        else if (imc < 39.9)
            return "Obesidade grau 2";
        else
            return "Obesidade grau 3 - Morbida";
    }        
}