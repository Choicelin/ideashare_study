package tech.ideashare.tuchuangadmin;

public class peibona {
    public static void main(String[] args){
        System.out.println("裴波那契数列的前50位数是:");
        System.out.println("1\n1");
        long first = 1;
        long second = 1;
        //初始化next为0
        long next=0;
        //当i处于3-51之间进行循环，逐递增
        for (int i = 3; i < 51; i++) {
            //后者赋值给前者
            next = first+second;
            first = second;
            second = next;
            System.out.println(next);
            }
        }
    }





