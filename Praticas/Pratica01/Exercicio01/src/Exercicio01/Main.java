package Exercicio01;

public class Main {

    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        m1.cor = "Preta";
        m1.marca = "LG";
        m1.polegadas = 25;
        m1.resolucao = "Full HD";

        m1.desligar();
        m1.status();
        m1.assistir();

        Monitor m2 = new Monitor();
        m2.cor = "Branco";
        m2.marca = "Duex";
        m2.polegadas = 30;
        m2.resolucao = "4K";

        m2.ligado();
        m2.status();
        m1.assistir();
    }

}