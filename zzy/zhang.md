在idea装入GIT并创建储存空间以及上传

目录 在idea装入GIT并创建储存空间以及上传获取储存空间链接网页下载GIT并安装检验GIT是否安装入JAVA,并登录GITHUB账号创建储存空间

获取储存空间链接

1. 打开网址www.github.com，如下：
   
2. 填写，注册成功， 并验证邮箱，然后登陆(最好用邮箱登录，方便简洁)
3. 点击Your profile进入
   
4. 点击Repositories，然后点击下面绿色的New,输入储存空间名称，勾选Initialize this repository with a README这一项，创建储存空间 
    
5. 点击绿色的Clone or download，复制链接。
    

网页下载GIT并安装

1. 一直next,最后这两项都不勾选，然后就完成安装了

检验GIT是否安装入JAVA,并登录GITHUB账号

1. 打开idea,点击最下面的Configure,选择Settings



1. 搜索GIT,点击右边的Test。
2. 出现此窗口即成功装入。
   
3. 然后选择右边的GITHUB,输入账号密码。
4. 点击Test,出现连接成功即可



创建储存空间

1. 打开idea，点击Check out from Version Control，再点击GIT.
2. 出现此窗口，将窗口内链接替换为先前复制的储存空间链接，然后点击Clone
3. 双击Project中第一个文件夹，可以看到一个名为README.md的文件，双击该文件，此时窗口与下图一致。
4. 点击左下角的Version Control,然后在上面文档区域开始新的一行，可以看到下方粗体字Default后面多了一个(1 file)。
5. 双击该文件，显示出子文档，然后鼠标右键，选择Commit
6. 然后在Commit Message输入上传的文字，再点击下方Commit右边的向下符号，选择Commit and Push
7. 点击Push即可。
8. 在屏幕右下方看到此通知即表示上传成功。

