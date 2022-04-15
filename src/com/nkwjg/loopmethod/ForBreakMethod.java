package com.nkwjg.loopmethod;

public class ForBreakMethod {
    private void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("程序结束!");
    }

    public static void main(String[] args) {
        try {
            new ForBreakMethod().run();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序运行时出现了错误, 错误报告如上, 如果这个错误并不是人为触发(按Ctrl+C之类), 可以去下面的网址报告这个Bug");
            System.out.println("https://github.com/chenmy1903/MoocJava/issues");
            System.exit(1);
        }
    }
}
