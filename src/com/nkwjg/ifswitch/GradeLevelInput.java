package com.nkwjg.ifswitch;

import java.io.IOException;

public class GradeLevelInput {
    private void run() throws IOException {
        System.out.println("请输入分数等级: ");
        char grade = (char) System.in.read();
        switch (grade) {
            case 'A':
                System.out.println(grade + " 分段是85~100");
                break;
        
            case 'B':
                System.out.println(grade + " 分段是70~84");
                break;
        
            case 'C':
                System.out.println(grade + " 分段是60~69");
                break;
        
            case 'D':
                System.out.println(grade + " 分段是<60");
                break;
        
            default:
                System.out.println("输入错误");
                break;
        }
    }

    public static void main(String[] args) {
        try {
            new GradeLevelInput().run();
        } catch (IOException e) {
            System.out.println("用户退出了程序");
        }
    }
}
