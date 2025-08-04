package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;

    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas){
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String[] getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void listarHeroi(){
        String exibir = String.format("Nome do Heroí: %s \n Identidade Secreta: %s \n", nome , idSecreta);

        int cont = 1;
        int cont2 = 1;
        for (String i : poderes) {
            exibir += String.format("Poder %d: %s \n", cont, i);
            cont ++;
        }
        for (String i : fraquezas) {
            exibir += String.format("Fraqueza %d: %s \n", cont2, i);
            cont2 ++;
        }
        JOptionPane.showMessageDialog(null, exibir, "Arquivos", JOptionPane.INFORMATION_MESSAGE);
    }
}
