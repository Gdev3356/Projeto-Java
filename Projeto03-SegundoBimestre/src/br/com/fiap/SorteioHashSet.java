package br.com.fiap;

import javax.swing.*;
import java.util.*;

public class SorteioHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();
        do {
            while (numerosSorteados.size() < 6) {
                int numero = random.nextInt(1, 61);
                numerosSorteados.add(numero);
            }
            ArrayList<Integer> resultadoDoSorteio = new ArrayList<>(numerosSorteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null, "Números Sorteio da Loterina do Tigrinho\n" + resultadoDoSorteio, "Mega Tigre", JOptionPane.WARNING_MESSAGE);
            numerosSorteados.clear();
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
