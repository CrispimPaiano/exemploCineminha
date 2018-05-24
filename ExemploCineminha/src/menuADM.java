
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira e Crispim Paiano dos Santos
 */
public class menuADM {

    TelaFuncionario funcionarioMenu = new TelaFuncionario();
    TelaFilme filmeMenu = new TelaFilme();
    VagaAssentos seila = new VagaAssentos();

    public void menuAdmin() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Adicionar funcionários"
                + "\n2 - Adicionar filmes"
                + "\n3 - ASSENTOS"));
        while (menu != 4) {
            switch (menu) {
                case 1:
                    funcionarioMenu.menuFuncionario();
                    break;
                case 2:
                    filmeMenu.menuFilme();
                    break;
                case 3:
                    seila.cadastrarAssentosParaFilme();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar funcionários"
                    + "\n2 - Adicionar filmes"
                    + "\n3 - Assentos"
                    + "\n4 - Sair"));
        }
    }

}
