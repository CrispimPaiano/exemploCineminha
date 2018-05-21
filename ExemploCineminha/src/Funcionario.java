import javax.swing.JOptionPane;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class Funcionario {

    String[] nomeFuncionario = new String[100];
    int[] idadeFuncionario = new int[100];
    String[] cpfFuncionario = new String[100];
    String[] rgFuncionario = new String[100];
    String[] cargoFuncionario = new String[100];
    double[] valorHoraFuncionario = new double[100];
    int[] horaTrabalhadoFuncionario = new int[100];
    char[] sexoFuncionario = new char[100];
    String[] beneficiosFuncionario = new String[100];
    int atual=0;

    private void informaçãoFuncionario(int posicao) {
        nomeFuncionario[posicao] = JOptionPane.showInputDialog("Digite o nome do funcionário");
        idadeFuncionario[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomeFuncionario[posicao] + ": digite a sua idade \"Ex.: 18\""));
        cpfFuncionario[posicao] = JOptionPane.showInputDialog(nomeFuncionario[posicao] + ": digite o seu CPF").replace(".", "").replace("-", "");
        rgFuncionario[posicao] = JOptionPane.showInputDialog(nomeFuncionario[posicao] + ": digite o seu RG");
        cargoFuncionario[posicao] = JOptionPane.showInputDialog("Digite o seu cargo");
        valorHoraFuncionario[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor recebido por hora(R$)"));
        horaTrabalhadoFuncionario[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        sexoFuncionario[posicao] = JOptionPane.showInputDialog(null,
                "Selecione o sexo do funcionário",
                "Sexo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "M", "F"
                },
                ""
        ).toString().charAt(0);
        beneficiosFuncionario[posicao] = JOptionPane.showInputDialog("Digite o seus benefícios");
    }

    public void cadastrarFuncionario() {
        informaçãoFuncionario(atual);
        atual++;
    }

    public void listarFuncionario() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomeFuncionario[i] + "  CPF:" + cpfFuncionario[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void editarFuncionario() {
        String busca = JOptionPane.showInputDialog("Digite o nome do funcionário para editar");
        for (int i = 0; i < atual; i++) {
            if (nomeFuncionario[i].equals(busca)) {
                informaçãoFuncionario(i);
                return;
            }
        }
    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        for (int i = 0; i < atual; i++) {
            if (nomeFuncionario[i].contains(busca)) {
                apresentarInformacao(i);
            }

        }
    }

    public void contabilizarPeloNomeFuncionario() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        int quantidadeRegistros = 0;
        for (int i = 0; i < atual; i++) {
            if (nomeFuncionario[i].contains(busca)) {
                quantidadeRegistros++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de " + busca + " é: " + quantidadeRegistros);
    }

    public void buscarPeloCPF() {
        String buscaCPF = JOptionPane.showInputDialog("Digite o ano de lançamento para busca");
        for (int i = 0; i < atual; i++) {
            if (cpfFuncionario[i].equals(buscaCPF)) {
                apresentarInformacao(i);
                return;
            }
            JOptionPane.showMessageDialog(null, "CPF não encontrado");
        }
    }

    public void apresentarInformacao(int i) {
        JOptionPane.showMessageDialog(null,
                "Nome do funcionário: " + nomeFuncionario[i]
                + "\nIdade: " + idadeFuncionario[i]
                + "\nCPF: " + cpfFuncionario[i]
                + "\nRG: " + rgFuncionario[i]
                + "\nCargo: " + cargoFuncionario[i]
                + "\nValor recebido por hora: " + valorHoraFuncionario[i]
                + "\nHoras trabalhado: " + horaTrabalhadoFuncionario[i]
                + "\nSexo: " + sexoFuncionario[i]
                + "\nBenefícios: " + beneficiosFuncionario[i]);
    }
}
