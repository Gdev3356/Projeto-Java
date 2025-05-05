package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Geometria geo = new Geometria();
        String auxiliar, escolha = "sim";
        int opcao;
        float lado, altura;
        double raio;
            try {
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular? \n(1) Quadrado \n(2) Retângulo \n(3) Círculo");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite valor do lado");
                        lado = Float.parseFloat(auxiliar);
                        geo.setLado(lado);
                        geo.calcularArea(lado);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite valor do lado");
                        lado = Float.parseFloat(auxiliar);
                        altura = Float.parseFloat(auxiliar);
                        geo.setLado(lado);
                        geo.setAltura(altura);
                        geo.calcularArea(lado, altura);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite valor do lado");
                        raio = Double.parseDouble(auxiliar);
                        geo.setRaio(raio);
                        geo.calcularArea(raio);
                        break;
                    default:
                        throw new Exception("Escolha incorreta");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
