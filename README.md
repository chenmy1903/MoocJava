# 网易慕课Java程序设计源代码

本代码并不是课程官方提供的代码, 仅为我(鸭皇)上课时写入的代码

## 更新时间

> 作者得上学, 所以更不了太多, 我会尽力去更新

每天都会至少更新2个程序, 休息日至少更新6个

## 多Java支持

> 考虑到有些同学会根据课程去下载JDK1.8, 所以这个项目以后将会对JavaSE1.8进行支持

本条已经进入日程了, 后续版本的Jar包会对以下版本的Java进行支持

本分支是Java17版本的build分支

因为现在代码一样, 所以暂时不弄其他分支, 但是会用其他版本的JDK去编译的

**PS: 之前本项目其实就是用Java8写的*

1. JavaSE1.8
2. JavaSE11
3. JavaSE17

## 特色

> 因为本人没有学完, 所以只更新了前三章的内容

1. 全部为汉化版本
2. 可以直接下载体验
3. 不会显示玩家使用快捷键Ctrl+Z和Ctrl+C和Ctrl+D出现的错误
4. 有本人写的小程序
5. 对课程官方给的代码进行了修复, 修复极端情况下出现的错误
6. 修复官方的中文乱码问题
7. 代码更美观(相对于官方版本而言)
8. 有启动提示 (双击Jar包)
9. 包名更规范(移除包名中的数字)
10. 代码有注释, 理解更容易(没有全写完)
11. 多Java支持(请前往其他分支)

## 报告Bug的步骤

> 推荐/非必须: 带上错误复现过程

1. 确保Bug不是人为触发(按Ctrl+C, Ctrl+Z, Ctrl+D等等)
2. 复制程序的错误输出([示例](#程序报错示例))
3. 前往[Issues](https://github.com/chenmy1903/MoocJava/issues)提交错误报告
4. 等待开发者前去查看(修复完会发邮件通知你)

### 程序报错示例

```text
<程序崩溃前输出>
<错误类型>: <错误信息>
        at <包名>.<方法>(<文件名>.java:行数)
        ...
程序运行时出现了错误, 错误报告如上, 如果这个错误并不是人为触发(按Ctrl+C之类), 可以去下面的网址报告这个Bug
https://github.com/chenmy1903/MoocJava/issues
```

### 开发者不是神

请不要说程序崩溃了这种的话, 开发者这边并不知道为什么发生了错误

请报告时一定要带上程序崩溃前的输出, 以让我们知道发生了什么

**不带输出的错误报告我们并不会去理会(带错误复现过程除外)*

## 关于Applet消失这件事

Applet好像打包不进去Jar里

Applet我的浏览器无法运行, 所以无法调试这一部分的代码

## 优化列表

### AutoScore

标准修复版修复内容:

> 类名: `com.nkwjg.autoscore.AutoScoreApp`

1. 增加自动换题功能
2. 修复用户不答题报错的问题 (Error: `NumberFormatException`)
3. 修复非常不美观的`text`文字 (修改为`按出题按钮`, `按钮`显示不出来, 所以变成了`按出题`)
4. 增加手滑模式(多输入不是`int`的文字不会报错)

特性修复版修复内容:

> 类名: `com.nkwjg.autoscore.AutoScoreAppFixed`

1. 修复除法算式出现除不尽的情况
2. 修复开始的结果是0的Bug
3. 支持结果显示(答错的情况下)

## 关于无法运行的问题

1. 请将自己的Java升级到Java17
2. 下载下来手动构建(推荐使用VS Code进行构建, 在终端敲代码太长了)
3. 使用`java -cp "./bin" <类名>`进行运行 (在无法使用Jar包时这是最佳方案)

## 下载

> 构建时Java: JavaSE17

[Releases下载](https://github.com/chenmy1903/MoocJava/releases)

想体验效果的同学可以直接下载Jar包来运行, 下面这是class列表

> Jar包主类: `com.nkwjg.appversion.AppMain`

```java
com.nkwjg.helloworld.HelloWorldApp //HelloWorld (终端的输出)
com.nkwjg.input.AppLineInOut //终端的输入(Java 1.4以下版本)
com.nkwjg.input.ScannerTestInt //求平方程序 (仅支持JavaSE1.5+)
com.nkwjg.gui.AppGraphInOut //平方计算器(图形化的输入输出)
com.nkwjg.ifswitch.LeapYear //闰年判断(if语句)
com.nkwjg.ifswitch.GradeLevel //分数等级判断(switch语句)
com.nkwjg.ifswitch.GradeLevelInput //可手动输入等级的分数等级判断(课程里没有)
com.nkwjg.autoscore.AutoScoreApp //出题机器人(修复版, 但保留原版特性)
com.nkwjg.autoscore.AutoScoreAppFixed //出题机器人(修复原版特性版)
com.nkwjg.loopmethod.ForMethod //for循环示例
com.nkwjg.loopmethod.WhileMethod //while循环示例
com.nkwjg.loopmethod.DoWhileMethod //do...while循环示例
com.nkwjg.loopmethod.ForBreakMethod //break语句示例
com.nkwjg.loopmethod.ForContinueMethod //continue语句示例
com.nkwjg.loopmethod.PrimeContinue //100-200之间的的质数
com.nkwjg.paintcircle.CircleFrame //99个圆示例
```

## 运行

> 需要下载JDK17和`MoocJava.jar`作为依赖, 且JDK17在PATH的第一位(如果安装多个Java)

可以使用以下指令进行运行

```batch
java -cp "MoocJava.jar" <类名>
```
