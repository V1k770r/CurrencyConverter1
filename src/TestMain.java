public class TestMain {
    public static void main(String[] args) {

        int edad = 20;
        int edad2 = 15;
        int edad3 = 67;

        int [] edades = new int[5];
        edades [2] = 30;

        //System.out.println(edades[2]);
        //System.out.println(edades[0]);

       // System.out.println(edades[5]);

        int tamañoArray = edades.length;
        System.out.println(tamañoArray);


        for (int i = 0; i < tamañoArray; i++) {
            System.out.println(edades[i]);
        }



    }

}
