package br.edu.iff.teste;

import javax.swing.JOptionPane;

/**
 *
 * @author luizcanf
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1
                = JOptionPane.showInputDialog(
                        "Digite um número:");
        String n2
                = JOptionPane.showInputDialog(
                        "Digite outro número:");
        System.out.println(n1 + n2);
        System.out.println("#sqn");
        try {
            int x = Integer.parseInt(n1);
            int y = Integer.parseInt(n2);
            System.out.println(x + y);
            float z = x;
            y = (int) z;
        } catch (NumberFormatException excecao) {
            System.err.println(
                    "Erro de conversão - " +
                    excecao.getMessage());
            System.exit(1);
        }
        System.exit(0);
    }
    
}
