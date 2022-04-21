package com.test.bank;

import javax.swing.JOptionPane;

public class GuiApp {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "请使用\"" + System.getProperty("java.home") + System.getProperty("file.separator") + "java.exe\" -jar \"" + System.getProperty("java.class.path") + "\" 进行运行", "启动提示", JOptionPane.INFORMATION_MESSAGE);
    }
}
