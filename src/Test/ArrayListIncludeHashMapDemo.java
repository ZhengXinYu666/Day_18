package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * ArrayList集合嵌套HashMap集合并遍历
 * 需求：
 *  假设ArrayList的集合元素是HashMap，有三个
 *  每一个HashMap集合的键和值都是字符串
 *
 *  结果：
 *  周瑜--小乔
 *  吕布--貂蝉
 *
 *  郭靖--黄蓉
 *  杨过--小龙女
 *
 *  令狐冲--任盈盈
 *  林平之--岳灵珊
 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();

        //创建元素1
        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("周瑜","小乔");
        hm1.put("吕布","貂蝉");
        //把元素添加到array
        array.add(hm1);

        //创建元素2
        HashMap<String,String> hm2 = new HashMap<String,String>();
        hm2.put("郭靖","黄蓉");
        hm2.put("杨过","小龙女");
        //把元素添加到array
        array.add(hm2);

        //创建元素3
        HashMap<String,String> hm3 = new HashMap<String,String>();
        hm3.put("令狐冲","任盈盈");
        hm3.put("林平之","岳灵珊");
        //把元素添加到array
        array.add(hm3);


        for(HashMap<String,String> hm :array){
            Set<String> set = hm.keySet();
            for(String key:set){
                String value = hm.get(key);
                System.out.println(key+"---"+value);
            }
        }
    }
}
