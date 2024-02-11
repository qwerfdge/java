package ua.brekher.DataProvider;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Actions Example");


        JPanel panel = new JPanel();

        JButton button = new JButton("Click me!");


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Button clicked!");
            }
        });


        panel.add(button);


        frame.add(panel);


        frame.setSize(300, 200);


        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

