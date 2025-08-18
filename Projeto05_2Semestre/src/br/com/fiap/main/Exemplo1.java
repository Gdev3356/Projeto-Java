package br.com.fiap.main;

public class Exemplo1 {
    public static void main(String[] args) {
        try {
            int resultado = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero é impossível");
        }
    }
}
