
import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class Filme {

    String[] nomesFilme = new String[100];
    int[] faixaEtaria = new int[100];
    int[] horaFilme = new int[100];
    String[] generoFilme = new String[100];
    String[] diretorFilme = new String[100];
    int[] lancamentoFilme = new int[100];
    int[] tempoCartazFilme = new int[100];
    int atual = 0, anoFilmeAntigo = Integer.MAX_VALUE, anoFilmeNovo = Integer.MIN_VALUE;
    String filmeAntigo = "", filmeNovo = "";

    private void informaçãoFilme(int posicao) {
        try {
            nomesFilme[posicao] = JOptionPane.showInputDialog("Digite o nome do filme", nomesFilme[posicao] != null ? nomesFilme[posicao] : "");

            while (nomesFilme[posicao].trim().equals("")
                    || nomesFilme[posicao].trim().length() < 4) {
                JOptionPane.showMessageDialog(null,
                        "O nome do filme deve conter no mínimo 4 caracteres");
                nomesFilme[posicao] = JOptionPane.showInputDialog(
                        "Digite o nome do filme novamente",
                        nomesFilme[posicao] != null ? nomesFilme[posicao] : "");

            }

            faixaEtaria[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomesFilme[posicao] + ": digite a faixa etária \"Ex.: 18\""));
            horaFilme[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomesFilme[posicao] + ": digite o tempo de duração"));
            generoFilme[posicao] = JOptionPane.showInputDialog(null,"Selecione o tipo de gênero do filme","Genêro",JOptionPane.PLAIN_MESSAGE,null,
                    new Object[]{"Ação","Aventura","Romance","Comédia","Terror","Suspense","Outros"},"").toString();
            diretorFilme[posicao] = JOptionPane.showInputDialog("Digite o nome do Diretor");
            lancamentoFilme[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento"));
            tempoCartazFilme[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em cartaz. \"Duração\""));
            estatisticaFilmes(lancamentoFilme[posicao], nomesFilme[posicao]);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Informação inválida ou não inserida!");
        }
    }

    public void cadastrarFilme() {
        informaçãoFilme(atual);
        atual++;
    }

    public void listarFilme() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomesFilme[i] + "  " + lancamentoFilme[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome do filme para editar");
        if (atual > 0) {
        for (int i = 0; i < atual; i++) {
            if (nomesFilme[i].equals(busca)) {
                informaçãoFilme(i);
                return;
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma empresa cadastrada!");
        }
    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        if (atual > 0) {
            for (int i = 0; i < atual; i++) {
                if (nomesFilme[i].contains(busca)) {
                    apresentarInformacao(i);
                }

            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma empresa cadastrada!");
        }
    }

    public void contabilizarPeloNomeFilme() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        int quantidadeRegistros = 0;
        for (int i = 0; i < atual; i++) {
            if (nomesFilme[i].contains(busca)) {
                quantidadeRegistros++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de " + busca + " é: " + quantidadeRegistros);
    }

    public void buscarPeloLancamento() {
        int anoLacamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento para busca"));
        for (int i = 0; i < atual; i++) {
            if (lancamentoFilme[i] == anoLacamento) {
                apresentarInformacao(i);
                return;
            }
            JOptionPane.showMessageDialog(null, "Ano de lançamento não encontrado");
        }
    }

    public void apresentarInformacao(int i) {
        JOptionPane.showMessageDialog(null,
                "Nome filme: " + nomesFilme[i]
                + "\nFaixa etária: " + faixaEtaria[i]
                + "\nDuração do filme: " + horaFilme[i]
                + "\nGênero: " + generoFilme[i]
                + "\nNome Diretor: " + diretorFilme[i]
                + "\nAno lançamento: " + lancamentoFilme[i]
                + "\nDuração em cartaz: " + tempoCartazFilme[i]);

    }

    public void estatisticaFilmes(int ano, String nome) {
        if (ano < anoFilmeAntigo) {
            anoFilmeAntigo = ano;
            filmeAntigo = nome;
        }
        if (ano > anoFilmeNovo) {
            anoFilmeNovo = ano;
            filmeNovo = nome;
        }
    }

    public void apresentarEstatisticas() {
        JOptionPane.showMessageDialog(null,
                "Quantidades de filmes: " + atual
                + "\nFilme mais antigo: " + filmeAntigo + " ano: " + anoFilmeAntigo
                + "\nFilme mais novo: " + filmeNovo + " ano: " + anoFilmeNovo
        );
    }

}
