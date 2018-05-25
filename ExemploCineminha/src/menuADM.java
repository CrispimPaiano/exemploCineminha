
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira e Crispim Paiano dos Santos
 */
public class menuADM {

    TelaFuncionario funcionarioMenu = new TelaFuncionario();
    TelaFilme filmeMenu = new TelaFilme();

    public void menuAdmin() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Adicionar funcionários"
                + "\n2 - Adicionar filmes"
                + "\n3 - Sair"));
        while (menu != 3) {
            switch (menu) {
                case 1:
                    funcionarioMenu.menuFuncionario();
                    break;
                case 2:
                    filmeMenu.menuFilme();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar funcionários"
                    + "\n2 - Adicionar filmes"
                    + "\n3 - Sair"));
        }
    }

}
