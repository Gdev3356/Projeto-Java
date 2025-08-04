package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainHeroi {
    public static void main(String[] args) {
        SuperHeroi Heroi;
        String nome;
        String idSecreta;
        String[] poderes;
        String[] fraquezas;
        int qtde;
        int qtde2;
        do {
            try{
                nome = JOptionPane.showInputDialog("Digite o nome do Super-Heroí");
                idSecreta = JOptionPane.showInputDialog("Digite a identidade secreta do Super-Heroí");
                qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Poderes"));
                qtde2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Fraquezas"));
                poderes = new String[qtde];
                for (int i = 0; i < poderes.length; i++) {
                    poderes[i]= JOptionPane.showInputDialog(String.format("Super Poder %d", (i + 1)));
                }
                fraquezas = new String[qtde2];
                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i]= JOptionPane.showInputDialog(String.format("Fraqueza %d", (i + 1)));
                }

                Heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                Heroi.listarHeroi();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);

    }
}

