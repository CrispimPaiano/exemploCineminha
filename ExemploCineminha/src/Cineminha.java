
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira
 */
public class Cineminha {

    public void menuLogin() {

        menuADM LoginAdm = new menuADM();
        menuFuncionario LoginFunc = new menuFuncionario();
<<<<<<< HEAD
        
        int menu = JOptionPane.showOptionDialog(null,
                "Logue como Admin ou Funcionário", "Login",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Administrador", "Funcionário", "Sair"
                },
                "Sair");
=======

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
>>>>>>> f97f206685cd0638d800c43d05a6bd8114fee6a4
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
<<<<<<< HEAD
            menu = JOptionPane.showOptionDialog(null,
                "Logue como Admin ou Funcionário", "Login",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Administrador", "Funcionário", "Sair"
                },
                "Sair");
=======
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
>>>>>>> f97f206685cd0638d800c43d05a6bd8114fee6a4
        }
    }
}
