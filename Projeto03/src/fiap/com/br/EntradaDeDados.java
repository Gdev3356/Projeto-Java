package fiap.com.br;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner scan; //declaração do objeto
        try { scan = new Scanner(System.in);

           // instanciação do objeto
            System.out.println("Digite um número inteiro: ");
            num1 = scan.nextInt();

            System.out.println("Digite outro número inteiro: ");
            num2 = scan.nextInt();

            resultado = num1 + num2;

            System.out.println("Valor 1:  " + num1 + "\nValor 2: " + num2 + "\nSoma dos Valores: " + resultado);
            num1 = scan.nextInt();

        } catch (Exception e) {
                System.out.println("Formato de número incorreto");
        }
    }
}
