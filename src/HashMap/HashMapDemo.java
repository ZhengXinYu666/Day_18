package HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap是基于哈希表的Map接口实现
 * 哈希表的作用是用来保证键的唯一性的
 *
 * HashMap<String,String>
 *
 * 保证键唯一
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,String> hm = new HashMap<String,String>();

        //创建元素并添加
        //String key1 = "it001";
        //String value1 = "乔布斯";
        hm.put("it001","马云");
        hm.put("it006","马化腾");
        hm.put("it003","李彦宏");
        hm.put("it004","乔布斯");
        hm.put("it005","雷军");
        hm.put("it002","裘伯君");
        hm.put("it001","比尔盖茨");

        //遍历
        Set<String> set = hm.keySet();
        for(String key:set){
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }

    }
}
