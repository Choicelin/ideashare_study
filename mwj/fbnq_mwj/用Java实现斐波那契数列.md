# 用Java实现斐波那契数列

[TOC]

## 代码

```
//class
public class fblq {
        //主函数  
    public static void main(String[] args) {       
        //斐波那契数列
        //定义数组   int和long超范围   最后决定用double
        double arr[]=new double[100];
        //for循环为数组给值并输出
        for (int i=0;i<=100;i++)                    
        {
            //为第一个第二个arr数组赋值
            if (i<=1) {                              
                arr[i]=i+1;
                //输出arr[0]和arr[1]
                System.out.println(arr[i]);          
            }
            //为后98个数组赋值
            else {
                //每一个数都是前两个数字相加
                arr[i] = arr[i - 1] + arr[i - 2];
                //输出后98个数
                System.out.println(arr[i]+" ");      
            }
        }
    }


}
```

## 代码截图

[![xhKEd.png](https://s1.ax2x.com/2018/05/16/xhKEd.png)](https://simimg.com/i/xhKEd)

## 运行结果（部分）

[![xh12R.png](https://s1.ax2x.com/2018/05/16/xh12R.png)](https://simimg.com/i/xh12R)

