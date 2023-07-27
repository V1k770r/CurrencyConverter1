import javax.swing.*;

public class Conversor {

    //valida cantidad ingresada

    public String validarValorNumerico(String cantidad){

        if(!cantidad.matches("^\\d+(\\.\\d+)?$")){
            JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        return "Procede";
    }





}
