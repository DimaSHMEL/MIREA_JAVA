package Labratory.lab_6_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseCool extends JFrame {
    private int height = 1000, width = 1000;
    private JLabel Djida =  new JLabel("Джида");
    private JLabel Abha =  new JLabel("Абха");
    private JLabel Dahrane =  new JLabel("Дахране");
    private JLabel Jerico =  new JLabel("Иерехон");
    private JLabel Minas = new JLabel("Minas");
    void set_params()
    {
        Jerico.setHorizontalAlignment(SwingConstants.CENTER);
        Minas.setHorizontalAlignment(SwingConstants.CENTER);
        Abha.setHorizontalAlignment(SwingConstants.CENTER);
    }
    MouseCool()
        {
            add(Dahrane, BorderLayout.EAST);
            add(Djida, BorderLayout.WEST);
            add(Jerico, BorderLayout.CENTER);
            add(Minas, BorderLayout.NORTH);
            add(Abha, BorderLayout.SOUTH);
            Dahrane.setBorder(BorderFactory.createLineBorder(Color.black));
            Djida.setBorder(BorderFactory.createLineBorder(Color.black));
            Jerico.setBorder(BorderFactory.createLineBorder(Color.black));
            Minas.setBorder(BorderFactory.createLineBorder(Color.black));
            Abha.setBorder(BorderFactory.createLineBorder(Color.black));
            Dahrane.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");

                }
            });
            Djida.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {

                    JOptionPane.showMessageDialog(null, "Добро пожаловать в Джида");
                }
            });
            Jerico.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в Иерехон");
                }
            });
            Minas.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в Minas");
                }
            });
            Abha.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в Абха");
                }
            });
            set_params();
            setSize(width, height);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setVisible(true);

        }
}
