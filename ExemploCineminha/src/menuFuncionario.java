
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Airam Vieira
 */
public class menuFuncionario {

    Cliente menuCliente = new Cliente();
    ComesEBebes menuComeBebe = new ComesEBebes();

    public void menuFunc() {

        //int menu = Integer.parseInt(JOptionPane.showInputDialog(
        //"Quantas pipocas pequenas quer comprar?"));
        //precoComida += 20.00 * qtdComes;
        int menu = JOptionPane.showOptionDialog(null,
                "Vender ingressos ou comes e bebes?", "Vendas",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Ingressos", "Comes e bebes", "Voltar"
                },
                "Ingressos");
        /*int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Venda ingresso"+
                "\n2 - Venda comes e bebes"+
                "\n3 - Sair"));*/

        while (menu != 2) {
            switch (menu) {
                case 0:
                    menuCliente.infoCliente();
                    break;
                case 1:
                    menuComeBebe.infoPedido();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            menu = JOptionPane.showOptionDialog(null,
                    "Vender ingressos ou comes e bebes?", "Vendas",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Ingressos", "Comes e bebes", "Voltar"
                    },
                    "Ingressos");
        }
    }
}