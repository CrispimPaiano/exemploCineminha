
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
    
    public void infoPedido(){
    
        String[] pedidosComes = new String[100];
        int tabelaComidas = Integer.parseInt(JOptionPane.showInputDialog(
                "Que petisquinhos deseja?"+
                "\n1 -  - R$,00"+
                "\n2 -  - R$,00"+
                "\n3 -  - R$,00"+
                "\n4 -  - R$,00"+
                "\n5 - Sair"));
        int[] qtdComes = new int[100];
        Double[] precos = new Double[100];
        String[] nomeClientes = new String[100];
        String[] sabores = new String[100];
        Double precoTotal = 0.0;
        int tabela = Integer.parseInt(JOptionPane.showInputDialog(
                "Que sabor de calda você deseja?"+
                "\n1 - Caramelo - R$5,00"+
                "\n2 - Chocolate preto - R$3,00"+
                "\n3 - Chocolate branco - R$4,00"+
                "\n4 - Calda especial da casa - R$8,00"+
                "\n5 - Sair"));
        while(tabela != 5){
            
        }
    }
}
