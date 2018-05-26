
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira e Crispim Paiano dos Santos
 */
public class menuADM {

    TelaFuncionario funcionarioMenu = new TelaFuncionario();
    TelaFilme filmeMenu = new TelaFilme();

    public void menuAdmin() {

        int menu = JOptionPane.showOptionDialog(
                null,
                "Selecione o menu desejado:", //messagem de texto
                "MENU ADM", //título
                0, //opcao sim
                JOptionPane.PLAIN_MESSAGE, //icone 
                null,
                new Object[]{ //botões
                    "Funcionários", "Filmes","Voltar Menu Principal"//Opções
                },
                ""
        );
        while (menu != 2) {
            switch (menu) {
                case 0:
                    funcionarioMenu.menuFuncionario();
                    break;
                case 1:
                    filmeMenu.menuFilme();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            menu = JOptionPane.showOptionDialog(
                null,
                "Selecione o menu desejado:", //messagem de texto
                "MENU ADM", //título
                0, //opcao sim
                JOptionPane.PLAIN_MESSAGE, //icone 
                null,
                new Object[]{ //botões
                    "Funcionários", "Filmes","Voltar Menu Principal"//Opções
                },
                ""
        );
        }
    }

}
