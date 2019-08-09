package HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap<String,Student>
 *     键：String     学号
 *     值：Student    学生对象
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,Student> hm = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("周星驰",27);
        Student s2 = new Student("刘德华",25);
        Student s3 = new Student("周润发",22);
        Student s4 = new Student("梁朝伟",26);

        hm.put("001",s1);
        hm.put("002",s2);
        hm.put("003",s3);
        hm.put("004",s4);

        //遍历
        Set<String> set = hm.keySet();
        for(String key:set){
            Student value = hm.get(key);
            System.out.println(key+"---"+value.getName()+"---"+value.getAge());
        }


    }
}
