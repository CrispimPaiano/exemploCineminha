
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira
 */
public class Cineminha {

    public void menuLogin() {
      
        menuADM LoginAdm = new menuADM();
        menuFuncionario LoginFunc = new menuFuncionario();
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Menu ADM"
                + "\n2 - Menu Funcionário"
                + "\n3 - Sair"));
        while (menu != 3) {
            switch (menu) {
                case 1:
                    LoginAdm.menuAdmin();
                    break;
                case 2:
                    LoginFunc.menuFunc();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção                                                                   inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Menu ADM"
                + "\n2 - Menu Funcionário"
                + "\n3 - Sair"));
        }
    }
}
