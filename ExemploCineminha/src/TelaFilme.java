
import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class TelaFilme {

    Filme registroFilmes = new Filme();

    public void menuFilme() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Filme"
                + "\n2 - Editar Filme"
                + "\n3 - Buscar pelo Nome"
                + "\n4 - Buscar pelo Ano de Lançamento"
                + "\n5 - Listar Filmes"
                + "\n6 - Numerar quantidades de filmes"
                + "\n8001 - Sair"
        ));

        while (menu != 8001) {
            switch (menu) {
                case 1:
                    registroFilmes.cadastrarFilme();
                    break;
                case 2:
                    registroFilmes.editar();
                    break;
                case 3:
                    registroFilmes.buscarPeloNome();
                    break;
                case 4:
                    registroFilmes.buscarPeloLancamento();
                    break;
                case 5:
                    registroFilmes.listarFilme();
                    break;
                case 6:
                    registroFilmes.contabilizarPeloNomeFilme();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar Funcionário"
                    + "\n2 - Editar Funcionário"
                    + "\n3 - Buscar pelo Funcionário"
                    + "\n4 - Buscar pelo Funcionário"
                    + "\n5 - Listar Funcionário"
                    + "\n6 - Numerar quantidades Funcionário"
                    + "\n8001 - Sair"
            ));
        }
    }
}
