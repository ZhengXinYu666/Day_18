package Poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 模拟斗地主洗牌和发牌
 *
 * 分析：
 *      1、创建一个牌盒
 *      2、装牌
 *      3、洗牌
 *      4、发牌
 *      5、看牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> array = new ArrayList<>();
        //装牌
        //黑桃A，黑桃2，黑桃3，...，黑桃K
        //红桃A,...
        //梅花A,...
        //方块A,...
        //定义一个花色数组
        String[] colors = {"♠️","♥️","♣️","♦️"};
        //定义一个点数数组
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //装牌
        for(String color : colors){
            for(String number : numbers){
                array.add(color.concat(number));
            }
        }
        array.add("小王");
        array.add("大王");
        //洗牌
        Collections.shuffle(array);
        //发牌
        //三个人，每个人有一手牌
        ArrayList<String> nongmin1 = new ArrayList<String>();
        ArrayList<String> nongmin2 = new ArrayList<String>();
        ArrayList<String> dizhu = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for(int x = 0; x<array.size(); x++) {
            if (x >= array.size() - 3) {
                dipai.add(array.get(x));
                }else if (x % 3 == 0) {
                    dizhu.add(array.get(x));
                } else if (x % 3 == 1) {
                    nongmin1.add(array.get(x));
                } else if (x % 3 == 2) {
                    nongmin2.add(array.get(x));
                }
            }
        //看牌
        lookPoker("地主",dizhu);
        lookPoker("农民1",nongmin1);
        lookPoker("农民2",nongmin2);
        lookPoker("作为底牌",dipai);
    }
    public static void lookPoker (String name,ArrayList<String> array){
        System.out.println(name+"的牌是：");
        for(String s:array){
            System.out.print(s+ " ");
        }
        System.out.println();
    }
}





















