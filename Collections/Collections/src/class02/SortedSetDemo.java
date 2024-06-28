package class02;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable{
    String name;
    Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
//        return 0;
        Student student = (Student) o;
        Integer id = student.getId();
//        return Integer.compare(this.id,id);
        if(this.id > id){
            return 1;
        }else if(this.id < id){
            return -1;
        }else{
            return 0;
        }
    }
}

class Mycomp implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1= (Student) o1;
        Student s2 = (Student) o2;
        Integer id1 = s1.getId();
        Integer id2 = s2.getId();
        if(id1 > id2){
            return 1;
       }else if(id1 < id2){
            return -1;
        }else{
            return 0;
        }

    }
}

public class SortedSetDemo {
    public static void main(String[] args) {
//        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        SortedSet<Student> sortedSet = new TreeSet<>(new Mycomp());

      sortedSet.add(new Student("sumit",8));
      sortedSet.add(new Student("amit",10));
      sortedSet.add(new Student("twinkle",5));

        System.out.println(sortedSet);


//        sortedSet.add(30);
//        sortedSet.add(2);
//        sortedSet.add(50);
//        sortedSet.add(8);
//        sortedSet.add(10);
//        System.out.println(sortedSet);

    }
}
