package TreeMap;

import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap是基于红黑树的map接口实现
 *
 * 默认是自然排序
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<String,String>();

        tm.put("hello","你好");
        tm.put("world","世界");
        tm.put("java","JAVA");
        tm.put("world","世界2");
        tm.put("javaee","JAVAEE");

        Set<String> set = tm.keySet();
        for(String key:set){
            String value = tm.get(key);
            System.out.println(key+"---"+value);
        }
    }
}
