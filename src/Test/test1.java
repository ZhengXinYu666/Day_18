package Test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * "aabacabcdabcde"获取字符串中每一个字母出现的次数要求结果
 * "a(5)b(4)c(3)d(2)e(1)"
 *
 * 思路：
 *      1、定义一个字符串
 *      2、定义一个Map集合
 *      3、把字符串转换为字符数组
 *      4、遍历字符数组，得到每一个字符
 *      5、拿这个字符到Map集合中去找，看返回值
 *          是null：就把该字符作为键，1作为值存储
 *          不是null：就把值++，然后重新存储该键和值
 *      6、定义一个字符串缓冲区
 *      7、遍历TreeMap集合，获取每一个键值对元素拼接
 *      8、把字符串缓冲区转换为字符串输出
 */
public class test1 {
    public static void main(String[] args) {

        //定义一个字符串,可以改进为键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //String s= "aabacabcdabcde";

        //定义一个Map集合         键：Character   值：Integer
        TreeMap<Character,Integer> tm = new TreeMap<Character, Integer>();

        //把字符串转换为字符数组
        char[] chs = line.toCharArray();

        //遍历字符数组，得到每一个字符
        for(char ch :chs){
            //到集合中去找值
            Integer i = tm.get(ch);
            if(i == null){
                tm.put(ch,1);
            }else{
                i++;
                tm.put(ch,i);
            }
        }
        //定义字符串缓冲区
        StringBuilder sb = new StringBuilder();

        //遍历集合，得到键和值，按照要求拼接
        Set<Character> set = tm.keySet();
        for(Character key:set){
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        //把字符串缓冲区转换为字符串输出
        String result = sb.toString();
        System.out.println(result);

    }
}
