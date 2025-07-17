import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int opcao;
//
//        do {
//            System.out.println("=== MENU ===");
//            System.out.println("1 - Dizer Olá");
//            System.out.println("2 - Mostrar número");
//            System.out.println("0 - Sair");
//            System.out.println("Escolha uma opção: ");
//            opcao = scanner.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    System.out.println("Olá!");
//                    break;
//                case 2:
//                    System.out.println("Número: 20");
//                    break;
//                case 0:
//                    System.out.println("Saindo...");
//                    break;
//                default:
//                    System.out.println("Opção inválida.");
//            }
//        } while (opcao != 0);
//          scanner.close();

        Scanner scanner = new Scanner(System.in);

        double salario;
        double aumento;
        double diferenca;
        double salarioComReajuste;

        System.out.println("Qual o sálario: ");
        salario = scanner.nextDouble();
        System.out.println("Quantos porcento ele teve de aumento: ");
        aumento = scanner.nextDouble();

        diferenca = (aumento / 100) * salario;
        salarioComReajuste = salario + diferenca;

    System.out.println("Se o sálario era " + salario + " e teve um aumento de " + aumento +"%");
    System.out.println("Seu novo sálario será " + salarioComReajuste);
   }
}
