import java.util.Scanner;

public class ConversoApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int input = 0;

        while (input != 9){
            Conversor1.mostrarMenu();
            input = entrada.nextInt();

            switch (input) {
                case 1:
                    Conversor1.conversion("cm", "metros", 0.01, entrada);
                    break;
                case 2:
                    Conversor1.conversion("metros", "cm", 100, entrada );
                    break;
                case 9:
                    System.out.println("Que pena! Saliendo del programa ....");
                    break;
                default:
                    System.out.println("Elija una opcion válida!");
                    break;

            }
            System.out.println();
        }
        entrada.close();


    }
}
