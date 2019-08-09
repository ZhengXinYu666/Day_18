package HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap<Integer,String>
 * 键 Integer
 * 值 String
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        //创建对象
        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        //创建元素并添加
//        Integer i = new Integer(27);
//        Integer i =27;
//        String s = "林青霞";
//        hm.put(i,s);
        hm.put(27,"林青霞");
        hm.put(30,"郑黑脸");
        hm.put(28,"郑辛宇");
        hm.put(29,"林青霞");

        //hm.put(008,"猪头");
        //00开头是八进制，不能出现8以上的单个数据

        //遍历
        Set<Integer> set = hm.keySet();
        for(Integer key:set){
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }
        //集合元素的字符串表示
        System.out.println(hm);

    }
}
