package ideashare.tuchuangadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author lixiang
 * @CreateTime 2018/5/14
 **/
public class Main {

    public static void main(String[] args) {

        int a  =0;
        Integer integer = new Integer(0);
        integer.toString();
        integer.byteValue();

        float f = 0.0f;
        Float ff = new Float(0.0f);
        ff.doubleValue();

        double d = 0.2;
        Double dd = new Double(0.2);

        boolean b =false;
        Boolean boo = new Boolean(false);

        char c ='c';
        Character character = new Character('c');


        String s ="这是一个字符串";

     //   String[] strings = new String["aa ","aa ","cc "];

        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
       // list.remove("aa");
        for (int i = 0; i < list.size(); i++) {
         //   System.out.println(list.get(i));
        }

       // System.out.println(list.toString());

        Map<String,String> map = new HashMap<String, String>();

        map.put("x","y");
        map.put("1","3");

        System.out.println(map.get("1"));

        Map<String,List<String>> listMap = new HashMap<String, List<String>>();

      //  System.out.println(map.toString());



    }



}
