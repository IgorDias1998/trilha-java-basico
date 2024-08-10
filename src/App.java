public class App {
    public static void main(String[] args) throws Exception {
        //Exercício 1 e 2
        Notas notas = new Notas();
        notas.CalcularMedia();

        //Exercício 2
        IMC imc = new IMC();
        imc.CalcularIMC();

        //Exercício 3
        Idade idade = new Idade();
        idade.CalcularIdade();
    }
}
