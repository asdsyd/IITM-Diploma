package apr_oppe;
import java.util.*;
import java.util.stream.*;
//DEFINE class employee
class Employee{
String name;
String department;
int salary;
    Employee(String name, String department, int salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public String toString(){
        return this.name + " : " + this.department + " : " + this.salary;
    }

}

public class q1 {
//define method query
    static Stream<Employee> query(ArrayList<Employee> eList, String d, double sal){
    return eList.stream().filter(s -> d.equals(s.department) && s.salary>=sal );
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    var eList = new ArrayList<Employee>();
    eList.add(new Employee("Jack", "HR", 300000));
    eList.add(new Employee("Aria", "HR", 400000));
    eList.add(new Employee("Nora", "IT", 500000));
    eList.add(new Employee("Bella", "IT", 600000));
    eList.add(new Employee("Jacob", "IT", 700000));
    eList.add(new Employee("James", "HR", 800000));
    String d = scanner.next();
    double s = scanner.nextInt();

    var st = query(eList, d, s);
    st.forEach(n -> System.out.println(n));
}
}
