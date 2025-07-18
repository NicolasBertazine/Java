import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
        ==== TIPOS PRIMITIVOS ====

        numeros inteiros: 100, 21254, 41556, 2, 5
        byte => 8 bits = -128 a 127
        short => 16 bits = -32.768 a 32.767
        int => 32 bits = -2.147.483.648 a 2.147.483.647
        long => 64 bits = -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        numeros decimais = 1.2, 3.4, 5.6, 7.8, 9.0
         5.50
        float => 32 bits = precisão simples
        double => 64 bits = precisão dupla

        String => representar palavras e frases ""
        char => representar um unico caractere = a, b, c, d, ''

        boolean => true ou false

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Nícolas";
        boolean bool = false;

*/

/*      ==== VETORES E ARRAYS ====

        //                         0, 1, 2, 3, 4, 5
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5, 3333333};
        int[] meusNumeros= new int[5];

        String[] nomesArr = new String[10];

        nomesArr[0] = "Nicra";
        nomesArr[1] = "Terra";
        nomesArr[2] = "Borsa";
        nomesArr[7] = "Bolinha";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Nicra");
        nomes.add("Terra");
        nomes.add("Borsa");
        nomes.add("Bolinha");

        System.out.println(nomes.get(0));

        nomes.remove(0);
        nomes.remove("Terra");

        System.out.println(nomes.get(0));


        ==== LOOPS ====

        for (int meuIterador = 0; meuIterador < nomesArr.length; meuIterador++) {
            System.out.println(nomesArr[meuIterador]);
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }
 */
//      ==== CASTINGS ENTRE NÚMEROS ====
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

//      ==== CASTINGS ENTRE PALAVRAS E NÚMEROS ====
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);
    }
}