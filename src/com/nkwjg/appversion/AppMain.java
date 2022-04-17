package com.nkwjg.appversion;

import javax.swing.JOptionPane;

public class AppMain {
    public static String version = "1.4";
    static String msg = "";

    public static void main(String[] args) {
        msg += "网易慕课Java程序设计示例\n";
        msg += "作者: chenmy1903\n";
        msg += "GitHub: https://github.com/chenmy1903/MoocJava\n";
        msg += "程序包版本: " + version + "\n";
        msg += "启动指令: java -cp \"MoocJava.jar\" <类名>\n";
        msg += "包名见GitHub项目的README页面\n";
        JOptionPane.showMessageDialog(null, msg, "MoocJava", JOptionPane.INFORMATION_MESSAGE);
    }
}
