package WEEK3;

import java.util.*;
class Point{
    private int x, y;
 // implement the constructor and 
    // override the toString() and equals() methods
     Point (int x, int y){
        setx(x);
        sety(y);
        
    }

        public String toString(){
            return this.x + " " + this.y;
        }
        

        public boolean equals(Point p1){
            if ( this.x == p1.x && this.y == p1.y){
                return true;
            }
            return false;
        }
    
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
}

class pasha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
	    
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
		
        if(p1.equals(p2))
            System.out.println(p1 + "==" + p2);
        else
            System.out.println(p1 + "!=" + p2);
    }
}