package Test;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap嵌套HashMap
 *
 * 培训机构
 *     jc 基础班
 *          李白      20
 *          韩信      22
 *     jy 就业班
 *          花木兰    21
 *          公孙离    19
 *
 * 先存储元素，然后遍历元素
 */
public class HashMaptest {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,Integer>> czbkMap = new HashMap<String,HashMap<String,Integer>>();

        //创建基础班集合对象
        HashMap<String ,Integer> jcMap = new HashMap<String,Integer>();
        //添加元素
        jcMap.put("李白",20);
        jcMap.put("韩信",22);
        //把基础班添加到大集合
        czbkMap.put("jc",jcMap);

        //创建就业班集合对象
        HashMap<String ,Integer> jyMap = new HashMap<String,Integer>();
        //添加元素
        jyMap.put("花木兰",21);
        jyMap.put("公孙离",19);
        //把基础班添加到大集合
        czbkMap.put("jy",jyMap);

        //遍历集合
        Set<String> czbkMapSet = czbkMap.keySet();
        for(String czbkMapkey: czbkMapSet){
            System.out.println(czbkMapkey);
            HashMap<String,Integer> czbkMapValue = czbkMap.get(czbkMapkey);
            Set<String> czbkMapValueSet = czbkMapValue.keySet();
            for (String czbkMapValueKey:czbkMapValueSet){
                Integer czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
                System.out.println("\t"+czbkMapValueKey+"---"+czbkMapValueValue);
            }
        }

    }
}
