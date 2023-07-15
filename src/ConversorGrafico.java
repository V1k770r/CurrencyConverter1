import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorGrafico extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem opcion1;
    private JMenuItem opcion2   ;
    private JMenuItem opcion3;

    public ConversorGrafico(){
        setSize(600,400);
        setTitle("Conversor ONE :)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        mostrarMenu();
        panel.add(menuBar);
        add(panel);
    }

    public void mostrarMenu(){
        // Inicializacion de los atributos
        menuBar = new JMenuBar();
        menu = new JMenu("Elija una opcion valida: ");
        opcion1 = new JMenuItem("Centimetros para metros");
        opcion2 = new JMenuItem("Metros para centimetros");
        opcion3 = new JMenuItem("Salir");

        menu.add(opcion1);
        menu.add(opcion2);
        menu.add(opcion3);

        menuBar.add(menu);

        opcion3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Que pena! Saliendo del programa");
                System.exit(0);
            }
        });

        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }



    public static void main(String[] args) {
        ConversorGrafico ventana = new ConversorGrafico();
        ventana.setVisible(true);


    }

}
