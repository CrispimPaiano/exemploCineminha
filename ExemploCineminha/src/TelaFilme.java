
import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class TelaFilme {

    Filme registroFilmes = new Filme();

    /*int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
-                "1 - Cadastrar Filme"
-                + "\n2 - Editar Filme"
-                + "\n3 - Buscar pelo Nome"
-                + "\n4 - Buscar pelo Ano de Lançamento"
-                + "\n5 - Listar Filmes"
-                + "\n6 - Numerar quantidades de filmes"
-                + "\n7 - Estatiticas filme"
-                + "\n8 - Voltar para menu Admin"
-        ));*/
    public void menuFilme() {
        int menu = JOptionPane.showOptionDialog(
                null,
                "Selecione o menu desejado:", //messagem de texto
                "MENU FILME", //título
                0, //opcao sim
                JOptionPane.PLAIN_MESSAGE, //icone 
                null,
                new Object[]{ //botões
                    "Cadastrar Filme", "Editar Filme", "Buscar por Nome", "Buscar por Ano de Lançamento", "Listar Filmes", "Quantidades de filmes", "Estatiticas filme", "Voltar para menu Admin"//Opções
                },
                ""
        );

        while (menu != 7) {
            switch (menu) {
                case 0:
                    registroFilmes.cadastrarFilme();
                    break;
                case 1:
                    registroFilmes.editar();
                    break;
                case 2:
                    registroFilmes.buscarPeloNome();
                    break;
                case 3:
                    registroFilmes.buscarPeloLancamento();
                    break;
                case 4:
                    registroFilmes.listarFilme();
                    break;
                case 5:
                    registroFilmes.contabilizarPeloNomeFilme();
                    break;
                case 6:
                    registroFilmes.apresentarEstatisticas();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menu = JOptionPane.showOptionDialog(
                    null,
                    "Selecione o menu desejado:", //messagem de texto
                    "MENU FILME", //título
                    0, //opcao sim
                    JOptionPane.PLAIN_MESSAGE, //icone 
                    null,
                    new Object[]{ //botões
                        "Cadastrar Filme", "Editar Filme", "Buscar pelo Nome", "Buscar pelo Ano de Lançamento", "Listar Filmes", "Numerar quantidades de filmes", "Estatiticas filme", "Voltar para menu Admin"//Opções
                    },
                    ""
            );
            /*menu = Integer.parseInt(JOptionPane.showInputDialog(null,
-                "1 - Cadastrar Filme"
-                + "\n2 - Editar Filme"
-                + "\n3 - Buscar pelo Nome"
-                + "\n4 - Buscar pelo Ano de Lançamento"
-                + "\n5 - Listar Filmes"
-                + "\n6 - Numerar quantidades de filmes"
-                + "\n7 - Estatiticas filme"
-                + "\n8 - Voltar para menu Admin"
-        ));*/
        }
    }
}
