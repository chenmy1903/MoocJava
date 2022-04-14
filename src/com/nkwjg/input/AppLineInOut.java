package com.nkwjg.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppLineInOut {
    private void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("输入一段文字: ");
            String s = br.readLine();
            System.out.printf("输入的文字为: %s", s);
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        try {
            new AppLineInOut().run();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
