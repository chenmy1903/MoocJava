package com.nkwjg.ifswitch;

public class GradeLevel {
    public static void main(String[] args) {
        char grade = 'C';
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
}
