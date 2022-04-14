package com.nkwjg.vartype;

public class TestType {
    public static boolean b = true;
    public static int x = 12, y = 8;
    public static float f = 4.5f;
    public static double d = 4.5f;
    public static char c = '\u0031';
    
    public static void main(String[] args) {
        System.out.println("boolean: " + b);
        System.out.println("int: " + x + ", " + y);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
    }
}
