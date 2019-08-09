package Hashtable;

import java.util.HashMap;

/**
 * Hashtable<Key,Value>
 * 此类实现一个哈希表，该哈希表将键映射到相应的值
 * 任何非null对象都可以用作键或值
 * HashMap其实是用来替代Hashtable的
 * Hash是同步的，效率低
 *
 * 1、HashMap和Hashtable的区别？
 * Hashtable：线程安全，效率低。不允许null键或null值
 * HashMap：线程不安全，效率高，允许null键和null值
 *
 * 2、List，Set，Map等接口是否都继承自Map接口？
 * List，Set不是继承自map接口，它们继承自Collection接口
 * Map接口本身就是一个顶层接口
 *
 */
public class HashtableDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();

        hm.put("it001","hello");
        hm.put(null,"world");
        hm.put("java",null);
    }
}
