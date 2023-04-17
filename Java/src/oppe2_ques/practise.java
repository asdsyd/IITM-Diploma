package oppe2_ques;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class practise {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        Stream<Integer> data = nums.stream();

        data.forEach(System.out::println);
    }
}
