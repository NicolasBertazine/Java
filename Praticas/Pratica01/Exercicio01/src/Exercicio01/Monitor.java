package Exercicio01;

public class Monitor {

    String cor;
    String marca;
    String resolucao;
    int polegadas;
    boolean tela;


    void status() {
        System.out.println("A marca do monitor é " + this.marca + ".");
        System.out.println("A cor do monitor é " + this.cor + ".");
        System.out.println("A resolução do monitor é " + this.resolucao + ".");
        System.out.println("E esse monitor tem " + this.polegadas + " polegadas.");
    }

    void assistir() {
        if (this.tela == true) {
            System.out.println("A tela está ligada, é possivel assistir.");
        } else {
            System.out.println("A tela está desligada, não é possivel assistir");
        }
    }

    void ligado() {
        this.tela = true;
    }

    void desligar() {
        this.tela = false;
    }

}
