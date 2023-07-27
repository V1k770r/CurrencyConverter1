import javax.swing.*;
import java.awt.*;

public class GUI3 {
    public static void main(String[] args) {


        JFrame frame = new JFrame();

        Object[] possibleValues = { "Converor de Moneda", "Conversor de Temperatura","otra mas"};

        Object selectedValue = JOptionPane.showInputDialog(frame,
                "Selecciona una opcion de Conversion", "Conversor Alura One",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);














    }
}
