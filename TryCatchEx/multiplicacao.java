package TryCatchEx;

import javax.swing.JOptionPane;

public class multiplicacao {
    public static void main(String[] args) {
        int multiplicacao;

        try {
            int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
            int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
            
            multiplicacao = numeroA * numeroB;

            JOptionPane.showMessageDialog(null, "Resultado da multiplicacao: " + multiplicacao);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores validos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
    }
}
