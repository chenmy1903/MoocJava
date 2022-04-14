package com.nkwjg.input;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerTestInt {
    private void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("输入数字:");
        int a = s.nextInt();
        System.out.printf("输入的数字是: %d\n它的平方是: %d", a, a * a);
        s.close();
    }

    public static void main(String[] args) {
        try {
            new ScannerTestInt().run();
        } catch (InputMismatchException e) {
            System.out.println("请输入数字,一定是数字");
        } catch (NoSuchElementException e) {
            System.out.println("成功退出!");
        }
    }
}
