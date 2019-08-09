package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections可以针对ArrayList存储基本包装类的元素排序
 * ArrayList存储自定义对象可以排序么？
 */
public class CollectionsDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("诸葛亮",21);
        Student s2 = new Student("刘备",29);
        Student s3 = new Student("张飞",28);
        Student s4 = new Student("关羽",25);
        Student s5 = new Student("赵云",22);

        //添加元素对象
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //排序
        //自然排序
        // Collections.sort(list);
        //比较器排序
        //如果同时有自然排序和比较器排序，以比较器排序为主
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
               int num = s2.getAge()-s1.getAge();
               int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
               return num2;
            }
        });


        //遍历集合
        for(Student s:list){
            System.out.println(s.getName()+"---"+s.getAge());
        }





    }
}
