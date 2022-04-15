/**
 * 求100以内的质数示例
 */
package com.nkwjg.loopmethod;

public class PrimeContinue {
    private void run() {
        System.out.println("100-200之间的质数");
        int n = 0;
        outer: for (int i = 101; i < 200; i+=2) { //outer其实就是一个标记
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(" " + i);
            n++;
            if (n < 10) {
                continue;
            }
            System.out.println();
            n = 0;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            new PrimeContinue().run(); //运行主方法
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序运行时出现了错误, 错误报告如上, 如果这个错误并不是人为触发(按Ctrl+C之类), 可以去下面的网址报告这个Bug");
            System.out.println("https://github.com/chenmy1903/MoocJava/issues");
            System.exit(1);
        }
    }
}
