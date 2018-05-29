
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Airam Vieira
 */
public class ComesEBebes {

    public void infoPedido() {
        int qtdComes = 0;
        int qtdBebes = 0;
        Double precoComida = 0.0;
        Double precoBebida = 0.0;
        Double precoTotal = 0.0;
        int tabelaComplemento = 0;
        int qtdComplementos = 0;
        int tabelaPedido = JOptionPane.showOptionDialog(null,
                "Comes ou Bebes?", "Vendas",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Comes", "Bebes", "Completar Venda"
                },
                "Comes");
        while (tabelaPedido != 2) {

            if (tabelaPedido == 0) {
                int tabelaComidas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Que petisquinhos deseja?"
                        + "\n1 - Pipoca P - R$20,00"
                        + "\n2 - Pipoca M - R$25,00"
                        + "\n3 - Pipoca G - R$30,00"
                        + "\n4 - Bibs - R$7,00"
                        + "\n5 - Chocolate - R$3,00"
                        + "\n6 - Balinha Fini - R$6,00"
                        + "\n7 - Sair"));

                if (tabelaComidas == 1) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas pipocas pequenas quer comprar?"));
                    precoComida += 20.00 * qtdComes;
                    int opcao = JOptionPane.showOptionDialog(null,
                            "Deseja algum complemento?", "Complementos",
                            0,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{
                                "Sim", "Não"
                            },
                            "Sim");
                    if (opcao == 0) {
                        tabelaComplemento = Integer.parseInt(JOptionPane.showInputDialog(
                                "Que sabor de calda você deseja?"
                                + "\n1 - Caramelo - R$5,00"
                                + "\n2 - Chocolate preto - R$3,00"
                                + "\n3 - Chocolate branco - R$4,00"
                                + "\n4 - Calda especial da casa - R$8,00"
                                + "\n5 - Sair"));
                        if (tabelaComplemento == 1) {
                            qtdComplementos = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Em quantas pipocas  deseja esse complemento?"));
                            if (qtdComplementos > qtdComes) {
                                JOptionPane.showMessageDialog(null,
                                        "Você tem menos pipocas do que complementos");
                            } else if (qtdComplementos == qtdComes) {
                                precoComida += 5.00 * qtdComplementos;
                            } else {
                                precoComida += 5.00;
                            }
                        } else if (tabelaComplemento == 2) {
                            qtdComplementos = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Em quantas pipocas  deseja esse complemento?"));
                            if (qtdComplementos > qtdComes) {
                                JOptionPane.showMessageDialog(null,
                                        "Você tem menos pipocas do que complementos");
                            } else if (qtdComplementos == qtdComes) {
                                precoComida += 3.00 * qtdComplementos;
                            } else {
                                precoComida += 3.00;
                            }
                        } else if (tabelaComplemento == 3) {
                            qtdComplementos = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Em quantas pipocas  deseja esse complemento?"));
                            if (qtdComplementos > qtdComes) {
                                JOptionPane.showMessageDialog(null,
                                        "Você tem menos pipocas do que complementos");
                            } else if (qtdComplementos == qtdComes) {
                                precoComida += 4.00 * qtdComplementos;
                            } else {
                                precoComida += 4.00;
                            }
                        } else if (tabelaComplemento == 4) {
                            qtdComplementos = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Em quantas pipocas  deseja esse complemento?"));
                            if (qtdComplementos > qtdComes) {
                                JOptionPane.showMessageDialog(null,
                                        "Você tem menos pipocas do que complementos");
                            } else if (qtdComplementos == qtdComes) {
                                precoComida += 8.00 * qtdComplementos;
                            } else {
                                precoComida += 8.00;
                            }
                        } else {
                        }
                    } else {
                    }
                } else if (tabelaComidas == 2) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas pipocas médias quer comprar?"));
                    precoComida += 30.00 * qtdComes;
                    int opcao = JOptionPane.showOptionDialog(null,
                            "Deseja algum complemento?", "Complementos",
                            0,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{
                                "Sim", "Não"
                            },
                            "Sim");
                    if (opcao == 0) {
                        tabelaComplemento = Integer.parseInt(JOptionPane.showInputDialog(
                                "Que sabor de calda você deseja?"
                                + "\n1 - Caramelo - R$5,00"
                                + "\n2 - Chocolate preto - R$3,00"
                                + "\n3 - Chocolate branco - R$4,00"
                                + "\n4 - Calda especial da casa - R$8,00"
                                + "\n5 - Sair"));

                        if (tabelaComplemento == 1) {
                            precoComida += 5.00;
                        } else if (tabelaComplemento == 2) {
                            precoComida += 3.00;
                        } else if (tabelaComplemento == 3) {
                            precoComida += 4.00;
                        } else if (tabelaComplemento == 4) {
                            precoComida += 8.00;
                        } else {

                        }
                    } else {
                    }
                } else if (tabelaComidas == 3) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas pipocas grandes quer comprar?"));
                    precoComida += 30.00 * qtdComes;
                    int opcao = JOptionPane.showOptionDialog(null,
                            "Deseja algum complemento?", "Complementos",
                            0,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{
                                "Sim", "Não"
                            },
                            "Sim");
                    if (opcao == 0) {
                        tabelaComplemento = Integer.parseInt(JOptionPane.showInputDialog(
                                "Que sabor de calda você deseja?"
                                + "\n1 - Caramelo - R$5,00"
                                + "\n2 - Chocolate preto - R$3,00"
                                + "\n3 - Chocolate branco - R$4,00"
                                + "\n4 - Calda especial da casa - R$8,00"
                                + "\n5 - Sair"));

                        if (tabelaComplemento == 1) {
                            precoComida += 5.00;
                        } else if (tabelaComplemento == 2) {
                            precoComida += 3.00;
                        } else if (tabelaComplemento == 3) {
                            precoComida += 4.00;
                        } else if (tabelaComplemento == 4) {
                            precoComida += 8.00;
                        } else {

                        }
                    } else {
                    }
                } else if (tabelaComidas == 4) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos bibs quer comprar?"));
                    precoComida += 7.00 * qtdComes;
                } else if (tabelaComidas == 5) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos chocolates quer comprar?"));
                    precoComida += 3.00 * qtdComes;
                } else if (tabelaComidas == 6) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas balinhas fini quer comprar?"));
                    precoComida += 6.00 * qtdComes;
                } else if (tabelaComidas > 7) {
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            } else if (tabelaPedido == 1) {
                int tabelaBebidas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Que petisquinhos deseja?"
                        + "\n1 - Refrigerante P - R$7,99"
                        + "\n2 - Refrigerante M - R$9,99"
                        + "\n3 - Refrigerante G - R$11,99"
                        + "\n4 - Água c/ gás - R$4,00"
                        + "\n5 - Água s/ gás - R$3,50"
                        + "\n6 - Suquinho - R$6,00"
                        + "\n7 - Sair"));

                if (tabelaBebidas == 1) {
                    qtdBebes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos refrigerante pequenas quer comprar?"));
                    precoBebida += 7.99 * qtdBebes;
                } else if (tabelaBebidas == 2) {
                    qtdBebes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos refrigerante médias quer comprar?"));
                    precoBebida += 9.99 * qtdBebes;
                } else if (tabelaBebidas == 3) {
                    qtdBebes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos refrigerante grandes quer comprar?"));
                    precoBebida += 11.99 * qtdBebes;
                } else if (tabelaBebidas == 4) {
                    qtdBebes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas Água c/ gás quer comprar?"));
                    precoBebida += 4.00 * qtdBebes;
                } else if (tabelaBebidas == 5) {
                    qtdBebes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas Água s/ gás quer comprar?"));
                    precoBebida += 3.50 * qtdBebes;
                } else if (tabelaBebidas == 6) {
                    qtdBebes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos suquinhos quer comprar?"));
                    precoBebida += 6.00 * qtdBebes;
                } else if (tabelaBebidas > 7) {
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            } else if (tabelaPedido == 2) {
                JOptionPane.showMessageDialog(null, "Obrigado pela preferência");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            tabelaPedido = JOptionPane.showOptionDialog(null,
                "Algo mais?", "Vendas",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Comes", "Bebes", "Completar Venda"
                },
                "Comes");
            precoTotal = precoComida + precoBebida;
        }
        if (precoTotal == 0) {
            JOptionPane.showMessageDialog(null, "Um filme sem comes e bebes é um filme vazio");
        } else {
            JOptionPane.showMessageDialog(null, "O valor total é de: " + precoTotal + "\nBom filme");
        }
    }
}
