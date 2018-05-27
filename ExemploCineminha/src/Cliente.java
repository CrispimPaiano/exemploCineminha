
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
    int idade = 0;
    int atual = 0;
    VagaAssentos comprarAssentos = new VagaAssentos();

    public void infoCliente() {

        try {
            nomes[atual] = JOptionPane.showInputDialog("Digite o nome do usuário");

            while (nomes[atual].trim().equals("")
                    || nomes[atual].trim().length() < 4) {
                JOptionPane.showMessageDialog(null,
                        "O nome do usuário deve conter no mínimo 4 caracteres");
                nomes[atual] = JOptionPane.showInputDialog(
                        "Digite o nome do usuário novamente",
                        nomes[atual] != null ? nomes[atual] : "");

            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Informação inválida ou não inserida");

        }
        while (1 == 1) {
            try {
                int idade = Integer.parseInt(JOptionPane.showInputDialog
                ("Olá "+nomes[atual]+"igite a sua idade"));
                if(idade >= 0 && idade <= 130){
                    break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Idade invalida, digite apenas números");
            }
        }
        comprarAssentos.comprarAssentosParaFilme();
    }
}
