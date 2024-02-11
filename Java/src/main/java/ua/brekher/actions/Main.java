package ua.brekher.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // Створюємо вікно
        JFrame frame = new JFrame("Actions Example");

        // Створюємо панель
        JPanel panel = new JPanel();

        // Створюємо кнопку
        JButton button = new JButton("Click me!");

        // Додаємо обробник події до кнопки
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Дія, яка виконується при кліку на кнопку
                JOptionPane.showMessageDialog(null, "Button clicked!");
            }
        });

        // Додаємо кнопку на панель
        panel.add(button);

        // Додаємо панель на вікно
        frame.add(panel);

        // Встановлюємо розмір вікна
        frame.setSize(300, 200);

        // Встановлюємо видимість вікна
        frame.setVisible(true);

        // Встановлюємо дію по закриттю вікна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

