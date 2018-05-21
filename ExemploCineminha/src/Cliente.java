
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class Cliente {

    String[] nomes = new String[100];
    int[] idades = new int[100];
    String[] temasPref = new String[100];
    String[] comesBebesPref = new String[100];

    public void infoCliente(int i) {

        nomes[i] = JOptionPane.showInputDialog("Qual seu nome?");
        idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        temasPref[i] = JOptionPane.showInputDialog("Seu gênero de filme preferido");
        comesBebesPref[i] = JOptionPane.showInputDialog("Qual sua combinação preferida                                                        de comes e bebes?");
    }
}
