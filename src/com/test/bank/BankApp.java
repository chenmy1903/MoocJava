package com.test.bank;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class BankApp {
    public static void main(String[] args) {
        Bank b = new Bank();
        User loginUser = null;
        System.out.println("银行演示程序");
        System.out.println("输入1创建账户");
        System.out.println("输入2登录账户");
        System.out.println("输入3查看当前登录的账户信息");
        System.out.println("输入4充值");
        System.out.println("输入5取钱");
        System.out.println("输入6退出银行程序");
        String res = "";
        while (true) {
            try {
                System.out.print("请输入选项: ");
                res = new String(System.console().readLine());
            } catch (NoSuchElementException e) {
                System.out.println("本程序发生了错误, 错误类型: NoSuchElementException");
                e.printStackTrace();
                res = "debug-pass";
            }
            switch (res) {
                case "1":
                    System.out.print("输入用户名: ");
                    int n = new String(System.console().readLine()).hashCode();
                    System.out.print("输入密码: ");
                    int p = new String(System.console().readPassword()).hashCode();
                    System.out.print("确认密码: ");
                    int p2 = new String(System.console().readPassword()).hashCode();
                    if (p2 == p) {
                        b.addUser(n, p);
                    } else {
                        System.out.println("两次输入的密码不一样");
                    }
                    break;
                case "2":
                    System.out.print("输入用户名: ");
                    int name = new String(System.console().readLine()).hashCode();
                    System.out.print("输入密码: ");
                    int pass = new String(System.console().readPassword()).hashCode();
                    User u = b.getUserByName(name);
                    if (u == null) {
                        System.out.println("用户名输入错误");
                        break;
                    }
                    if (u.passWord != pass) {
                        System.out.println("密码错误");
                        break;
                    }
                    loginUser = u;
                    System.out.println("登录成功");
                    break;
                case "3":
                    if (loginUser == null) {
                        System.out.println("请登录账号");
                        break;
                    }
                    loginUser.showUserInfo();
                    break;
                case "4":
                    if (loginUser == null) {
                        System.out.println("请登录账号");
                        break;
                    }
                    try {
                        System.out.print("输入充值的金额: ");
                        float q = Float.parseFloat(new String(System.console().readLine()));
                        loginUser.getQQCoin(q);
                    } catch (InputMismatchException e) {
                        System.out.println("输入错误");
                    }
                    res = "debug-pass";
                    break;
                case "5":
                    if (loginUser == null) {
                        System.out.println("请登录账号");
                        break;
                    }
                    try {
                        System.out.print("输入要取出的金额: ");
                        float q = Float.parseFloat(new String(System.console().readLine()));
                        loginUser.pay(q);
                    } catch (InputMismatchException e) {
                        System.out.println("输入错误");
                    }
                    res = "debug-pass";
                    break;
                case "6":
                    System.exit(0);
                    break;
                case "debug-users":
                    b.showAllUser();
                    break;
                case "debug-pass":
                    break;
                default:
                    System.out.println("输入错误。");
                    break;
            }
        }
    }
}

class User {
    private float qqcoin = 0f;
    public int userName;
    public int passWord;

    public User(int userNamea, int passWorda) {
        userName = userNamea;
        passWord = passWorda;
    }

    public void pay(float a648) {
        System.out.println("账户: " + userName + " (加密后的用户名)");
        if (qqcoin - a648 <= 0) {
            System.out.println("余额不足");
        }
        System.out.print("请输入密码继续操作: ");
        int pass = new String(System.console().readPassword()).hashCode();
        if (pass == passWord) {
            System.out.println("取钱成功");
            qqcoin -= a648;
        }
    }

    public void showUserInfo() {
        System.out.println("用户名: " + userName + " (加密后)");
        System.out.println("余额: " + qqcoin);
    }

    public void getQQCoin(float a648) {
        System.out.println("账户: " + userName);
        System.out.print("请输入密码继续操作: ");
        int pass = new String(System.console().readPassword()).hashCode();
        if (pass == passWord) {
            System.out.println("充值成功");
            qqcoin += a648;
            System.out.println("");
        }
    }

}

class Bank {
    private User[] users = new User[10];
    private int numberCount = 0;

    public User addUser(int userName, int passWord) {
        if (numberCount >= 10) {
            System.out.println("银行过于火爆, 请按Ctrl+C清除所有账户以继续");
        }
        if (getUserByName(userName) == null) {
            User u = new User(userName, passWord);
            users[numberCount] = u;
            numberCount += 1;
            System.out.println("账户创建成功");
            return u;
        } else {
            System.out.println("账户已存在");
        }
        return null;
    }

    public void showAllUser() {
        for (User user : users) {
            if ((user != null)) {
                System.out.println(user.userName);
            }
        }
    }

    public User getUserByName(int name) {
        for (User user : users) {
            if (user != null) {
                if (user.userName == name) {
                    return user;
                }
            }
        }
        return null;
    }
}
