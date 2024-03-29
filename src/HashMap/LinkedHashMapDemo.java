package HashMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashMap是Map接口的哈希表和链接列表实现
 * 具有可预知的迭代顺序
 * 说明键是有序的
 *
 * 由哈希表保证键的唯一性
 * 由链表保证键的有序（存储和取出的顺序一致）
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();

        //创建添加元素
        hm.put("2345","hello");
        hm.put("1234","world");
        hm.put("3456","java");
        hm.put("1234","javaee");
        hm.put("3456","android");

        //遍历
        Set<String> set = hm.keySet();
        for(String key:set){
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }
    }
}
