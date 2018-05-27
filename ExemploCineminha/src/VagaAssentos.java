
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Airam
 */
public class VagaAssentos {

    VagaAssentosAdm cadastroAss = new VagaAssentosAdm();

    public void comprarAssentosParaFilme() {

        int precoIngresso = 0;
        int qtdIngressos = 0;
        try{
        qtdIngressos = Integer.parseInt(JOptionPane.showInputDialog(
                "Quantos ingressos você quer?\nLimite de compra: 6").trim());
            while(qtdIngressos > 6){
                JOptionPane.showMessageDialog(null, "Limite de ingressos atingido"
                        + "\nA regra da empresa só permite a compra de 6 Ingressos por vez");
                qtdIngressos = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite a quantidade de ingressos que deseja novamente",
                        qtdIngressos != 0 ? qtdIngressos : ""));
            }
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Informação inválida ou não inserida!");
        }
        
        for (int i = 0; i < qtdIngressos; i++) {
            int tipoIngresso = JOptionPane.showOptionDialog(null,
                    "Tabela de preços"
                    + "\nMeia entrada - R$10,00"
                    + "\nEntrada inteira - R$20,00",
                    "Meia ou Inteira?",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Meia", "Inteira"
                    },
                    "Meia");
            if (tipoIngresso == 0) {
                precoIngresso += 10;
            }
            if (tipoIngresso == 1){
                precoIngresso += 20;
            }
        }

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
        JOptionPane.showMessageDialog(null, "O preço do ingresso é: R$"+precoIngresso);
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
