import javax.swing.*;

public class Conversor {

    public void validarValorNumerico(String cantidad){

        if(!cantidad.matches("^\\d+(\\.\\d+)?$")){
            JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        }

    }

}
