package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *  1、创建一个HashMap集合
 *  2、创建一个ArrayList集合
 *  3、创建花色数组和点数数组
 *  4、从0开始往HashMap里面存储编号，并存储相应的牌
 *  同时往ArrayList里面存储编号即可
 *  5、洗牌（洗的是编号）
 *  6、发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接受）
 *  7、看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
 */
public class Poker {
    public static void main(String[] args) {
       //创建一个HashMap集合
        HashMap<Integer,String> hm = new HashMap<>();

        //创建一个ArrayList集合
        ArrayList<Integer> array = new ArrayList<>();

        //创建花色和点数数组
        //定义一个花色数组
        String[] colors = {"♠️","♥️","♣️","♦️"};
        //定义一个点数数组
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //从0开始往HashMap存储编号，并存储相应的牌，同时往ArrayList里面存储编号即可
        int index = 0;
        for(String number:numbers){
            for(String color:colors){
                String poker = color.concat(number);
                hm.put(index,poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);


        //洗牌（洗的是编号）
        Collections.shuffle(array);

        //发牌    TreeSet接受
        TreeSet<Integer> dizhu = new TreeSet<>();
        TreeSet<Integer> nongmin1 = new TreeSet<>();
        TreeSet<Integer> nongmin2 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for(int x = 0; x< array.size();x++){
            if(x>= array.size()-3){
                dipai.add(array.get(x));
            }else if(x%3 == 0){
                dizhu.add(array.get(x));
            }else if(x%3 == 1){
                nongmin1.add(array.get(x));
            } else if (x % 3 == 2) {
                nongmin2.add(array.get(x));
            }
        }

        //看牌
        lookPoker("地主",dizhu,hm);
        lookPoker("农民1",nongmin1,hm);
        lookPoker("农民2",nongmin2,hm);
        lookPoker("作为底牌",dipai,hm);



    }
    //写看牌功能
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.println(name+"的牌是：");
        for(Integer key:ts){
            String value = hm.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}












