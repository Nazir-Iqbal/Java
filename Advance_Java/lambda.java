// @FunctionalInterface
// interface A {

//     void show(int i);
// }

@FunctionalInterface
interface A{
    int add(int i,int j);
}

public class lambda {
    public static void main(String[] args){
        // lambda function 
        // A obj1 = i -> System.out.println("In the function show : " + i);
        A obj2 = (i,j) -> i+j;
        // obj1.show(1);
        int result = obj2.add(2, 3);
        System.out.println(result);
    }
}
