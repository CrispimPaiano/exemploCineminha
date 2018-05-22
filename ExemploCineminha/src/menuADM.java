
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
public class menuADM {
    
    public void menuAdmin(){
        
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Adicionar filmes"+
                "\n2 - Adicionar funcionários"+
                "\n3 - Sair"));
        while(menu != 3){
            switch (menu) {
                case 1:
                    
                    break;
                case 2:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção                                                                   inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Adicionar filmes"+
                "\n2 - Adicionar funcionários"+
                "\n3 - Sair"));
        }
    }
    
}
