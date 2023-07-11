public class TestConversorDeMoneda {
    public static void main(String[] args) {

        ConversorDeMoneda A = new ConversorDeMoneda();
        A.Convierte("Dolares", 100);
        A.Convierte("Libras Esterlinas", 100);
        A.Convierte("Euros", 100);
        A.Convierte("Yen Japones", 100);
        A.Convierte("Won Sul-coreano", 100);
        System.out.println();
        System.out.println();
        A.Desconvierte("Dolares", 30);
        A.Desconvierte("Libras Esterlinas", 30);
        A.Desconvierte("Euros", 30);
        A.Desconvierte("Yen Japones", 30);
        A.Desconvierte("Won Sul-coreano", 30);
        }
}
