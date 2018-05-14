# Web工程

[TOC]

## 下载Spring Initializr 

http://start.spring.io/

[![ihZgp.jpg](https://s1.ax2x.com/2018/05/14/ihZgp.jpg)](https://simimg.com/i/ihZgp)

然后点击Generate Project，会下载一个压缩文件，解压此文件。

## 创建一个工程

先创建一个普通工程，然后在电脑文件里面把刚刚压缩的全部文件剪切下来，保存到刚刚创建的工程里面。

刚刚解压的文件

[![ihvQ3.png](https://s1.ax2x.com/2018/05/14/ihvQ3.png)](https://simimg.com/i/ihvQ3)

把解压文件剪切到刚刚的工程文件里面

[![ihCIQ.png](https://s1.ax2x.com/2018/05/14/ihCIQ.png)](https://simimg.com/i/ihCIQ)

此时IDEA里面就会有刚刚剪切到里面去的文件

[![iheOa.png](https://s1.ax2x.com/2018/05/14/iheOa.png)](https://simimg.com/i/iheOa)



然后把src改为不是java源码，把src里面的java项改为源码形式。

[![ihUUz.png](https://s1.ax2x.com/2018/05/14/ihUUz.png)](https://simimg.com/i/ihUUz)

变为此时形式。

[![ihAQh.png](https://s1.ax2x.com/2018/05/14/ihAQh.png)](https://simimg.com/i/ihAQh)

然后把resources项改为Resources Root项。把test里面的java改为Test Suorces Root项。然后右击pom.xml，选择下图选项。

[![ihxnd.png](https://s1.ax2x.com/2018/05/14/ihxnd.png)](https://simimg.com/i/ihxnd)

在com.example.demo下创建一个java class类，名字是HomeController。

[![ihRcr.png](https://s1.ax2x.com/2018/05/14/ihRcr.png)](https://simimg.com/i/ihRcr)

输入如下图内容。

[![ivTr3.png](https://s1.ax2x.com/2018/05/14/ivTr3.png)](https://simimg.com/i/ivTr3)

[![ivzmG.png](https://s1.ax2x.com/2018/05/14/ivzmG.png)](https://simimg.com/i/ivzmG)

然后可以开始运行了。http://localhost:8080/login或者http://localhost:8080/register。所以@GetMapping是干嘛的？？