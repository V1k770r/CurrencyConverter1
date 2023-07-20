import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeMoneda {

    String cantidad;

    //Metodos de Validacion
    public String validarDinero(String cantidad){
        if(!cantidad.matches("\\d+$")){
            JOptionPane.showMessageDialog(null,"Ingresar solo valores numéricos");
        }
        return null;
    }

    //Metodos de Conversion
    public String SolesAdolares (BigDecimal cantidad){
        return "\n" + cantidad + " Soles en dolares son: " +
                cantidad.divide(new BigDecimal("3.64"), 2, RoundingMode.UP) + " $";
    }

    public String SolesAEuros (BigDecimal cantidad){
        return "\n" + cantidad + " Soles en euros son: " +
                cantidad.divide(new BigDecimal("4.1"), 2, RoundingMode.UP) + " Є";
    }

    public String SolesALibrasSterlinas (BigDecimal cantidad){
        return "\n" + cantidad + " Soles en Libras Esterlinas son: "
                + cantidad.divide(new BigDecimal("4.69"), 2, RoundingMode.UP) + " £";
    }

    public String SolesAYenJapones (BigDecimal cantidad){
        return "\n" + cantidad + " Soles en Yen Japones son: "
                + cantidad.divide(new BigDecimal("0.026"), 2, RoundingMode.UP) + " ¥";
    }

    public String SolesAWonSulKoreano (BigDecimal cantidad){
        return "\n" + cantidad + " Soles en Won Sul-Coreano son: "
                + cantidad.divide(new BigDecimal("0.028"), 2, RoundingMode.UP) + " ₩";
    }

    public String DolaresASoles (BigDecimal cantidad){
        return "\n" + cantidad + " $ en Soles son "
                + cantidad.multiply(new BigDecimal("3.63"));
    }

    public String EurosASoles (BigDecimal cantidad){
        return "\n" + cantidad + " Є en Soles son "
                + cantidad.multiply(new BigDecimal("3.99"));
    }

    public String LibrasEsterlinasASoles (BigDecimal cantidad){
        return "\n" + cantidad + " £ en Soles son "
                + cantidad.multiply(new BigDecimal("4.69"));
    }

    public String YenJaponesASoles (BigDecimal cantidad){
        return "\n" + cantidad + " ¥ en Soles son "
                + cantidad.multiply(new BigDecimal("0.026"));
    }

    public String WonSulCoreanoASoles (BigDecimal cantidad){
        return "\n" + cantidad + " ₩ en Soles son "
                + cantidad.multiply(new BigDecimal("0.028"));
    }

}
