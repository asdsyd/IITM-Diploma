package LiveCodingQuestions;

import java.util.*;
import java.util.stream.Stream;

class Student implements Comparable<Student>{
    String name;
    int total;
    public Student(String n, int t){
        name = n;
        total = t;
    }
    public String getName(){
        return name;
    }
    public int getTotal(){
        return total;
    }
    public int compareTo(Student s){
        return this.getTotal() - s.getTotal();
    }
    public String toString(){
        return name;
    }
}
public class week9_1{
    public static void findStudent(List<Student> sList, int t){
// complete the code here

        var highest_total = sList.stream().filter(student -> student.getTotal() > t).max(Student::compareTo);
        highest_total.ifPresentOrElse(System.out::println, ()->System.out.println("no value found"));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.next(), sc.nextInt());
        Student s2 = new Student(sc.next(), sc.nextInt());
        Student s3 = new Student(sc.next(), sc.nextInt());
        Student s4 = new Student(sc.next(), sc.nextInt());
        int c = sc.nextInt();
        List<Student> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        findStudent(l, c);
    }
}