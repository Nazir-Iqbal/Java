import java.util.*;
// import java.util.function.Consumer;

class Demo{
    public static void main(String[] args){
        // Introduction to te stream API
        List<Integer> arr = Arrays.asList(9,8,4,5,7,2,3);
        
        // foreach loop
        // Consumer<Integer> con = new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        arr.forEach(n->System.out.println(n));
    }
}