import java.util.*;

class Demo{

    public static void main(String[] args){
        // optional class
        List<String> names = Arrays.asList("Nazir","Nitin","Ram","Mohit");

        // to avoid the null pointer exception
        // Optional<String> ans = names.stream()
        //                             .filter(str -> str.contains("x"))
        //                             .findFirst();
        // System.out.println(ans.orElse("Not found"));

        String ans = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not found");
        System.out.println(ans);
    }

}