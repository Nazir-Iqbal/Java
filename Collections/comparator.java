import java.util.*;

// implementing the comparable interface
class Students /*implements Comparable<Students>*/{
    String name;
    int age;
    // constructor
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // this is the to _string function
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }


    // public int compareTo(Students that) {
    //     if(this.age > that.age) return 1;
    //     else return -1;
    // }
    
    
}

class demo{
    public static void main(String[] args){
        
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer x,Integer y){
        //         // +ve means swap and negative means no swap
        //         if(x%10 > y%10) return 1;
        //         else return -1;
        //     }
        // };

        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(21);
        // arr.add(19);
        // arr.add(15);
        // arr.add(14);
        // arr.add(12);

        // using the sort function available in collecitons
        // Collections.sort(arr,(x,y)-> x%10 > y%10? 1: -1); // wrote the comparator function using lambda function

        // System.out.println(arr);

        ArrayList<Students> arr = new ArrayList<>();
        arr.add(new Students("Nitin", 15));
        arr.add(new Students("Rohit", 12));
        arr.add(new Students("Nazir", 22));
        arr.add(new Students("Mohan", 21));

        // or you can implement comparator instead of comparable
        Collections.sort(arr, (i,j)->(i.age > j.age)?1:-1);

        for(var student : arr) System.out.println(student);
    }
}