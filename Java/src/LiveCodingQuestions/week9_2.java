package LiveCodingQuestions;

import java.util.*;
import java.util.stream.*;
public class week9_2 {
    public static Collection<String> collectData(ArrayList<String> l){
        Collection<String> obj;
        //write your code here
        obj=l.stream().filter(s -> !s.contains(",") && !s.contains(".")).distinct().collect(Collectors.toSet());
        return obj;
    }
    public static void main(String[] args) {
        var list=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        for(int i=0;i<len;i++) {
            list.add(sc.next());
        }
        System.out.println(week9_2.collectData(list));
    }
}