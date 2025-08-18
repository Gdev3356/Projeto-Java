package br.com.fiap.main;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número aqui: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número novamente: "));
        String escolha = JOptionPane.showInputDialog("Qual operação deseja realizar?\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        float adicao = (numero1 + numero2);
        float subtracao = (numero1 - numero2);
        float mutliplicacao = (numero1 * numero2);
        float divisao = (numero1 / numero2);

        switch (escolha) {
            case "1":
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + adicao);
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + subtracao);
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + mutliplicacao);
                break;
            case "4":
                if (numero1 < 1 || numero2 < 1)
                    try {
                        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + divisao);
                    }catch (ArithmeticException e){
                        JOptionPane.showMessageDialog(null,"Erro, impossível dividir por zero" + e.getMessage());
                    }
                break;
        }
    }
}
