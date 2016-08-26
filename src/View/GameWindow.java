package View;

import Controller.GameController;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna on 26.08.2016.
 */
public class GameWindow extends JFrame {

    private static final int MAX_X = 10;
    private static final int MAX_Y = 10;
    JPanel jpanelLeft = new JPanel();
    JPanel jpanelRight = new JPanel();
    JButton[][] buttons = new JButton[MAX_X][MAX_Y];

    public void init() {
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("SeaBattle");
        jpanelRight.setLayout(new GridLayout(10, 10));
        jpanelLeft.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));

        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_Y; j++) {
                JButton jbutton = new JButton(".");
                buttons[i][j] = jbutton;
                jpanelRight.add(jbutton);

                final int finalI = i;
                final int finalJ = j;
                jbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textbutton = e.getActionCommand();
                        System.out.println("Button: " + textbutton + " x,y: " + finalI + ","+ finalJ);
                        GameController.doShoot(new Model.Point(finalI,finalJ), Field.Type.NONE);
                    }
                });
            }
            JButton start = new JButton("Начать игру");
            jpanelLeft.add(start);
            start.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Начинаем игру!");
                }
            });

            JButton end = new JButton("Конец игры");
            jpanelLeft.add(end);
            end.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Игра закончена!");
                }
            });

            add(jpanelRight, BorderLayout.WEST);
            add(jpanelLeft, BorderLayout.EAST);
            setVisible(true);
        }
    }

}
