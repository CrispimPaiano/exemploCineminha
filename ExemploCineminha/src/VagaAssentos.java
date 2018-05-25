
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class VagaAssentos {

    VagaAssentosAdm cadastroAss = new VagaAssentosAdm();

    public void comprarAssentosParaFilme() {

        int qtdIngressos = Integer.parseInt(JOptionPane.showInputDialog(
                "Quantos assentos você quer?"));
        //int[] qtdAssentos = new int[100];
        int atual = 0;
        String[] posicao = new String[VagaAssentosAdm.assentos.length];

        for (int i = 0; i < qtdIngressos; i++, atual++) {

            posicao[atual] = JOptionPane.showInputDialog(null, new JTextArea(gerarApresentacaoDosAssentos() + "\nL = Livre / O = Ocupado"));
            int linhateste = ((int) posicao[atual].charAt(0)) - 65;
            int colunateste = Integer.valueOf(posicao[atual].substring(1)) - 1;
            VagaAssentosAdm.assentos[linhateste][colunateste] = "O";
            //posicao[atual] = "Linha: "+(linhateste+1)+"\nColuna: "+(colunateste+1);
            //JOptionPane.showMessageDialog(null, posicao[atual]);
            //if(posicao[atual]{
            //    texto = "O";
            //}
            //String lugar = posicao[atual].substring(0,1);
        }
        JOptionPane.showMessageDialog(null, new JTextArea(gerarApresentacaoDosAssentos() + "\nL = Livre / O = Ocupado"));
    }

    public String gerarApresentacaoDosAssentos() {
        String texto = "";
        for (int j = 1; j <= VagaAssentosAdm.assentos[0].length; j++) {
            texto += "\t" + j;
        }
        texto += "\n";
        for (int j = 0; j < VagaAssentosAdm.assentos.length; j++) {
            texto += ((char) (j + 65)) + "\t";
            for (int k = 0; k < VagaAssentosAdm.assentos[j].length; k++) {
                if (!VagaAssentosAdm.assentos[j][k].equals("L")) {
                    texto += "O\t";
                } else {
                    texto += "L\t";
                }
            }
            texto += "\n";
        }
        return texto;
    }
}
