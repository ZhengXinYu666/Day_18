package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap<Student,String>
 *     键：Student
 *     值：String
 */
public class TreeDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = s1.getAge()-s2.getAge();//从低到高排序
                //次要条件
                int num2 = num==0 ? s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        Student s1 = new Student("潘安",30);
        Student s2 = new Student("柳下惠",35);
        Student s3 = new Student("唐伯虎",33);
        Student s4 = new Student("燕青",32);
        Student s5 = new Student("唐伯虎",33);

        tm.put(s1,"宋朝");
        tm.put(s2,"唐朝");
        tm.put(s3,"清朝");
        tm.put(s4,"元朝");
        tm.put(s5,"明朝");

        Set<Student> set = tm.keySet();
        for(Student key:set){
            String value = tm.get(key);
            System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
        }
    }
}
