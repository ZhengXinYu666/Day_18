package HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap嵌套HashMap
 *
 * 王者荣耀
 *     ck       刺客
 *          李白      20
 *          韩信      22
 *     zs       战士
 *          花木兰    21
 *          露娜      19
 *
 * 先存储元素，然后遍历元素
 */
public class HashMapDemo5 {
    public static void main(String[] args) {
        //创建集合
        HashMap<String,HashMap<String,Integer>> hm = new HashMap<String,HashMap<String,Integer>>();
        //添加刺客集合对象ck
        HashMap<String,Integer> ck = new HashMap<String,Integer>();
        //创建并添加元素
        ck.put("李白",20);
        ck.put("韩信",22);
        //将ck结合添加到hm
        hm.put("刺客",ck);

        //创建战士集合对象zs
        HashMap<String,Integer> zs = new HashMap<String,Integer>();
        //创建并添加元素
        zs.put("李白",20);
        zs.put("韩信",22);
        //将ck结合添加到hm
        hm.put("战士",zs);

        //遍历集合
        Set<String> set = hm.keySet();
        for(String Bigkey:set){
            System.out.println(Bigkey);
            HashMap<String,Integer> hmValue = hm.get(Bigkey);
            Set<String> hmValueSet = hmValue.keySet();
            for(String smallkey:hmValueSet){
                Integer hmValueValue = hmValue.get(smallkey);
                System.out.println(hmValueValue+"---"+smallkey);
            }
        }
    }
}
