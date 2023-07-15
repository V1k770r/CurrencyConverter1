import java.util.Scanner;

public class Conversor {

    public static void mostrarMenu(){

        System.out.println("=========================");
        System.out.println("Bienvenido al Conversor ONE");
        System.out.println("1 - cm -> metros");
        System.out.println("2 - metros -> cm");
        System.out.println("9 - salir");
        System.out.println("=========================");
    }


    public static void conversion(String unidOrigen, String unidDestino, double proporcion, Scanner leitor){
        System.out.println("Eligiste la opcion: " + unidOrigen + "->>" + unidDestino);
        System.out.println("Ingrese con el valor: ");
        double valor = leitor.nextDouble();
        double valroFinal = valor * proporcion;
        System.out.println("Valor final = " + valroFinal);

    }



}
