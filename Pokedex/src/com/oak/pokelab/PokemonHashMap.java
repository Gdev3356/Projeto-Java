package com.oak.pokelab;

import javax.swing.*;
import java.util.HashMap;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemon = new HashMap<>();
        HashMap<Integer, Integer> pokemonLevel = new HashMap<>();
        HashMap<Integer, Integer> pokemonStats = new HashMap<>();
        do {
            try {
                String nome, tipo;
                Integer nivel, dano, defesa;
                do {
                    nome = JOptionPane.showInputDialog("Digite o nome de um Pokémon para ser registrado ou digite \"FIM\" para encerrar.").toUpperCase();
                    if (!nome.equals("FIM")) {
                        if (pokemon.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null,"Este Pokémon já foi registrado!", "Pokémon já registrado!", JOptionPane.WARNING_MESSAGE);
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite o tipo do Pokémon informado anteriormente.");
                            pokemon.put(nome, tipo);
                        }
                    }
                }while (!nome.equals("FIM"));

                String escolha = JOptionPane.showInputDialog(("Digite o nome de um Pokémon registrado!").toUpperCase());
                if (pokemon.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "Pokémon de tipo: " + pokemon.get(escolha), "Registro da Pokédex", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pokémon não registrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
