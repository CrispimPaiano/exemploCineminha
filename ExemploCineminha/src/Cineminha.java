
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira
 */
public class Cineminha {

    public void menuLogin() {

        menuADM LoginAdm = new menuADM();
        menuFuncionario LoginFunc = new menuFuncionario();

        int menu = JOptionPane.showOptionDialog(
                null,
                "Selecione a opção", //messagem de texto
                "MENU GERAL", //título
                0, //opcao sim
                JOptionPane.PLAIN_MESSAGE, //icone 
                null,
                new Object[]{ //botões
                    "Administrativo", "Funcionário", "Sair"},
                ""
        );
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
            menu = JOptionPane.showOptionDialog(
                    null,
                    "Selecione a opção", //messagem de texto
                    "MENU GERAL", //título
                    0, //opcao sim
                    JOptionPane.PLAIN_MESSAGE, //icone 
                    null,
                    new Object[]{ //botões
                        "Administrativo", "Funcionário", "Sair"},
                    ""
            );
        }
    }
}
