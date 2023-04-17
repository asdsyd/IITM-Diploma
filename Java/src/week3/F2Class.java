package week3;

import java.util.*;
class Shape{
    public int area() {
        return 0;
    }
    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape{
    private int w, h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;

    }
    @Override
    public int area(){
        return this.w*this.h;

    }
//implement Rectangle class

}

class Cube extends Shape{
    private int a;

    public Cube(int a) {
        this.a = a;

    }

    @Override
    public int volume() {
        return (int) Math.pow(this.a, 3);
    }
    //implement Cube class
}

class F2Class{
    private static void caller(Shape s) {
        if (s.getClass().getName().compareTo("WEEK3.Rectangle") == 0) {
            //check if s is of type Rectangle
            System.out.println("I am in this");
            System.out.println(s.area());
        }
        if ( s.getClass().getName().compareTo("WEEK3.Cube") == 0) {
            //check if s is of type Cube
            System.out.println("I am in this cube");
            System.out.println(s.volume());
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        caller(new Rectangle(w, h));
        caller(new Cube(a));
    }
}