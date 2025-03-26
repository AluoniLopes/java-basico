package edu.aluoni.basicjava.metodos;

public class SmartTv {
    boolean ligada = false;
    int volume;
    int canal;

    public SmartTv(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public void ligar() {
        this.ligada = true;
    };

    public void desligar() {
        ligada = false;
    };

    public void setCanal(int value) {
        canal = value;
    }

    public void aumentarCanal() {
        if (canal <= 99) {
            volume++;
        }
    }

    public void abaixarCanal() {
        if (canal >= 1) {
            canal--;
        }
    }

    public void setVolume(int value) {
        volume = value;
    }

    public void aumentarVolume() {
        if (volume <= 99) {
            volume++;
        }
    }

    public void abaixarVolume() {
        if (volume >= 1) {
            volume--;
        }
    }
}