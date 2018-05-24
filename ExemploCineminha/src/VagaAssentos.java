
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

    public void cadastrarAssentosParaFilme() {

        int qtdIngressos = Integer.parseInt(JOptionPane.showInputDialog(
                "Quantos assentos você quer?"));
        int atual = 0;
        int qtdAssLinha = Integer.parseInt(JOptionPane.showInputDialog(
                "Quantos assentos existe por linha?"));
        int qtdAssColuna = Integer.parseInt(JOptionPane.showInputDialog(
                "Quantos assentos existe por coluna?"));
        int qtdAssentos = qtdAssColuna + qtdAssLinha;
        String[][] assentos = new String[qtdAssLinha][qtdAssColuna];
        String[] posicao = new String[qtdAssentos];
        String texto = "";
        int ini = 0, a=0;
        
        if (ini==0) {
            for (int i = 0; i < assentos.length; i++) {
                for (int j = 0; j < assentos[i].length; j++) {
                    assentos[i][j] = "L";
                }
            }
            ini++;
        }

        while (qtdIngressos>a) {
            texto = "";
            for (int i = 1; i <= assentos[0].length; i++) {
                texto += "\t" + i;
            }
            texto += "\n";
            for (int i = 0; i < assentos.length; i++) {
                texto += ((char) (i + 65)) + "\t";
                for (int j = 0; j < assentos[i].length; j++) {
                    if (!assentos[i][j].equals("L")) {
                        texto += "O\t";
                    } else {
                        texto += "L\t";
                    }
                }
                texto += "\n";
            }
            posicao[atual] = JOptionPane.showInputDialog(null, new JTextArea(texto + "\nL = Livre / O = Ocupado"));

            int linhateste = ((int) posicao[atual].charAt(0)) - 65;
            int colunateste = Integer.valueOf(posicao[atual].substring(1)) - 1;
            //posicao[atual] = "Linha: "+(linhateste+1)+"\nColuna: "+(colunateste+1);
            assentos[linhateste][colunateste] = "O";

            //JOptionPane.showMessageDialog(null, posicao[atual]);
            //if(posicao[atual]{
            //    texto = "O";
            //}
            //String lugar = posicao[atual].substring(0,1);
            atual++;
            a++;
        }
    }
}
