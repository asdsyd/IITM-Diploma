package week8;
import java.util.*;
//define class Address
class Address implements Cloneable{
    String a;
    Address(String a){
        this.a=a;
    }
    String getAddress(){
        return this.a;
    }

    @Override
    public Address clone() {
        try {
            Address clone = (Address) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
//define class Department
class Department implements Cloneable {
    String d;

    Department(String d) {
        this.d = d;
    }

    String getDepartment() {
        return this.d;
    }

    @Override
    public Department clone() throws CloneNotSupportedException{
        Department clone = (Department) super.clone();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        return clone;
    }
}
//define class Person
class Person implements Cloneable{
    String name;
    Address address;
    Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
    String getPersonAddress(){
        return this.name;
    }
    Address getAddress(){
        return this.address;
    }
    @Override
    public Person clone() throws CloneNotSupportedException{
        Person clone = (Person) super.clone();
        return clone;
    }
}




//define class Employee
class Employee extends Person implements Cloneable{
Department department;
    Employee(String name,Address address,Department department){
        super(name, address);
        this.department=department;
    }
    Department getDepartment(){
        return this.department;
    }
    public Employee clone() throws CloneNotSupportedException{
        Employee clone = new Employee( this.name,new Address(this.address.a),new Department(this.department.d));
        return clone;
    }
    void updateEmp(String address, String department){
        this.department.d=department;
        this.address.a=address;

    }
    @Override
    public String toString() {
        return super.name +" : "+ super.address.a + " : " + this.department.d;
    }
}



public class ppa1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); //read name
        String a1 = sc.next(); //read address
        String d1 = sc.next(); //read department
        String a2 = sc.next(); //read new address
        String d2 = sc.next(); //read new department
        try {
            Employee e1 = new Employee(n, new Address(a1), new Department(d1));
            Employee e2 = e1.clone();
            e1.updateEmp(a2, d2);
            System.out.println(e1 + ", " + e2);
        }
        catch(CloneNotSupportedException e) {
            System.out.println("clone() not supported");
        }
    }
}
