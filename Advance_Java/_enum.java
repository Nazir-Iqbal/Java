// enum Status
// {
//     Running,Failed,Pending,Sucess;
// }


// public class _enum {
//     public static void main(String[] args){
//         // Status s = Status.Pending; // acess single value
//         Status[] s = Status.values();
//         // printing all the values and there ordinal points in the java
//         for(Status val : s){
//             System.out.println(val+" : "+val.ordinal());
//         }
//     }
// }


enum Laptop
{
    Inspiron(1000),Mackbook(2000),Gamer(1500);

    // private constructor
    private int price;
    private Laptop(int price){
        this.price  = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class _enum{
    public static void main(String[] args){
        // Laptop lap = Laptop.Mackbook;
        // System.out.println(lap.getPrice());
        for(Laptop val : Laptop.values()){
            System.out.println(val + " : " + val.getPrice());
        }
    }
}