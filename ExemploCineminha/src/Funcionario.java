
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
    int atual = 0;

    private void informaçãoFuncionario(int posicao) {
        try {
            nomeFuncionario[posicao] = JOptionPane.showInputDialog("Digite o nome do funcionário");

            while (nomeFuncionario[posicao].trim().equals("")
                    || nomeFuncionario[posicao].trim().length() < 4) {
                JOptionPane.showMessageDialog(null,
                        "O nome do funcionário deve conter no mínimo 4 caracteres");
                nomeFuncionario[posicao] = JOptionPane.showInputDialog(
                        "Digite o nome do filme novamente",
                        nomeFuncionario[posicao] != null ? nomeFuncionario[posicao] : "");

            }

            idadeFuncionario[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomeFuncionario[posicao] + ": digite a sua idade \"Ex.: 18\""));
            cpfFuncionario[posicao] = JOptionPane.showInputDialog(nomeFuncionario[posicao] + ": digite o seu CPF").replace(".", "").replace("-", "");
            rgFuncionario[posicao] = JOptionPane.showInputDialog(nomeFuncionario[posicao] + ": digite o seu RG").replace(".", "").replace("-", "");
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
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Informação inválida ou não inserida!");
        }
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
        if (atual > 0) {
            String busca = JOptionPane.showInputDialog("Digite o nome do funcionário para editar");
            for (int i = 0; i < atual; i++) {
                if (nomeFuncionario[i].equals(busca)) {
                    informaçãoFuncionario(i);
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
        }
    }

    public void buscarPeloNome() {
        if (atual > 0) {
            String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
            for (int i = 0; i < atual; i++) {
                if (nomeFuncionario[i].contains(busca)) {
                    apresentarInformacao(i);
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
        }
    }

    public void contabilizarPeloNomeFuncionario() {
        if (atual > 0) {
            String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
            int quantidadeRegistros = 0;
            for (int i = 0; i < atual; i++) {
                if (nomeFuncionario[i].contains(busca)) {
                    quantidadeRegistros++;
                }
            }
            JOptionPane.showMessageDialog(null, "A quantidade de " + busca + " é: " + quantidadeRegistros);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
        }
    }

    public void buscarPeloCPF() {
        if (atual > 0) {
            String buscaCPF = JOptionPane.showInputDialog("Digite o ano de lançamento para busca");
            for (int i = 0; i < atual; i++) {
                if (cpfFuncionario[i].equals(buscaCPF)) {
                    apresentarInformacao(i);
                    return;
                }
                JOptionPane.showMessageDialog(null, "CPF não encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
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
