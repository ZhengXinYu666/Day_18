package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的获取功能
 * V get(object key)；根据建获取值
 * Set<K> keySet()：获取集合中所有的键的集合
 * Collection<V> value()：获取结合中所有值得集合
 *
 */
public class MapDemo2 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String> map = new HashMap<String,String>();
        //创建元素并添加元素
        map.put("邓超","孙俪");
        map.put("黄晓明","杨颖");
        map.put("周杰伦","昆凌");
        map.put("刘恺威","杨幂");

        //获取方法
        //V get(object key)；根据建获取值
        System.out.println(map.get("周杰伦"));
        System.out.println(map.get("周杰"));//返回null
        System.out.println("----------");

        //Set<K> keySet()：获取集合中所有的键的集合
        Set<String> set = map.keySet();
        for(String key:set){
            System.out.println(key);
        }
        System.out.println("----------");


        //Collection<V> value()：获取结合中所有值得集合
        Collection<String> con = map.values();
        for(String value:con){
            System.out.println(value);
        }

    }
}
