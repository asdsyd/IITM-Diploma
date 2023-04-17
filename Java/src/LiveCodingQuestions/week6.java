package LiveCodingQuestions;

import java.util.*;
import java.util.stream.Stream;

class Shop{
    private String name;
    private int nsold;
    public Shop(String s, int ns){
        this.name = s;
        this.nsold = ns;
    }
    public String getName(){
        return name;
    }
    public int getItemSold(){
        return nsold;
    }
}
public class week6 {
    public static void printShopName(ArrayList<Shop> sList) {
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        String shop = "";
        int sold = 0;
// iterate through sList and add each shop object to map "m"
        for (int i = 0; i < sList.size(); i++) {
            if (m.containsKey(sList.get(i).getName())){
                m.put(sList.get(i).getName(),m.get(sList.get(i).getName())+ sList.get(i).getItemSold());
            }
            else {
                m.put(sList.get(i).getName(), sList.get(i).getItemSold());
            }
        }
        System.out.println(m);
        for(Map.Entry<String, Integer> S:m.entrySet()){
            if (S.getValue() > sold){
                shop = S.getKey();
                sold = S.getValue();
            }
        }
        System.out.println(shop+" : "+sold);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> list = new ArrayList<Shop>();
        for (int i = 0; i < 4; i++) {
            list.add(new Shop(sc.next(), sc.nextInt()));
        }
        printShopName(list);
    }
}