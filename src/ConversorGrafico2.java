import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.math.BigDecimal;

public class ConversorGrafico2 extends JFrame {

    public JMenuBar menuBar;
    public JMenu menu, menu2, menu3;
    public JMenuItem opcion1, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7, opcion8,
              opcion9, opcion10, opcion11, opcion12, opcion13, opcion14, opcion15, opcion16, opcion17;


    //creando constructor
    public ConversorGrafico2(){
        setSize(450,100);
        setTitle("CONVERSOR ORACLE - ONE");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        mostrarMenus();
        centrarVentana();

        panel.add(menuBar);
        add(panel);
    }

    private void centrarVentana(){
        //Metodo para centrar ventana
        Dimension tamañoVentana = getSize();
        Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamañoPantalla.width - tamañoVentana.width) / 2;
        int y = (tamañoPantalla.height - tamañoVentana.height) /2;
        setLocation(x,y);
    }

    public void mostrarMenus() {
        // Inicializacion de los atributos "variables de la clase"
        menuBar = new JMenuBar();
        menu = new JMenu("SELECCIONE UNA OPCION DE CONVERSION");
        menu2 = new JMenu("Conversor de Moneda");
        menu3 = new JMenu("Conversor de Temperatura");


        //menu2 = new JMenu("Alguna otra conversion?");
        opcion1 = new JMenuItem("Soles a Dolares");
        opcion2 = new JMenuItem("Soles a Euros");
        opcion3 = new JMenuItem("Soles a Libras Sterlinas");
        opcion4 = new JMenuItem("Soles a Yens Japones");
        opcion5 = new JMenuItem("Soles a Won sul koreano");
        opcion6 = new JMenuItem("Dolares a Soles");
        opcion7 = new JMenuItem("Euros a Soles");
        opcion8 = new JMenuItem("Libras Sterlinas a Soles");
        opcion9 = new JMenuItem("Yens Japones a Soles");
        opcion10 = new JMenuItem("Won sul Koreano a Soles");
        opcion11 = new JMenuItem("Salir del Conversor");
        opcion12 = new JMenuItem("Celciuos a Fahrenheit");
        opcion13 = new JMenuItem("Celciuos a Kelvin");
        opcion14 = new JMenuItem("Fahrenheit a Celciuos");
        opcion15 = new JMenuItem("Fahrenheit a Kelvin");
        opcion16 = new JMenuItem("Kelvin a Fahrenheit");
        opcion17 = new JMenuItem("Kelvin a Celcious");


        //Agregando estilos a las opciones
        Font myFont1 = new Font("Arial", Font.BOLD, 19);
        Font myFont2 = new Font("Arial", Font.ITALIC, 19);
        menu.setFont(myFont1);
        menu2.setFont(myFont1);
        menu3.setFont(myFont1);


        opcion1.setFont(myFont2);
        opcion2.setFont(myFont2);
        opcion3.setFont(myFont2);
        opcion4.setFont(myFont2);
        opcion5.setFont(myFont2);
        opcion6.setFont(myFont2);
        opcion7.setFont(myFont2);
        opcion8.setFont(myFont2);
        opcion9.setFont(myFont2);
        opcion10.setFont(myFont2);
        opcion11.setFont(myFont2);
        opcion12.setFont(myFont2);
        opcion13.setFont(myFont2);
        opcion14.setFont(myFont2);
        opcion15.setFont(myFont2);
        opcion16.setFont(myFont2);
        opcion17.setFont(myFont2);


        menu2.add(opcion1);
        menu2.add(opcion2);
        menu2.add(opcion3);
        menu2.add(opcion4);
        menu2.add(opcion5);
        menu2.add(opcion6);
        menu2.add(opcion7);
        menu2.add(opcion8);
        menu2.add(opcion9);
        menu2.add(opcion10);
        menu2.add(opcion11);

        menu3.add(opcion12);
        menu3.add(opcion13);
        menu3.add(opcion14);
        menu3.add(opcion15);
        menu3.add(opcion16);
        menu3.add(opcion17);
        menu3.add(opcion11);

        menuBar.add(menu);
        menu.add(menu2);
        menu.add(menu3);

        JMenuItem [] options = new JMenuItem[]{opcion1, opcion2, opcion3, opcion4, opcion5, opcion6,
                opcion7, opcion8, opcion9, opcion10, opcion11, opcion12, opcion13, opcion14, opcion15,
                opcion16, opcion17};


            opcion1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");
                    ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                    BigDecimal Value = new BigDecimal(inputValue);
                    String resultadoFinal = conversorDeMoneda.SolesAdolares (Value);

                    JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                    if (JOptionPane.OK_OPTION != confirmado){
                        System.exit(0);
                    }

                }
            });


        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.SolesAEuros (Value);

                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.SolesALibrasSterlinas (Value);

                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.SolesAYenJapones (Value);

                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.SolesAWonSulKoreano(Value);

                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.DolaresASoles(Value);

                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.EurosASoles (Value);

                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.LibrasEsterlinasASoles(Value);

                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.YenJaponesASoles(Value);
                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
                conversorDeMoneda.validarValorNumerico(inputValue);

                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeMoneda.WonSulCoreanoASoles(Value);
                JOptionPane.showMessageDialog(null,"La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        //addActionListener es una interfaz
        opcion11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Es una lástima! Saliendo del programa");
                System.exit(0);
            }
        });


        opcion12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();
                conversorDeTemperatura.validarValorNumerico(inputValue);
                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeTemperatura.CelciusAFahrenheit(Value);
                JOptionPane.showMessageDialog(null, "La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();
                conversorDeTemperatura.validarValorNumerico(inputValue);
                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeTemperatura.CelciusAKelvin(Value);
                JOptionPane.showMessageDialog(null, "La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();
                conversorDeTemperatura.validarValorNumerico(inputValue);
                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeTemperatura.FahrenheitACelcius(Value);
                JOptionPane.showMessageDialog(null, "La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();
                conversorDeTemperatura.validarValorNumerico(inputValue);
                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeTemperatura.FahrenheitAKelvin(Value);
                JOptionPane.showMessageDialog(null, "La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();
                conversorDeTemperatura.validarValorNumerico(inputValue);
                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeTemperatura.KelvinACelsious(Value);
                JOptionPane.showMessageDialog(null, "La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

        opcion17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir:");

                ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();
                conversorDeTemperatura.validarValorNumerico(inputValue);
                BigDecimal Value = new BigDecimal(inputValue);
                String resultadoFinal = conversorDeTemperatura.KelvinAFahrenheit(Value);
                JOptionPane.showMessageDialog(null, "La conversion de " + resultadoFinal);
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

                if (JOptionPane.OK_OPTION != confirmado){
                    System.exit(0);
                }
            }
        });

    }

    public static void main(String[] args) {
        ConversorGrafico2 ventana = new ConversorGrafico2();
        ventana.setVisible(true);

    }
}
