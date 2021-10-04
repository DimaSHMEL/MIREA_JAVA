package lab_5_6;

import javax.swing.*;

public class ImgOutput extends JFrame {
    private int width = 1000;
    private int height;
    ImgOutput(String path)
    {
        ImageIcon img = new ImageIcon(path);
        height = img.getIconHeight();
        width = img.getIconWidth();
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        JLabel picLabel = new JLabel(img);
        add(picLabel);
        setVisible(true);

    }
}
