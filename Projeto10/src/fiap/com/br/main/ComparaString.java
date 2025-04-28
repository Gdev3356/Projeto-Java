package fiap.com.br.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua senha");
        if (senha.equals("P4ssw0rD")){
        JOptionPane.showMessageDialog(null, "Acesso Garantido");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        }
    }
}
