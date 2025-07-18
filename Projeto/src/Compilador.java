import java.util.ArrayList;

public class Compilador {
    public static void main (String[] args) {
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Jetta");
        Carro meuCarro2 = new Carro("Onix");
        Carro meuCarro3 = new Carro("Virtus");

        String result = meuCarro1.acelerar();
        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
        meuCarro3.acelerar();

        System.out.println(result);
    }
}

class Carro {
    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
        return "oi";
    }

}