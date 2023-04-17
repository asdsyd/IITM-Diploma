package week7;

import java.util.*;
class ppa2{

    //implement function replace()
    public static char[] replace(char[] s, int i, char c) throws ArrayIndexOutOfBoundsException{
            if (i<0){
                throw new ArrayIndexOutOfBoundsException("Anythng");
            } else if (i > s.length-1) {
                s[s.length-1]=c;
            } else {
                s[i]=c ;

            }
            return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int i = sc.nextInt();
        char c = sc.next().charAt(0);
        try {
            String s2 = new String(replace(s1.toCharArray(), i, c));
            System.out.println(s2);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}