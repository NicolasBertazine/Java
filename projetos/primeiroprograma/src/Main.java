
public class Main {
    public static void main(String[] args) {
        // Notas
        double n1 = 7.0;
        double n2 = 6.5;

        // Media
        double media = (n1 + n2) / 2;

        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Você está Aprovado!");
        } else {
            System.out.println("Você está Reprovado!");
        }

    }
}