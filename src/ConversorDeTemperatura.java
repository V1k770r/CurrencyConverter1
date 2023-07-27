import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeTemperatura {

    public String validarTemperatura(String cantidad){

        if(!cantidad.matches("^\\d+(\\.\\d+)?$")){
            JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        return null;
    }


    //Metodos de Conversion
    public String CelciusAFarengeir (BigDecimal cantidad){
        return "\n" + cantidad + " °C a Farenheir : "
                + cantidad.multiply(new BigDecimal("1.8")).add(new BigDecimal(32)) ;
    }


    public String CelciusAKelvin (BigDecimal cantidad){
        return "\n" + cantidad + " °C a Kelvin : " +
                cantidad.add(new BigDecimal(273.15));
    }

    public String FarengeirACelcius (BigDecimal cantidad){
        return "\n" + cantidad + " °F a Celcious : " +
                cantidad.add(new BigDecimal(273.15)).divide(new BigDecimal(1.8),2,RoundingMode.UP);
    }

    public String FarengeirAKelvin (BigDecimal cantidad){
        return "\n" + cantidad + " °F a Kelvin : " +
                ((cantidad.multiply(new BigDecimal(32)).subtract(new BigDecimal(32))).multiply(new BigDecimal(5/9))).add(new BigDecimal(273.15));
    }

    public String KelvinAForengir (BigDecimal cantidad){
        return "\n" + cantidad + " k a Farengeir : " +
                ((cantidad.subtract(new BigDecimal(273.15))).multiply(new BigDecimal(9/5))).add(new BigDecimal(32));
    }

    public String KelvinACelsious (BigDecimal cantidad){
        return "\n" + cantidad + " k a Celcious : " +
                    cantidad.subtract(new BigDecimal(273.15));
    }

}
