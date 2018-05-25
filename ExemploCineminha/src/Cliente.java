
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Airam Vieira
 */
public class Cliente {

    String[] nomes = new String[100];
    int[] idades = new int[100];
    String[] temasPref = new String[100];
    String[] comesBebesPref = new String[100];
    int atual = 0;
    VagaAssentos comprarAssentos = new VagaAssentos();

    public void infoCliente() {

        nomes[atual] = JOptionPane.showInputDialog("Qual seu nome?");
        idades[atual] = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        temasPref[atual] = JOptionPane.showInputDialog("Seu gênero de filme preferido");
        comesBebesPref[atual] = JOptionPane.showInputDialog("Qual sua combinação preferida "
                + "de comes e bebes?");

        comprarAssentos.comprarAssentosParaFilme();
    }
}
