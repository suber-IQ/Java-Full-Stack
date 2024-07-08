package class05;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    String name;
    Integer id;
    Integer marks;

    public Student(String name, Integer id, Integer marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
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

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(500);
        list.add(40);
        list.add(30);
        list.add(882340);
        list.add(690);

        list.stream().filter(i->i>100)
                .forEach(System.out::println);

        System.out.println("---------------------");
        List<Integer> collect = list.stream().filter(i->i>400)
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("---------------------");
        list.stream().map(i->i+1000)
                .forEach(System.out::println);

        System.out.println("---------------------");
        Optional<Integer> max = list.stream().max((o1, o2)-> o1.compareTo(o2));
        System.out.println(max);
        System.out.println("****************************************");

        // list of Student
        List<Student> listOfStudents = Arrays.asList(
                new Student("Sumit",23,0),
                new Student("Amit",42,23),
                new Student("Akash",33,77),
                new Student("Chetan",53,96),
                new Student("Ajit",79,35),
                new Student("Priya",2,65),
                new Student("Kumari",8,73)
        );

        List<Student> collect1 = listOfStudents.stream()
                .sorted(Comparator.comparingInt(Student::getId)).collect(Collectors.toList());

        System.out.println(collect1);

    //toMap , count,min marks,course
//        math --> 2
//        eng -> 3
    }
}
