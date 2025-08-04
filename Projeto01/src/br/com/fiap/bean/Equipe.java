package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {
    //atributos
    private String nome;
    private String[] integrantes;

    //construtores
    public Equipe(String nome, String[] integrantes){
        this.nome = nome;
        this.integrantes = integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] Integrantes) {
        this.integrantes = integrantes;
    }
    //métodos de classe (particulates)
    public void listarEquipe(){
        String exibe = String.format("Nome da equipe: %s \n", nome);
        int cont = 1;
        for (String i : integrantes) {
            exibe += String.format("Integrante %d: %s \n", cont, i);
            cont ++;
        }
        JOptionPane.showMessageDialog(null, exibe, "Listagem da Equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
