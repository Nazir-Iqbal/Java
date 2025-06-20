import java.util.*;

class Demo {
    public static void main(String[] args){
        // array list
        // Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(7);
        nums.add(10);
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
    }
}