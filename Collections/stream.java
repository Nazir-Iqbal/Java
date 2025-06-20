import java.util.*;
import java.util.stream.Stream;

class Demo {
    public static void main(String[] args){
        // stream
        // List<Integer> arr = Arrays.asList(9,8,4,5,7,2,3);

        // stream can be interated one time only
        // Stream <Integer> s1 = arr.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> 2*n);
        // int s4 = s3.reduce(0 , (c,e) -> c+e);

        // int ans = arr.stream()
        //             .filter(n -> n%2==0)
        //             .map(n -> 2*n)
        //             .reduce(0, (c,e) -> c+e);

        
        // Stream<Integer> s1 = arr.stream()
        //                         .filter(n -> n%2 == 0)
        //                         .sorted();

        // s1.forEach(n -> System.out.println(n));

        // converion maptoint

        // int ans = arr.stream()
        //             .map(n -> 2*n)
        //             .mapToInt(n->n)
        //             .sum();
        // System.out.println(ans);

        int sz = 10_000;
        List<Integer> arr = new ArrayList<>();

        Random ran = new Random();

        for(int i=0;i<sz;i++) arr.add(ran.nextInt(100));

        // sequential stream
        long startSeq = System.currentTimeMillis();
        int ans1 = arr.stream()
                    .map(n -> {
                        try{
                            Thread.sleep(1);
                        }catch(Exception e){

                        }
                        return 2*n;
                    })
                    .reduce(0, (c,e) -> c+e);
        long endSeq = System.currentTimeMillis();

        // normal stream
        long startPara = System.currentTimeMillis();
        int ans2 = arr.parallelStream()
                    .map(n -> {
                        try{
                            Thread.sleep(1);
                        }catch(Exception e){

                        }
                        return 2*n;
                    })
                    .reduce(0, (c,e)->c+e);
        long endPara = System.currentTimeMillis();

        System.out.println("Sequential: ");
        System.out.println("ans : " + ans1);
        System.out.println("Time Taken : " + (endSeq - startSeq));
        System.out.println("Sequential: ");
        System.out.println("ans : " + ans2);
        System.out.println("Time Taken : " + (endPara - startPara));
    }
}
