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







    }
}
