import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeTemperatura extends Conversor {

    //Metodos de Conversion
    public String CelciusAFahrenheit (BigDecimal cantidad){
        return "\n" + cantidad + " Grados Celcius a Fahrenheit es: "
                + cantidad.multiply(new BigDecimal("1.8")).add(new BigDecimal("32")) ;
    }

    public String CelciusAKelvin (BigDecimal cantidad){
        return "\n" + cantidad + " Grados Celcius a Kelvin es: " +
                cantidad.add(new BigDecimal("273.15"));
    }

    public String FahrenheitACelcius (BigDecimal cantidad){
        return "\n" + cantidad + " Grados Fahrenheit a Celcious es: " +
                cantidad.add(new BigDecimal("273.15")).divide(new BigDecimal("1.8"),2,RoundingMode.UP);
    }

    public String FahrenheitAKelvin (BigDecimal cantidad){
        return "\n" + cantidad + " Grados Fahrenheit a Kelvin es: " +
                ((cantidad.multiply(new BigDecimal(32)).subtract(new BigDecimal(32))).multiply(new BigDecimal(5/9))).add(new BigDecimal("273.15"));
    }

    public String KelvinAFahrenheit (BigDecimal cantidad){
        return "\n" + cantidad + " Grados kelvin a Fahrenheit es: " +
                ((cantidad.subtract(new BigDecimal("273.15"))).multiply(new BigDecimal(9/5))).add(new BigDecimal(32));
    }

    public String KelvinACelsious (BigDecimal cantidad){
        return "\n" + cantidad + "Grados kelvin a Celcious es: " +
                    cantidad.subtract(new BigDecimal("273.15"));
    }

}
