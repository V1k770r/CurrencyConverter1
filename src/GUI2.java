import javax.swing.*;
import java.awt.*;



public class GUI2 {
    public static void main(String[] args) {



        JFrame miJFrame = new JFrame("Ejemplo - Aprendiendo Java Swing XD!!!");
        miJFrame.setSize(500,300);

        // componente JPanel`

        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);
        miJPanel.setLayout(new GridBagLayout());


        JLabel miJLabel = new JLabel();
        miJLabel.setText("Dime tu opinión acerca de Java Swing:  ");

        JTextArea miJTextArea = new JTextArea(5,20);




        miJFrame.add(miJPanel);
        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);

        miJFrame.setVisible(true);
    }

}
