package fiap.com.br.main;

import fiap.com.br.bean.Radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.setEstacao(189.1f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.aumentarVolume();
    }
}
