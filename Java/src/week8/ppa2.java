//package week8;
//import java.util.stream.Stream;
//import java.util.*;
//import java.text.*;
//
//class Student{
//    private int roll_num;
//    private Date dose_one = new Date();
//    private Date dose_two = new Date();
//
//    public int getRollNo() {
//        return roll_num;
//    }
//    public Student(int roll_num, String dd_str) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        this.roll_num = roll_num;
//        try {
//            dose_one = sdf.parse(dd_str);
//            dose_two = sdf.parse("30/03/2022");
//        }
//        catch(ParseException e){
//            System.out.println("Incorrect Date Format");
//        }
//    }
//    public boolean isEligible() {
//        //Complete the method definition
//    }
//}
//
////Define class StudentList here.
////Inside class StudentList, define method getEligibleList(List<Student>)
////that uses the method isEligible() in class Student to return the
////stream of eligible students.
//
////Define method isEmpty(Stream<Student>)
////that helps customizing output message
//public class ppa2{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int roll_num;
//        String dose_one_str;
//        List<Student> full_list = new ArrayList<Student>();
//
//        int num = sc.nextInt(); //Number of students
//        for (int i=0; i<num; i++) {
//            roll_num = sc.nextInt(); //Roll Number
//            dose_one_str = sc.next(); //Date of Dose One
//            Student st = new Student(roll_num, dose_one_str);
//            full_list.add(st); // Add the student to an ArrayList
//        }
//
//        StudentList list = new StudentList();
//        Stream<Student> eligible_list = list.getEligibleList(full_list);
//        if (!list.isEmpty(eligible_list)) {
//            System.out.println("The list of eligible students are: ");
//            eligible_list = list.getEligibleList(full_list);
//            eligible_list.forEach(s -> System.out.println(s.getRollNo()));
//        }
//        else {
//            System.out.println("There are no eligible students.");
//        }
//        sc.close();
//    }
//}