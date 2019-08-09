package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 数据看做是学生对象
 * 王者荣耀
 *      zs  战士
 *          jc  基础
 *              亚瑟     48
 *              曹操     38
 *          jj  进阶
 *              花木兰     25
 *              橘右京     29
 *      fs  法师
 *          jc  基础
 *              妲己      18
 *              小乔      19
 *          jj  进阶
 *              诸葛亮     30
 *              上官婉儿    18
 *      ck  刺客
 *          jc  基础
 *              兰陵王     26
 *              娜可露露    23
 *          jj  进阶
 *              李白      36
 *              韩信      35
 *      ss  射手
 *          jc  基础
 *              鲁班七号    6
 *              后裔       29
 *          jj  进阶
 *              马可波罗    25
 *              公孙离     17
 *
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建大集合
        HashMap<String,HashMap<String, ArrayList<King>>> WZRYMap = new HashMap<String,HashMap<String, ArrayList<King>>>();

        //战士
        HashMap<String,ArrayList<King>> zsMap = new HashMap<String,ArrayList<King>>();
        ArrayList<King> array1 = new ArrayList<>();
        King k1 = new King("亚瑟",48);
        King k2 = new King("老夫子",50);
        array1.add(k1);
        array1.add(k2);
        ArrayList<King> array2 = new ArrayList<>();
        King k3 = new King("花木兰",25);
        King k4 = new King("橘右京",27);
        array1.add(k3);
        array1.add(k4);
        zsMap.put("基础操作",array1);
        zsMap.put("进阶操作",array2);
        WZRYMap.put("战士职业",zsMap);

        //法师
        HashMap<String,ArrayList<King>> fsMap = new HashMap<String,ArrayList<King>>();
        ArrayList<King> array3 = new ArrayList<>();
        King k5 = new King("妲己",18);
        King k6 = new King("小乔",17);
        array3.add(k5);
        array3.add(k6);
        ArrayList<King> array4 = new ArrayList<>();
        King k7 = new King("诸葛亮",30);
        King k8 = new King("上官婉儿",18);
        array4.add(k7);
        array4.add(k8);
        fsMap.put("基础操作",array3);
        fsMap.put("进阶操作",array4);
        WZRYMap.put("法师职业",fsMap);

        //刺客
        HashMap<String,ArrayList<King>> ckMap = new HashMap<String,ArrayList<King>>();
        ArrayList<King> array5 = new ArrayList<>();
        King k9 = new King("兰陵王",27);
        King k10 = new King("娜可露露",22);
        array5.add(k9);
        array5.add(k10);
        ArrayList<King> array6 = new ArrayList<>();
        King k11 = new King("李白",25);
        King k12 = new King("韩信",24);
        array6.add(k11);
        array6.add(k12);
        ckMap.put("基础操作",array5);
        ckMap.put("进阶操作",array6);
        WZRYMap.put("刺客职业",ckMap);

        //射手
        HashMap<String,ArrayList<King>> ssMap = new HashMap<String,ArrayList<King>>();
        ArrayList<King> array7 = new ArrayList<>();
        King k13 = new King("鲁班七号",6);
        King k14 = new King("后裔",30);
        array7.add(k13);
        array7.add(k14);
        ArrayList<King> array8 = new ArrayList<>();
        King k15 = new King("马可波罗",26);
        King k16 = new King("公孙离",18);
        array8.add(k15);
        array8.add(k16);
        ssMap.put("基础操作",array7);
        ssMap.put("进阶操作",array8);
        WZRYMap.put("射手职业",ssMap);

        //遍历集合
        Set<String> WZRYMapSet = WZRYMap.keySet();
        for(String WZRYMapKey:WZRYMapSet){
            System.out.println(WZRYMapKey);
            HashMap<String, ArrayList<King>> WZRYMapValue = WZRYMap.get(WZRYMapKey);

            Set<String> WZRYMapValueSet = WZRYMapValue.keySet();
            for(String WZRYMapValueKey:WZRYMapValueSet){
                System.out.println("\t"+WZRYMapValueKey);
                ArrayList<King> WZRYMapValueValue = WZRYMapValue.get(WZRYMapValueKey);
                for(King k :WZRYMapValueValue){
                    System.out.println("\t\t"+k.getName()+"\t"+k.getAge());
                }
            }


        }

    }
}
