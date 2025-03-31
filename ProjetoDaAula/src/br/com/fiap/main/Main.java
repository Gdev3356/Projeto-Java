package br.com.fiap.main;

import br.com.fiap.bean.folhaPagamento;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        folhaPagamento pag = new folhaPagamento();
        pag.valorSalarioLiquido(44000);
        pag.salario(50000);
        pag.dependentes(3);
        pag.desconto(100);
        pag.planoDeSaude(250);
        pag.resultado =  (pag.salarioLiquido/pag.descontoINSS)  /pag.numeroDeDependentes - pag.valorPlanoDeSaude + pag.salarioLiquido;
        String yep = String.format("Valor: "+"%.2f", pag.resultado);
        System.out.println(yep);
        JOptionPane.showMessageDialog(null, yep);
    }
}
