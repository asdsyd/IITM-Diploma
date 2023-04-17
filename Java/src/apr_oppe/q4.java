package apr_oppe;
import java.util.*;
class Shop{
    List<String> itemsList;
    Map<String, Integer> itemsMap = new LinkedHashMap<>();
    public Shop(List<String> l){
        itemsList = l;
    }
    public void storeToMap(){
        //Map the name of each item to its frequency count, in itemsMap
    }
    public void displayMap(){
        //Complete the code to display elements of itemsMap
    }
}
public class q4 {
    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        l.add(sc.nextLine());
        l.add(sc.nextLine());
        l.add(sc.nextLine());
        l.add(sc.nextLine());
        Shop s = new Shop(1);
        s.storeToMap();
        s.displayMap();
    }
}
