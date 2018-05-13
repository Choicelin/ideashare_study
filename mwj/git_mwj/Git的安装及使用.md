# Git的安装及使用

[TOC]

##关于Git

###Git是什么

Git的作用就是对文件进行版本管理，方便在不同版本进行切换修改，类似文件分不同时间备份让后需要时找回其中一份代替，不过更方便使用。 GitHub某种程度上就是代码的网盘，也有开源开发商作为代码发布、存放、征集Bug和意见用。 

###Git能做什么

我觉得Git就是一个能实现在多个设备中共享信息的应用

比如在设备a上改动增添了代码，通过a设备commit and push（上传）设备b，c能通过pull后直接查看修改，十分方便

## 下载Git

方法1：百度云下载

​              链接：https://pan.baidu.com/s/1nvj3qfu8-DcaqQk26DNVHw 密码：2oxk

​              保存至百度云下载文件包括Git及MySQL安装包

方法2：网页下载

Ctrl+鼠标单击  http://soft.jiegeng.com/3/3933.html?from=onebox

![1526190627280](C:\Users\ADMINI~1\AppData\Local\Temp\1526190627280.png)

点击高速下载 完成后打开

## 安装Git

点击Next

![1526191440070](C:\Users\ADMINI~1\AppData\Local\Temp\1526191440070.png)

选择安装路径

![1526191499005](C:\Users\ADMINI~1\AppData\Local\Temp\1526191499005.png)

点击Next

![1526192047136](C:\Users\ADMINI~1\AppData\Local\Temp\1526192047136.png)

点击Next

![1526192069941](C:\Users\ADMINI~1\AppData\Local\Temp\1526192069941.png)

点击Next

![1526192107409](C:\Users\ADMINI~1\AppData\Local\Temp\1526192107409.png)

点击Next

![1526192148246](C:\Users\ADMINI~1\AppData\Local\Temp\1526192148246.png)

点击Next

![1526192165624](C:\Users\ADMINI~1\AppData\Local\Temp\1526192165624.png)

点击Next

![1526192183660](C:\Users\ADMINI~1\AppData\Local\Temp\1526192183660.png)

点击Next

![1526192199013](C:\Users\ADMINI~1\AppData\Local\Temp\1526192199013.png)

点击Next

![1526192216371](C:\Users\ADMINI~1\AppData\Local\Temp\1526192216371.png)

点击Install

开始下载

![1526192252431](C:\Users\ADMINI~1\AppData\Local\Temp\1526192252431.png)

![1526192329048](C:\Users\ADMINI~1\AppData\Local\Temp\1526192329048.png)

两个都不勾选

点击Finish完成下载

##使用Git

###创建Github账号

打开https://github.com

![1526192588694](C:\Users\ADMINI~1\AppData\Local\Temp\1526192588694.png)

创建账号

注册成功并验证邮箱后登陆

### 获取储存空间链接

点击头像选择Your profile

![1526201366510](C:\Users\ADMINI~1\AppData\Local\Temp\1526201366510.png)

![1526201485710](C:\Users\ADMINI~1\AppData\Local\Temp\1526201485710.png)

![1526201660219](C:\Users\ADMINI~1\AppData\Local\Temp\1526201660219.png)

![1526201787443](C:\Users\ADMINI~1\AppData\Local\Temp\1526201787443.png)

![1526201994935](C:\Users\ADMINI~1\AppData\Local\Temp\1526201994935.png)

###检验Git是否装入Java，并登陆Github账号

![1526202188687](C:\Users\ADMINI~1\AppData\Local\Temp\1526202188687.png)

![1526202372560](C:\Users\ADMINI~1\AppData\Local\Temp\1526202372560.png)

出现此窗口表示Git以装入Java点击ok

![1526202387655](C:\Users\ADMINI~1\AppData\Local\Temp\1526202387655.png)

点击test出现链接成功即可

![1526202520668](C:\Users\ADMINI~1\AppData\Local\Temp\1526202520668.png)

## 使用Git

打开IDEA

###创建Git工程



![1526202641814](C:\Users\ADMINI~1\AppData\Local\Temp\1526202641814.png)

![1526202823485](C:\Users\ADMINI~1\AppData\Local\Temp\1526202823485.png)

![1526202840148](C:\Users\ADMINI~1\AppData\Local\Temp\1526202840148.png)

![1526202859807](C:\Users\ADMINI~1\AppData\Local\Temp\1526202859807.png)

![1526202913750](C:\Users\ADMINI~1\AppData\Local\Temp\1526202913750.png)

![1526202926528](C:\Users\ADMINI~1\AppData\Local\Temp\1526202926528.png)

![1526202939820](C:\Users\ADMINI~1\AppData\Local\Temp\1526202939820.png)

创建工程成功

### push和pull

![1526203177375](C:\Users\ADMINI~1\AppData\Local\Temp\1526203177375.png)

点击commit上传到本地

![1526203324507](C:\Users\ADMINI~1\AppData\Local\Temp\1526203324507.png)

![1526203387682](C:\Users\ADMINI~1\AppData\Local\Temp\1526203387682.png)

完成上传

![1526203457593](C:\Users\ADMINI~1\AppData\Local\Temp\1526203457593.png)

![1526203485741](C:\Users\ADMINI~1\AppData\Local\Temp\1526203485741.png)

开始拉取云端文件实现共享