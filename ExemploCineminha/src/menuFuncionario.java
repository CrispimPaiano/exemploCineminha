
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
        int menu = JOptionPane.showOptionDialog(
                null,
                "Selecione o menu desejado", //messagem de texto
                "MENU FUNCIONÁRIO", //título
                0, //opcao sim
                JOptionPane.PLAIN_MESSAGE, //icone 
                null,
                new Object[]{ //botões
                    "Venda ingresso", "Venda comes e bebes", "Sair"},
                ""
        );

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
            menu = JOptionPane.showOptionDialog(
                    null,
                    "Selecione o menu desejado", //messagem de texto
                    "MENU FUNCIONÁRIO", //título
                    0, //opcao sim
                    JOptionPane.PLAIN_MESSAGE, //icone 
                    null,
                    new Object[]{ //botões
                        "Venda ingresso", "Venda comes e bebes", "Sair"},
                    ""
            );
        }
    }

}
