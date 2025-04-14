package fiap.com.br.main;

import fiap.com.br.bean.Televisor;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Televisor televisor = new Televisor();
    televisor.setVolume(0);
    televisor.setVolume(19);
    Scanner scanner = new Scanner(System.in);
    String inputInt = String.valueOf(scanner.nextInt());
    televisor.setCanal(Integer.parseInt(inputInt));
    }
}
