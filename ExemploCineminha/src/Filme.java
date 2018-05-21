import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class Filme {

    String[] nomesFilme = new String[100];
    int[] faixaEtaria = new int[100];
    double[] precosFilme = new double[100];
    int[] horaFilme = new int[100];
    String[] generoFilme = new String[100];
    String[] diretorFilme = new String[100];
    int[] lancamentoFilme = new int[100];
    int[] tempoCartazFilme = new int[100];
    int atual = 0;

    private void informaçãoFilme(int posicao) {
        nomesFilme[posicao] = JOptionPane.showInputDialog(null, "Digite o nome do filme");
        faixaEtaria[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomesFilme[posicao] + ": digite a faixa etária \"Ex.: 18\""));
        precosFilme[posicao] = Double.parseDouble(JOptionPane.showInputDialog(nomesFilme[posicao] + " digite o preço do ingresso"));
        horaFilme[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomesFilme[posicao] + " digite o seu CPF"));
        generoFilme[posicao] = JOptionPane.showInputDialog("Digite o gênero do filme");
        diretorFilme[posicao] = JOptionPane.showInputDialog("Digite o nome do Diretor");
        lancamentoFilme[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento"));
        tempoCartazFilme[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em cartaz"));
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
        for (int i = 0; i < atual; i++) {
            if (nomesFilme[i].equals(busca)) {
                informaçãoFilme(i);
                return;
            }
        }
    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        for (int i = 0; i < atual; i++) {
            if (nomesFilme[i].contains(busca)) {
                apresentarInformacao(i);
            }

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
                "Nome filme: " +  nomesFilme[i]
                + "\nFaixa etária: " + faixaEtaria[i]
                + "\nPreço ingresso: " + precosFilme[i]
                + "\nDuração do filme: " + horaFilme[i]
                + "\nGênero: " + generoFilme[i]
                + "\nNome Diretor: " + diretorFilme[i]
                + "\nAno lançamento: " + lancamentoFilme[i]
                + "\nDuração em cartaz: " + tempoCartazFilme[i]);
        
    }
}
