package com.nkwjg.loopmethod;

public class ForMethod {
    private void run() throws Exception {
        int result = 0;
        for (int i = 1; i < 100; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            new ForMethod().run();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序运行时出现了错误, 错误报告如上, 如果这个错误并不是人为触发(按Ctrl+C之类), 可以去下面的网址报告这个Bug");
            System.out.println("https://github.com/chenmy1903/MoocJava/issues");
            System.exit(1);
        }
    }
}
