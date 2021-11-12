package Exercises.ex4_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {
    private Font font_1 = new Font("Times New Roman", Font.PLAIN, 14);
    private Font font_2 = new Font("Times New Roman", Font.BOLD, 30);
    private JButton milan = new JButton("AC Milan");
    private JButton madrid = new JButton("Real Madrid");
    private JLabel result =  new JLabel("Result: 0 X 0");
    private JLabel winner =  new JLabel("Winner: DRAW");
    private JLabel last_goal =  new JLabel("Last Scorer: N/A");
    private  int mi_score = 0, ma_score = 0;
    private  void set_params()
    {
        milan.setFont(font_1);
        madrid.setFont(font_1);
        result.setFont(font_2);
        winner.setFont(font_2);
        last_goal.setFont(font_2);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        winner.setHorizontalAlignment(SwingConstants.CENTER);
        last_goal.setHorizontalAlignment(SwingConstants.CENTER);
    }
    private void update_score()
    {
        result.setText("Result: " + mi_score + " X " + ma_score);
        if(mi_score > ma_score)
            winner.setText("Winner: " + milan.getText());
        else if( mi_score == ma_score)
            winner.setText("Winner: DRAW");
        else
            winner.setText("Winner: " + madrid.getText());
    }

    Score()
    {
        super("Score");
        setLayout(new BorderLayout());
        setSize(1000,500);
        add(madrid, BorderLayout.EAST);
        add(milan, BorderLayout.WEST);
        add(result, BorderLayout.CENTER);
        add(winner, BorderLayout.NORTH);
        add(last_goal, BorderLayout.SOUTH);
        set_params();
        milan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mi_score += 1;
                update_score();
                last_goal.setText(milan.getText());
            }
        });
        madrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ma_score += 1;
                update_score();
                last_goal.setText(madrid.getText());
            }
        });
        setVisible(true);
    }

}
