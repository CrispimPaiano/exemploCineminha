
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
    
    public void menuFunc(){
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Venda ingresso"+
                "\n2 - Venda comes e bebes"+
                "\n3 - Sair"));
        while(menu != 3){
            switch (menu) {
                case 1: 
                    menuCliente.infoCliente();
                    break;
                    
                case 2:
                    menuComeBebe.infoPedido();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção                                                                   inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Venda ingresso"+
                "\n2 - Venda comes e bebes "+
                "\n3 - Sair"));
        }
    }
    
}
