public class Operadores {
    public static void main(String[] args) throws Exception {
        //Operador de atribuição -> =
        String nome = "Igor";

        //Adição (+) Subtração (-) Divisão (/) Multiplicação (*) Módulo (%)
        int adicao = 10 + 10;
        int subtracao = 10 - 5;
        int divisao = 10 / 2;
        int multiplicacao = 5 * 5;
        int modulo = 10 % 2;
        String nomeCompleto = "JAVA" + "BORA APRENDER";

        //Operador incremento (++) Decremento (--) Negação !
        int num = 5;
        num++;
        num--; //5

        //Operador ternário
        //condição ? se condição verdadeira : senão essa opção

        int a, b;
        
        a = 5;
        b = 6;
        
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //Operadores relacionais
        // (==) IGUAL (!=)DIFERENTE (<)MENOR (>)MAIOR (<=) MENOR IGUAL (>=) MAIOR IGUAL 

        int number = 1;
        int number2 = 2;

        boolean verdadeiroFalso = number == number2;
        verdadeiroFalso = number != number2;
        verdadeiroFalso = number < number2;
        verdadeiroFalso = number > number2;
        verdadeiroFalso = number >= number2;
        verdadeiroFalso = number <= number2;

        //Operadores lógicos
        //(&&) E (||)OU

        if(number > 0 && number2 > 0) {
            System.out.println("As duas condições são verdadeiras == true");
        }

        if (number < 0 || number2 > 0) {
            System.out.println("Uma das condições é verdadeira == true");
        }

    }
}

