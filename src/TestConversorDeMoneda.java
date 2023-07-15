import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestConversorDeMoneda {
    public static void main(String[] args) {

        ConversorDeMoneda A = new ConversorDeMoneda();
        System.out.println(A.validaDinero("1000000"));
        A.Convierte("Dolares", new BigDecimal("100"));
        A.Convierte("Libras Esterlinas", new BigDecimal("100"));
        A.Convierte("Euros", new BigDecimal("100"));
        A.Convierte("Yen Japones", new BigDecimal("100"));
        A.Convierte("Won Sul-coreano", new BigDecimal("100"));
        System.out.println();
        System.out.println();
        A.Desconvierte("Dolares", new BigDecimal("30"));
        A.Desconvierte("Libras Esterlinas", new BigDecimal("30"));
        A.Desconvierte("Euros", new BigDecimal("30"));
        A.Desconvierte("Yen Japones", new BigDecimal("30"));
        A.Desconvierte("Won Sul-coreano", new BigDecimal("30"));

        }
}
