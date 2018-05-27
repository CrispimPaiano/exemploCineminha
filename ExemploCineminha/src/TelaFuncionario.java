
import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class TelaFuncionario {

    Funcionario registroFuncionario = new Funcionario();

    public void menuFuncionario() {

        int menu = JOptionPane.showOptionDialog(
                null,
                "Selecione o menu desejado", //messagem de texto
                "MENU FUNCIONÁRIO", //título
                0, //opcao sim
                JOptionPane.PLAIN_MESSAGE, //icone 
                null,
                new Object[]{ //botões
                    "Cadastrar Funcionário", "Editar Funcionário", "Buscar por nome", "Buscar por CPF", "Listar Funcionário", "Quantidades Funcionário", "Voltar para menu Admin"//Opções
                },
                ""
        );
        /*int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Funcionário"
                + "\n2 - Editar Funcionário"
                + "\n3 - Buscar pelo nome"
                + "\n4 - Buscar pelo CPF"
                + "\n5 - Listar Funcionário"
                + "\n6 - Numerar quantidades Funcionário"
                + "\n7 - Voltar para menu Admin"
        ));*/

        while (menu != 6) {
            switch (menu) {
                case 0:
                    registroFuncionario.cadastrarFuncionario();
                    break;
                case 1:
                    registroFuncionario.editarFuncionario();
                    break;
                case 2:
                    registroFuncionario.buscarPeloNome();
                    break;
                case 3:
                    registroFuncionario.buscarPeloCPF();
                    break;
                case 4:
                    registroFuncionario.listarFuncionario();
                    break;
                case 5:
                    registroFuncionario.contabilizarPeloNomeFuncionario();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menu = JOptionPane.showOptionDialog(
                null,
                "Selecione o menu desejado", //messagem de texto
                "MENU FUNCIONÁRIO", //título
                0, //opcao sim
                JOptionPane.PLAIN_MESSAGE, //icone 
                null,
                new Object[]{ //botões
                    "Cadastrar Funcionário", "\nEditar Funcionário", "\nBuscar pelo nome", "Buscar pelo CPF", "Listar Funcionário", "Numerar quantidades Funcionário", "Voltar para menu Admin"//Opções
                },
                ""
        );
        }
    }
}
