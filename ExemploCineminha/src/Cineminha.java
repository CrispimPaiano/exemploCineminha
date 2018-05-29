
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira
 */
public class Cineminha {

    public void menuLogin() {

        menuADM LoginAdm = new menuADM();
        menuFuncionario LoginFunc = new menuFuncionario();
        
        int menu = JOptionPane.showOptionDialog(null,
                "Logue como Admin ou Funcionário", "Login",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Administrador", "Funcionário", "Sair"
                },
                "Sair");
        while (menu != 2) {
            switch (menu) {
                case 0:
                    LoginAdm.menuAdmin();
                    break;
                case 1:
                    LoginFunc.menuFunc();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            menu = JOptionPane.showOptionDialog(null,
                "Logue como Admin ou Funcionário", "Login",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Administrador", "Funcionário", "Sair"
                },
                "Sair");
        }
    }
}
