package LiveCodingQuestions;
import java.util.*;
//Add your code for Class Point here
class Point<T extends Number>{
    T x, y;
    public Point(T x, T y){
        this.x = x;
        this.y = y;
    }
    public Point<Double> mid(Point<?> p){
        Point<Double> pt = new Point<Double>(0.0, 0.0);
        pt.x = (this.x.doubleValue() + p.x.doubleValue()) / 2;
        pt.y = (this.y.doubleValue() + p.y.doubleValue()) / 2;
        return pt;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

public class week5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point<Integer> p1 = new Point<Integer>(sc.nextInt(), sc.nextInt());
        Point<Double> p2 = new Point<Double>(sc.nextDouble(), sc.nextDouble());
        Point<Double> p3 = p1.mid(p2);
        System.out.println(p3);
    }
}