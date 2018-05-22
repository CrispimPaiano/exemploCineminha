
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Airam Vieira
 */
public class ComesEBebes {

    public void infoPedido(int i) {

        int tabelaPedido = Integer.parseInt(JOptionPane.showInputDialog(
                "O que deseja comprar?"
                + "\n1 - Comidas"
                + "\n2 - Bebidas"
                + "\n3 - Nada"));
        int qtdComes = 0;
        Double[] precoComida = new Double[100];
        Double[] precoBebida = new Double[100];
        Double[] precoComplemento = new Double[100];
        Double precoTotal = 0.0;
        int tabelaComplemento = 0;
        while (tabelaPedido != 3) {

            if (tabelaPedido == 1) {
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
                    precoComida[i] += 20.00 * qtdComes;
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
                            precoComplemento[i] += 5.00;
                        } else if (tabelaComplemento == 2) {
                            precoComplemento[i] += 3.00;
                        } else if (tabelaComplemento == 3) {
                            precoComplemento[i] += 4.00;
                        } else if (tabelaComplemento == 4) {
                            precoComplemento[i] += 8.00;
                        } else {

                        }
                    } else {
                    }
                } else if (tabelaComidas == 2) {
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
                            precoComplemento[i] += 5.00;
                        } else if (tabelaComplemento == 2) {
                            precoComplemento[i] += 3.00;
                        } else if (tabelaComplemento == 3) {
                            precoComplemento[i] += 4.00;
                        } else if (tabelaComplemento == 4) {
                            precoComplemento[i] += 8.00;
                        } else {

                        }
                    } else {
                    }
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas pipocas medias quer comprar?"));
                    precoComida[i] += 25.00 * qtdComes;
                } else if (tabelaComidas == 3) {
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
                            precoComplemento[i] += 5.00;
                        } else if (tabelaComplemento == 2) {
                            precoComplemento[i] += 3.00;
                        } else if (tabelaComplemento == 3) {
                            precoComplemento[i] += 4.00;
                        } else if (tabelaComplemento == 4) {
                            precoComplemento[i] += 8.00;
                        } else {

                        }
                    } else {
                    }
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas pipocas grande quer comprar?"));
                    precoComida[i] += 30.00 * qtdComes;
                } else if (tabelaComidas == 4) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos bibs quer comprar?"));
                    precoComida[i] += 7.00 * qtdComes;
                } else if (tabelaComidas == 5) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos chocolates quer comprar?"));
                    precoComida[i] += 3.00 * qtdComes;
                } else if (tabelaComidas == 6) {
                    qtdComes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas balinhas fini quer comprar?"));
                    precoComida[i] += 6.00 * qtdComes;
                } else {
                }
            } else if (tabelaPedido == 2) {
                int tabelaBebidas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Que petisquinhos deseja?"
                        + "\n1 - Bebida P - R$7,99"
                        + "\n2 - Beboda M - R$9,99"
                        + "\n3 - Bebida G - R$11,99"
                        + "\n4 - Água c/ gás - R$4,00"
                        + "\n5 - Água s/ gás - R$3,50"
                        + "\n6 - Suquinho - R$6,00"
                        + "\n7 - Sair"));

                if (tabelaBebidas == 1) {
                    precoBebida[i] += 7.99;
                } else if (tabelaBebidas == 2) {
                    precoBebida[i] += 9.99;
                } else if (tabelaBebidas == 3) {
                    precoBebida[i] += 11.99;
                } else if (tabelaBebidas == 4) {
                    precoBebida[i] += 4.00;
                } else if (tabelaBebidas == 5) {
                    precoBebida[i] += 3.50;
                } else if (tabelaBebidas == 6) {
                    precoBebida[i] += 6.00;
                } else {

                }
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            tabelaPedido = Integer.parseInt(JOptionPane.showInputDialog(
                    "Deseja algo a mais??"
                    + "\n1 - Comidas"
                    + "\n2 - Bebidas"
                    + "\n3 - Nada"));
            precoTotal = precoComida[i] + precoBebida[i];
            JOptionPane.showInputDialog("O valor total é de: " + precoTotal);
        }
    }
}