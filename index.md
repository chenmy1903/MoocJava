# 网易`Java程序设计`源代码

更多信息请见GitHub, 点击上方按钮直达

## JDK的下载及安装

> Wiki里也有, 就是不想让你们走弯路(把JDK下成JRE)

以下是几种JDK下载渠道(点击链接前往下载页面)

1. [Amazon Corretto](https://aws.amazon.com/corretto)
2. [Azul Zulu](https://www.azul.com/downloads/?package=jdk)
3. [Eclipse Adoptium's Temurin](https://adoptium.net/)
4. [Microsoft Build of OpenJDK](https://docs.microsoft.com/zh-cn/java/openjdk/download)
5. [Oracle Java SE](https://www.oracle.com/java/technologies/downloads/)
6. [Red Hat build of OpenJDK](https://developers.redhat.com/products/openjdk/download)
7. [SapMachine](https://sapmachine.io/)

其中的`Microsoft OpenJDK`仅提供JDK11以上版本, `Oracle Java SE`为官方版本

可以[点击这里](https://download.fastgit.org/adoptium/temurin17-binaries/releases/download/jdk-17.0.2+8/OpenJDK17U-jdk_x64_windows_hotspot_17.0.2_8.msi)直接下载`Adoptium 's Temurin`的JDK17版本

### 安装JDK

> 建议安装选项: 关联Jar文件, 添加到PATH, 设置JAVA_HOME环境变量

傻瓜式安装, 在座的各位应该没有不会的

### 测试安装

1. Win+R打开运行, 输入`cmd` (Linux和Mac则是打开Terminal)
2. 在打开的窗口里输入`java -version`
3. 如果出现的是Java的版本号, 就安装成功了(OpenJDK版本信息显示的为OpenJDK, OracleJDK显示为Java)
