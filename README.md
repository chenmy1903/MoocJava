# 网易慕课Java程序设计源代码

本代码并不是课程官方提供的代码, 仅为我(鸭皇)上课时写入的代码

## 特色

1. 全部为汉化版本
2. 可以直接下载体验
3. 不会显示玩家使用快捷键Ctrl+Z和Ctrl+C和Ctrl+D出现的错误
4. 有本人写的小程序

## 关于无法运行的问题

1. 请将自己的Java升级到Java17
2. 下载下来手动构建(推荐使用VS Code进行构建, 在终端敲代码太长了)

## 下载

> 构建时Java: JavaSE17

[Releases下载](https://github.com/chenmy1903/MoocJava/releases)

想体验效果的同学可以直接下载Jar包来运行, 下面这是class列表

```java
com.nkwjg.helloworld.HelloWorldApp //HelloWorld (终端的输出)
com.nkwjg.input.AppLineInOut //终端的输入(Java 1.4以下版本)
com.nkwjg.input.ScannerTestInt //求平方程序 (仅支持JavaSE1.5+)
com.nkwjg.gui.AppGraphInOut //平方计算器(图形化的输入输出)
com.nkwjg.ifswitch.LeapYear //闰年判断(if语句)
com.nkwjg.ifswitch.GradeLevel //分数等级判断(switch语句)
com.nkwjg.ifswitch.GradeLevelInput //可手动输入等级的分数等级判断(课程里没有)
```

## 运行

> 需要下载JDK17和`MoocJava.jar`作为依赖, 且JDK17在PATH的第一位(如果安装多个Java)

可以使用以下指令进行运行

```batch
java -cp "MoocJava.jar" <类名>
```
