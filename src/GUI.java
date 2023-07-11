import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {


        Object[] sistemasDeConversion = { "Conversor de Moneda", "Conversor de Temperatura" };

        Object seleccionDeSistema = JOptionPane.showInputDialog(null,
                "Seleccione una opcionde conversion", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                sistemasDeConversion, sistemasDeConversion[0]);

        String sistema = seleccionDeSistema.toString();
        System.out.println(sistema);




        int value = 2;
        String moneda = "Yen";

        switch(moneda) {
            case "Dolares":
                System.out.println("En Dolares es: " + value*3.63 + "$");
                break;
            case "Euros":
                System.out.println("En Euros es: " + value*3.99 + "Є");
                break;
            case "Libras":
                System.out.println("En Libras Esterlinas es: " + value*4.69 + "£");
                break;
            case "Yen":
                System.out.println("En Yen Japones es: " + value*0.026 + "¥");
                break;
            case "Won":
                System.out.println("En Won sul-coreano es: " + value*0.028 + "₩");
            default:
                System.out.println("Ingrese una opcion correcta");
        }






















    }
}
