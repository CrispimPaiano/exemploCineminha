import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class TelaFuncionario {

    Funcionario registroFuncionario = new Funcionario();

    public void menuFuncionario() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Funcionário"
                + "\n2 - Editar Funcionário"
                + "\n3 - Buscar pelo nome"
                + "\n4 - Buscar pelo CPF"
                + "\n5 - Listar Funcionário"
                + "\n6 - Numerar quantidades Funcionário"
                + "\n7 - Voltar para menu Admin"
        ));

        while (menu != 7) {
            switch (menu) {
                case 1:
                    registroFuncionario.cadastrarFuncionario();
                    break;
                case 2:
                    registroFuncionario.editarFuncionario();
                    break;
                case 3:
                    registroFuncionario.buscarPeloNome();
                    break;
                case 4:
                    registroFuncionario.buscarPeloCPF();
                    break;
                case 5:
                    registroFuncionario.listarFuncionario();
                    break;
                case 6:
                    registroFuncionario.contabilizarPeloNomeFuncionario();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar Funcionário"
                    + "\n2 - Editar Funcionário"
                    + "\n3 - Buscar pelo nome"
                    + "\n4 - Buscar pelo CPF"
                    + "\n5 - Listar Funcionário"
                    + "\n6 - Numerar quantidades Funcionário"
                    + "\n7 - Sair"
            ));
        }
    }
}