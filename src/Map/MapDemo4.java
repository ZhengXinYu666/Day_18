package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  Map-夫妻对
 *  思路：
 *  A、获取所有结婚证的集合
 *  B、遍历结婚证的集合得到每一个结婚证
 *  C、根据结婚证获取丈夫和妻子
 *
 *  转换思路：
 *      A、获取所有键值对对象的集合
 *      B、遍历键值对对象的集合获取得到每一个键值对对象
 *      C、根据键值对对象获取键和值
 *
 *      这里面最麻烦的就是键值对对象如何表示？
 *      Set<Map.Entry<K,V> entrySet():返回的是键值对对象的集合
 *
 */
public class MapDemo4 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();
        //创建元素并添加到集合
        map.put("杨过","小龙女");
        map.put("郭靖","黄蓉");
        map.put("杨康","顾念慈");
        map.put("陈旋风","梅超风");

        //获取所有键值对对象的集合
        Set<Map.Entry<String,String>> set = map.entrySet();

        //遍历键值对对象的集合，得到每一个键值对对象
        for(Map.Entry<String,String> me:set){
            //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"---"+value);

        }
    }
}
