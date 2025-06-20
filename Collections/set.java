import java.util.*;

class Demo {
    public static void main(String[] args){
        // array list
        // Collection<Integer> nums = new HashSet<Integer>();

        // HashSet<Integer> nums = new HashSet<>();
        // TreeSet<Integer> nums = new TreeSet<>();
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(7);
        nums.add(10);
        for(int ele : nums){
            System.out.println(ele);
        }
    }
}