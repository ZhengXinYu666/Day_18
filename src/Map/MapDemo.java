package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 作为学生来说，我们是按照学号来区分的
 * 假设现在已经知道了学生的学号
 * 要根据学号去获取学生对象-姓名
 * 如何实现？
 * 把学号和学生姓名作为一个对象的成员，然后遍历获取
 * 但是如果已经把学生的姓名拿出来了还需要编号去找么
 * 针对这种需求：仅仅知道学号就想知道学生姓名的情况
 * java就提供了一种新的集合:Map
 * 将键映射到值得对象
 *
 * 特点：可以存储键值对的元素，这个时候存储上面的需求就可以
 *
 * 学号1 姓名1
 * 学号2 姓名2
 * 学号3 姓名3
 * Set  List
 *
 * K值是唯一的，所以学号不可重复
 *
 *
 * 如果键是第一次存储就直接存储元素，返回null
 * 如果键是不是第一次存储，就用value把之前的value替换掉
 * 返回之前的值
 *
 *
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        //添加元素
        //System.out.println("put "+map.put("文章","马伊琍"));
        //System.out.println("put "+map.put("文章","姚笛"));
        //System.out.println(map);
        map.put("邓超","孙俪");
        map.put("黄晓明","杨颖");
        map.put("周杰伦","昆凌");
        map.put("刘恺威","杨幂");
        //删除功能
        //map.clear();
        //v remove(Object Key)
        System.out.println(map.remove("黄晓明"));
        System.out.println(map.remove("黄晓波"));

        //boolean containsKey(Object key):判断结合是否包含指定的键
        System.out.println(map.containsKey("黄晓明"));
        System.out.println(map.containsKey("周杰伦"));
        //isEmpty
        System.out.println(map.isEmpty());

        //int size()：看集合中的键值对的对数
        System.out.println(map.size());
        System.out.println(map);


    }
}
