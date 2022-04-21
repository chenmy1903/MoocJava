/**
 * Array演示
 * 无实际作用, 仅作演示, 在README中会有标注
 */
package com.nkwjg.array;

public class NewArray {

    public static int[] a = new int[3]; //初始化数组(长度为3)

    public static void main(String[] args) {
        System.err.println("这是一个定义示例程序, 建议查看代码, 直接运行没有任何意义");
        a[0] = 3;
        a[1] = 9;
        a[2] = 8;
        System.out.println(a[0]);

        MyDate[] dates = new MyDate[3];
        dates[0] = new MyDate(22, 7, 1964);
        dates[1] = new MyDate(1, 1, 2000);
        dates[2] = new MyDate(22, 12, 1964);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int y, int m, int d) {
        /**
         * 3_4.1的示例类MyDate
         * 本class并非官方所写, 所以不代表官方写法
         */
        year = y;
        month = m;
        day = d;
    }

    public int[] GetDate() {
        /**
         * 获取储存的日期
         */
        int[] a = new int[3];
        a[0] = year;
        a[1] = month;
        a[2] = day;
        return a;
    }
}
