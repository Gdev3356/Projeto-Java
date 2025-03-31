package br.com.fiap.bean;

public class folhaPagamento {
    //atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;
    public double salarioLiquido;
    public double resultado;

    public void salario(int valorSalario){
       salarioBruto = valorSalario;
    }
    public void dependentes(int dependendo){
       numeroDeDependentes = dependendo;
    }
    public void desconto(int descontado){
       descontoINSS = descontado;
    }
    public void planoDeSaude(int planoSaude){
        valorPlanoDeSaude = planoSaude;
    }
    public void valorSalarioLiquido(int oSalarioLiquido){
        salarioLiquido = oSalarioLiquido;
    }
    public void resultado(int valorResultado){
        resultado = (salarioBruto/descontoINSS)  /numeroDeDependentes - valorPlanoDeSaude + salarioLiquido;
    }
}
