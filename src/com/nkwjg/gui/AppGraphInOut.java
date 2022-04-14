package com.nkwjg.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppGraphInOut {
    public static void main(String[] args) {
        new AppFrame();
    }
}


class AppFrame extends JFrame {
    JTextField input = new JTextField(10);
    JButton exec_button = new JButton("求平方");
    JLabel show = new JLabel("点击左边的按钮求结果");

    public AppFrame() {
        setTitle("求平方小程序");
        setSize(400, 100);
        setLayout(new FlowLayout());
        getContentPane().add(input);
        getContentPane().add(exec_button);
        getContentPane().add(show);
        exec_button.addActionListener(new ExecNumber());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    class ExecNumber implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = input.getText();
            try {
                double d = Double.parseDouble(s);
                double sq = d * d;
                int i = (int) sq;
                if (i == sq) {
                    show.setText("" + i);
                }
                else {
                    show.setText("" + sq);
                }
            } catch (Exception a) {
                show.setText("输入错误");
            }
            
        }

    }
}
