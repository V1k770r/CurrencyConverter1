public class ConversorDeMoneda {

    String tipoDeMoneda = "Dolares";
    double cantidad;

    public void Convierte(String tipoDeMoneda, double cantidad){

        switch (tipoDeMoneda) {
            case "Dolares" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad * 3.63 + " $");
            case "Euros" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad * 3.99 + " Є");
            case "Libras Esterlinas" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad * 4.69 + " £");
            case "Yen Japones" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad * 0.026 + " ¥");
            case "Won Sul-coreano" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + "son: " + cantidad * 0.028 + " ₩");
            default -> System.out.println("Ingrese una cantidad correcta");
        }
    }

    public void Desconvierte (String tipoDeMoneda, double cantidad) {

        switch (tipoDeMoneda) {
            case "Dolares" ->
                    System.out.println(cantidad + " " + tipoDeMoneda + " en Soles son: S/ " + cantidad / 3.63);
            case "Euros" -> System.out.println(cantidad + " " + tipoDeMoneda + " en Soles son: S/ " + cantidad / 3.99);
            case "Libras Esterlinas" ->
                    System.out.println(cantidad + " " + tipoDeMoneda + " en Soles son: S/ " + cantidad / 3.69);
            case "Yen Japones" ->
                    System.out.println(cantidad + " " + tipoDeMoneda + " en Soles son: S/ " + cantidad / 0.026);
            case "Won Sul-coreano" ->
                    System.out.println(cantidad + " " + tipoDeMoneda + " en Soles son: S/ " + cantidad / 0.028);
            default -> System.out.println("Ingrese una opcion correcta");
        }

    }

}
