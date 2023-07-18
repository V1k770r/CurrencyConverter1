import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class ConversorGrafico2 extends JFrame {


    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;
    private JMenuItem opcion4;
    private JMenuItem opcion5;
    private JMenuItem opcion6;
    private JMenuItem opcion7;
    private JMenuItem opcion8;
    private JMenuItem opcion9;
    private JMenuItem opcion10;

    //creando constructor
    public ConversorGrafico2(){
        setSize(500,170);
        setTitle("Conversor ORACLE - ONE :)");


        setDefaultCloseOperation(EXIT_ON_CLOSE);




        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        mostrarMenu();
        panel.add(menuBar);

        add(panel);
    }

    public void mostrarMenu(){
        // Inicializacion de los atributos "variables de la clase"
        menuBar = new JMenuBar();
        menu = new JMenu("Que operacion desea realizar? ");
        opcion1 = new JMenuItem("Convertir soles en Dolares");
        opcion2 = new JMenuItem("Convertir soles en Euros");
        opcion3 = new JMenuItem("Convertir soles en Libras Sterlinas");
        opcion4 = new JMenuItem("Convertir soles en Yens Japones");
        opcion5 = new JMenuItem("Convertir soles en Won sul koreano");
        opcion6 = new JMenuItem("Convertir Dolares en Soles");
        opcion7 = new JMenuItem("Convertir Euros en Soles");
        opcion8 = new JMenuItem("Convertir Libras Sterlinas en Soles");
        opcion9 = new JMenuItem("Convertir Yens Japones en Soles");
        opcion10 = new JMenuItem("Convertir Won sul Koreano en Soles");


        //Agregando estilos a las opciones
        Font myFont1 = new Font("Serif", Font.ITALIC, 20);
        Font myFont2 = new Font("Arial", Font.BOLD, 20);
        menu.setFont(myFont2);
        opcion1.setFont(myFont1);
        opcion2.setFont(myFont1);
        opcion3.setFont(myFont1);
        opcion4.setFont(myFont1);
        opcion5.setFont(myFont1);
        opcion6.setFont(myFont1);
        opcion7.setFont(myFont1);
        opcion8.setFont(myFont1);
        opcion9.setFont(myFont1);
        opcion10.setFont(myFont1);


        menu.add(opcion1);
        menu.add(opcion2);
        menu.add(opcion3);
        menu.add(opcion4);
        menu.add(opcion5);
        menu.add(opcion6);
        menu.add(opcion7);
        menu.add(opcion8);
        menu.add(opcion9);
        menu.add(opcion10);

        menuBar.add(menu);


//        Object[] possibleValues = { "Conversor de Moneda", "Conversor de Temperatura"};
//
//        Object selectedValue = JOptionPane.showInputDialog(null,
//                "Selecciona una opcion de Conversion", "Conversor Alura One",
//                JOptionPane.INFORMATION_MESSAGE, null,
//                possibleValues, possibleValues[0]);


        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de soles que desee convertir");

                ConversorDeMoneda A = new ConversorDeMoneda();
                A.validaDinero(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                A.Convierte("Dolares",Value);

                JLabel label = new JLabel();
                label.setSize(200,300);
                label.setName("100");



                System.exit(0);
            }
        });




        //addActionListener es una interfaz
        opcion3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Que pena! Saliendo del programa");
                System.exit(0);
            }
        });

//        opcion2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

    }


    public static void main(String[] args) {
        ConversorGrafico2 ventana = new ConversorGrafico2();
        ventana.setVisible(true);



    }
}
