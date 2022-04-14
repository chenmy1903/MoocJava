package com.nkwjg.loopmethod;

public class DoWhileMethod {
    private void run() {
        int result = 0;
        int i = 1;
        do {
            result += i;
            i++;
        } while (i <= 100);
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            new DoWhileMethod().run();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序运行时出现了错误, 错误报告如上, 如果这个错误并不是人为触发(按Ctrl+C之类), 可以去下面的网址报告这个Bug");
            System.out.println("https://github.com/chenmy1903/MoocJava/issues");
            System.exit(1);
        }
    }
}
