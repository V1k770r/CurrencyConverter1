import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorGrafico extends JFrame {
    //declarando variables, solo referencias...
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;

    //creando constructor
    public ConversorGrafico(){
        setSize(300,150);
        setTitle("Conversor ONE :)");


        setDefaultCloseOperation(EXIT_ON_CLOSE);




        JPanel panel = new JPanel();
        mostrarMenu();
        panel.add(menuBar);

        add(panel);
    }

    public void mostrarMenu(){
        // Inicializacion de los atributos "variables de la clase"
        menuBar = new JMenuBar();
        menu = new JMenu("Elija una opcion valida: ");
        opcion1 = new JMenuItem("Centimetros para metros");
        opcion2 = new JMenuItem("Metros para centimetros");
        opcion3 = new JMenuItem("Salir");



        //Agregando estilos a las opciones
        Font myFont1 = new Font("Serif", Font.BOLD, 20);
        opcion1.setFont(myFont1);
        opcion2.setFont(myFont1);
        opcion3.setFont(myFont1);



        menu.add(opcion1);
        menu.add(opcion2);
        menu.add(opcion3);

        menuBar.add(menu);

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
        ConversorGrafico ventana = new ConversorGrafico();
        ventana.setVisible(true);



    }

}
