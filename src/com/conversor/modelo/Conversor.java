package com.conversor.modelo;

import javax.swing.*;

public abstract class Conversor {

    public void validarValorNumerico(String cantidad){

        if(!cantidad.matches("^\\d+(\\.\\d+)?$")){
            JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }
}
