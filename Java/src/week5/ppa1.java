package week5;
import java.lang.reflect.*;
import java.util.*;
class ClassStats{
    public static int getPubMethodCount(String cname) {
        try {
            //add code to return the count of
            //public methods in the given class
            Class<?> cls = Class.forName(cname);
            Method[] methods = cls.getMethods();
            int count = 0;
            for (Method method : methods) {
                if (Modifier.isPublic(method.getModifiers())) {
                    count++;
                }
            }
            return count;

        }catch(Exception e) { return -1; }
    }
    public static int getAllMethodCount(String cname) {
        try {
            //add code to return the count of all
            //declared methods in the given class
            Class<?> cls = Class.forName(cname);
            Method methods[] = cls.getDeclaredMethods();
            return methods.length;
        }catch(Exception e) { return -1; }
    }
    public static int getPubFieldCount(String cname) {
        try {
            //add code to return the count of
            //public fields (instance variables) in the given class
            Class<?> cls = Class.forName(cname);
            Field[] fields = cls.getFields();
            int count = 0;
            for(Field field:fields){
                if(Modifier.isPublic(field.getModifiers())){
                    count++;
                }
            }
            return count;

        }catch(Exception e) { return -1; }
    }
    public static int getAllFieldCount(String cname) {
        try {
            //add code to return the count of
            //all fields (instance variables) in the given class
            Class<?> cls = Class.forName(cname);
            Field[] fields = cls.getDeclaredFields();
            return fields.length;

        }catch(Exception e) { return -1; }
    }
    public static int getPubContCount(String cname) {
        try {
            //add code to return the count of
            //public constructors in the given class
            Class<?> cls = Class.forName(cname);
            Constructor[] constructors = cls.getConstructors();
            int count=0;
            for (Constructor<?> constructor : constructors){
                if(Modifier.isPublic(constructor.getModifiers())){
                    count++;
                }
            }
            return count;
        }catch(Exception e) { return -1; }
    }
    public static int getAllContCount(String cname) {
        try {
            //add code to return the count of
            //all constructors in the given class
            Class<?> cls = Class.forName(cname);
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            return constructors.length;

        }catch(Exception e) { return -1; }
    }
}

class FClass{
    public static void main(String[] args) {
        String cname;
        Scanner sc = new Scanner(System.in);
        cname = sc.nextLine();
        System.out.println("Constructor: " +
                ClassStats.getPubContCount(cname) + ", " +
                ClassStats.getAllContCount(cname));
        System.out.println("Fields: " +
                ClassStats.getPubFieldCount(cname) + ", " +
                ClassStats.getAllFieldCount(cname));
        System.out.println("Methods: " +
                ClassStats.getPubMethodCount(cname) + ", " +
                ClassStats.getAllMethodCount(cname));
    }
}