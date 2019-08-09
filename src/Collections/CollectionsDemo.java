package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections：是针对集合操作的工具类，都是静态方法
 *
 * 面试题：Collection和Collections的区别？
 * Collection：是单列集合的顶层接口，有子接口List和Set
 * Collections：是针对集合操作的工具类，有针对集合进行排序和二分查找的方法
 *
 *
 * public static <T> void sort(List<T>list)
 * public static <T> int binarySearch(List<?>list T key)
 * public static <T> T max(Collection<?> coll)
 * public static void reverse(List<?>list)
 * public static void shuffile(List<?>list)
 */

public class CollectionsDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();

        //添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list:"+list);

        //public static <T> void sort(List<T>list)
        Collections.sort(list);
        //System.out.println("list:"+list);

        //System.out.println(Collections.binarySearch(list,30));
        //找不到的时候返回的是最大索引+1

        //System.out.println(Collections.max(list));

//        Collections.reverse(list);
//        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
