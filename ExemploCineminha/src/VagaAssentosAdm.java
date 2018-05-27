
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Airam
 */
public class VagaAssentosAdm {

    static String[][] assentos = null;

    static {
        int qtdAssLinha = Integer.parseInt(JOptionPane.showInputDialog("Quantos assentos existe por linha?"));
        int qtdAssColuna = Integer.parseInt(JOptionPane.showInputDialog("Quantos assentos existe por coluna?"));
        int qtdAssentos = qtdAssColuna * qtdAssLinha;
        assentos = new String[qtdAssLinha][qtdAssColuna];
        int ini = 0;
        if (ini == 0) {
            for (int i = 0; i < assentos.length; i++) {
                for (int j = 0; j < assentos[i].length; j++) {
                    assentos[i][j] = "L";
                }
            }
            ini++;
        }
    }
}
